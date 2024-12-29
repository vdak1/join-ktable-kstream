package com.comp.events.joiner;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Produced;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.time.Duration;

import avro.Account;
import avro.Transaction;
import avro.EnrichedTransaction;

import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class TransactionEnrichment {

    public Topology buildTopology(Properties allProps) {
        final StreamsBuilder builder = new StreamsBuilder();
        final String accountTopic = allProps.getProperty("account.topic.name");
        final String rekeyedAccountTopic = allProps.getProperty("rekeyed.account.topic.name");
        final String transactionTopic = allProps.getProperty("transaction.topic.name");
        final String enrichedTransactionTopic = allProps.getProperty("enriched.transaction.topic.name");
        final AccountTransactionJoiner joiner = new AccountTransactionJoiner();

        KStream<String, Account> accountStream = builder.<String, Account>stream(accountTopic)
                .map((key, account) -> new KeyValue<>(String.valueOf(account.getIBAN()), account));

        accountStream.to(rekeyedAccountTopic);

        KTable<String, Account> account = builder.table(rekeyedAccountTopic);

        KStream<String, Transaction> transactions = builder.<String, Transaction>stream(transactionTopic)
                .map((key, transaction) -> new KeyValue<>(String.valueOf(transaction.getIBAN()), transaction));

        KStream<String, EnrichedTransaction> enrichedTransaction = transactions.join(account, joiner);

        enrichedTransaction.to(enrichedTransactionTopic, Produced.with(Serdes.String(), enrichedTransactionAvroSerde(allProps)));

        return builder.build();
    }

    private SpecificAvroSerde<EnrichedTransaction> enrichedTransactionAvroSerde(Properties allProps) {
        SpecificAvroSerde<EnrichedTransaction> accountAvroSerde = new SpecificAvroSerde<>();
        accountAvroSerde.configure((Map)allProps, false);
        return accountAvroSerde;
    }

    public Properties loadEnvProperties(String fileName) throws IOException {
        Properties allProps = new Properties();
        FileInputStream input = new FileInputStream(fileName);
        allProps.load(input);
        input.close();

        return allProps;
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new IllegalArgumentException("This program takes one argument: the path to an environment configuration file.");
        }

        TransactionEnrichment ts = new TransactionEnrichment();
        Properties allProps = ts.loadEnvProperties(args[0]);
        allProps.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        allProps.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        Topology topology = ts.buildTopology(allProps);

        final KafkaStreams streams = new KafkaStreams(topology, allProps);
        final CountDownLatch latch = new CountDownLatch(1);

        // Attach shutdown handler to catch Control-C.
        Runtime.getRuntime().addShutdownHook(new Thread("streams-shutdown-hook") {
            @Override
            public void run() {
                streams.close(Duration.ofSeconds(5));
                latch.countDown();
            }
        });

        try {
            streams.start();
            latch.await();
        } catch (Throwable e) {
            System.exit(1);
        }
        System.exit(0);
    }
}
