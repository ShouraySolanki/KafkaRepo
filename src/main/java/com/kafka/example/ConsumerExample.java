package com.kafka.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class ConsumerExample {
    public String consumeMethod(){

        ObjectMapper objectMapper = new ObjectMapper();

        Properties config = new Properties();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, new StringDeserializer().getClass().getName());
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, new StringDeserializer().getClass().getName());
        config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
        config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");

        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "consumerGroup");
        config.put(ConsumerConfig.CLIENT_ID_CONFIG, "sampleConsumer");

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(config);

        kafkaConsumer.subscribe(Arrays.asList("jsontopic"));
        kafkaConsumer.poll(0);
        kafkaConsumer.seekToBeginning(kafkaConsumer.assignment());

        while (true){
            ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ZERO);

            for (ConsumerRecord<String, String> rec : records){

                String message = rec.value();

                try {
                    Sum sum =objectMapper.readValue(message, Sum.class);
                    System.out.println(sum.getA());
                    System.out.println(sum.getB());
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                /*JSONObject obj = (new JSONObject(message).getJSONObject("cust_id"));
                String pageName = obj.getString("cust_id");
*/

                //System.out.println(rec.value().getClass().getName());
                //return (rec.value());
            }

        }
    }
}
