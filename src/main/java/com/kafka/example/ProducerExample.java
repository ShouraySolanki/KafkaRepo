
package com.kafka.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.kafka.example.util.KafkaUtils;

import java.util.ArrayList;

public class ProducerExample {



    KafkaUtils kafkaUtils = new KafkaUtils();
    Producer producer = kafkaUtils.getProducer();

    public void produceMethod(String topic, String message) {


        //ProducerRecord<String, String> rec =new ProducerRecord<String, String>(topic, message);
        /*Sum sumObj = new Sum();



            try {
                Sum sum = objectMapper.readValue(s, Sum.class);

                sumObj.setA(sum.getA());
                sumObj.setB(sum.getB());
                sumObj.setSum(sum.getA() + sum.getB());
                //String message = objectMapper.writeValueAsString(sumObj);


            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }*/

        producer.send(new ProducerRecord<String, String>(topic, message));

        //producer.close();


    }
}

/*
    public void produceMethod(Producer producer) {



            ProducerRecord<String, String> rec = new ProducerRecord<String, String>("search", "Hi Kafka");

            producer.send(rec);

        producer.close();

    }*//*


}
*/
