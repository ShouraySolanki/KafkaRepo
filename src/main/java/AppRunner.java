import com.kafka.example.ConsumerExample;
import com.kafka.example.ProducerExample;
import com.kafka.example.util.KafkaUtils;

public class AppRunner {

    public static void main(String[] args) {


        ProducerExample producerExample = new ProducerExample();
        producerExample.produceMethod("hi Kafka");

        ConsumerExample consumerExample = new ConsumerExample();
        System.out.println(consumerExample.consumeMethod());

    }
}