package com.comp.events.util;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import avro.Transaction;

import java.time.Duration;
import java.time.Instant;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class TransactionProducer {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        props.put("schema.registry.url", "http://localhost:8081");

        Producer<String, Object> producer = new KafkaProducer<>(props);

        produceTransaction(producer, "GB33BUKB20201555555555",Instant.now().toEpochMilli(), "Debit",
                "Purchase at Store A", 50.75, 0.0, 1049.25 );
        produceTransaction(producer, "GB29NWBK60161331926819", Instant.now().plus(Duration.ofDays(10)).toEpochMilli(), "Credit",
                "Salary Payment", 0.0, 1500.0, 2500.0);

        producer.flush();
        producer.close();
    }

    private static void produceTransaction(Producer<String, Object> producer, String IBAN, long timestampMillis, String paymentType,
                                           String details, double moneyOut, double moneyIn, double balance) {
        Transaction transaction = Transaction.newBuilder()
                .setIBAN(IBAN)
                .setDate(timestampMillis)
                .setPaymentType(paymentType)
                .setDetails(details)
                .setMoneyOut(moneyOut)
                .setMoneyIn(moneyIn)
                .setBalance(balance)
                .build();

        ProducerRecord<String, Object> record = new ProducerRecord<>("Transaction", IBAN, transaction);
        try {
            producer.send(record).get();
            System.out.println("Produced transaction: " + transaction);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}