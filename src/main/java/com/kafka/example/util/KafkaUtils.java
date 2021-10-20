/*
package com.kafka.example.util;

import com.kafka.example.ProducerExample;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Arrays;
import java.util.Properties;
import java.util.function.Consumer;

public class KafkaUtils {

    */
/*Producer producer = new KafkaProducer<String, String>(getProducer());
    public KafkaUtils(Producer producer) {
        super();
        this.producer = producer;
    }*//*


    public  Producer getProducer(){
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        Producer producer = new KafkaProducer<String, String>(properties);


        return producer;
    }


}
*/
