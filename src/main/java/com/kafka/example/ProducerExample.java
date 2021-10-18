package com.kafka.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.Scanner;

public class ProducerExample {

    public void produceMethod() {

        Scanner read = new Scanner(System.in);
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        Producer producer = new KafkaProducer<String, String>(properties);

        boolean end = true;
        while(end == true){
            System.out.println("Data : ");
            String key = read.nextLine();
            ProducerRecord<String, String> rec = new ProducerRecord<String, String>("search", key);
            producer.send(rec);

            if (key.isEmpty()){
                end = false;
            }
        }





    }
}
