package com.kafka.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Arrays;

public class DataTransformer {

    ObjectMapper objectMapper = new ObjectMapper();
    ProducerExample producerExample = new ProducerExample();

    ConsumerExample consumerExample = new ConsumerExample();
    KafkaConsumer<String, String> kafkaConsumer = consumerExample.consumeMethod();
    public String getSendTransform() {


        kafkaConsumer.subscribe(Arrays.asList("jsontest"));
        kafkaConsumer.poll(0);
        kafkaConsumer.seekToBeginning(kafkaConsumer.assignment());

        while (true) {
            ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ZERO);

            for (ConsumerRecord<String, String> rec : records) {

                String message = rec.value();

                try {
                    Sum sum = objectMapper.readValue(message, Sum.class);
                    System.out.println(sum.getA());
                    System.out.println(sum.getB(sum.getB()));

                    sum.setA(sum.getA());
                    sum.setB(sum.getB());
                    sum.setSum(sum.getA() + sum.getB());
                    String jsnMessage = objectMapper.writeValueAsString(sum);
                    producerExample.produceMethod("jsontest1", jsnMessage);

                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}