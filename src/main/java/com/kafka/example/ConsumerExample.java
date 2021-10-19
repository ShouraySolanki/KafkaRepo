package com.kafka.example;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class ConsumerExample {

    public String consumeMethod(String topic){

        Properties config = new Properties();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, new StringDeserializer().getClass().getName());
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, new StringDeserializer().getClass().getName());
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "consumerGroup");
        config.put(ConsumerConfig.CLIENT_ID_CONFIG, "sampleConsumer");

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(config);

        kafkaConsumer.subscribe(Arrays.asList(topic));

        while (true){
            ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ZERO);

            for (ConsumerRecord<String, String> rec : records){
                //System.out.println(rec.value());
                return (rec.value());
            }

        }
    }
}
