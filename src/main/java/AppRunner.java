import com.kafka.example.ConsumerExample;
import com.kafka.example.ProducerExample;
import com.kafka.example.util.KafkaUtils;

public class AppRunner {

    public static void main(String[] args) {

        KafkaUtils kafkaUtils = new KafkaUtils();
        kafkaUtils
/*
        ProducerExample producerExample = new ProducerExample();
        producerExample.producerSend();*/

        ConsumerExample consumerExample = new ConsumerExample();
        System.out.println(consumerExample.consumeMethod());

    }
}