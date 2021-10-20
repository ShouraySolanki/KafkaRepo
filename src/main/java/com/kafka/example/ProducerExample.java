/*
package com.kafka.example;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.kafka.example.util.KafkaUtils;

public class ProducerExample {


    KafkaUtils kafkaUtils = new KafkaUtils();
    Producer producer = kafkaUtils.getProducer();

    public void produceMethod(String topic, String message){


        //ProducerRecord<String, String> rec =new ProducerRecord<String, String>(topic, message);

        producer.send(new ProducerRecord<String, String>(topic, message));

        producer.close();


    }

*/
/*
    public void produceMethod(Producer producer) {



            ProducerRecord<String, String> rec = new ProducerRecord<String, String>("search", "Hi Kafka");

            producer.send(rec);

        producer.close();

    }*//*


}
*/
