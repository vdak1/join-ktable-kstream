package com.comp.events.util;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import avro.Account;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class AccountProducer {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        props.put("schema.registry.url", "http://localhost:8081");

        Producer<String, Object> producer = new KafkaProducer<>(props);

        produceAccount(producer, "John Doe", "123 Elm St", "123456", "98765432",
                "GB33BUKB20201555555555", "BUKBGB22", "Central", "Savings");
        produceAccount(producer, "Jane Smith", "456 Oat St", "654321", "12345678",
                "GB29NWBK60161331926819", "NWBKGB22", "North", "Current");

        producer.flush();
        producer.close();
    }

    private static void produceAccount(Producer<String, Object> producer, String name, String address, String sortCode,
                                       String accountNo, String IBAN, String BIC, String branch, String accountType) {
        Account account = Account.newBuilder()
                .setName(name)
                .setAddress(address)
                .setSortCode(sortCode)
                .setAccountNo(accountNo)
                .setIBAN(IBAN)
                .setBIC(BIC)
                .setBranch(branch)
                .setAccountType(accountType)
                .build();

        ProducerRecord<String, Object> record = new ProducerRecord<>("Account", IBAN, account);
        try {
            producer.send(record).get();
            System.out.println("Produced account: " + account);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}