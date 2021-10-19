package com.kafka.example.util;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerSend {

    public void sendData(ProducerRecord<String, String> record,  Producer producer){

        producer.send(record);
    }
}
