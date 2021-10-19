package com.kafka.example;

import com.kafka.example.util.ProducerSend;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.Scanner;
import com.kafka.example.util.KafkaUtils;

public class ProducerExample {



    public void produceMethod(Producer producer) {



            ProducerRecord<String, String> rec = new ProducerRecord<String, String>("search", "Hi Kafka");

            producer.send(rec);

        producer.close();

    }

}
