import com.kafka.example.ConsumerExample;
//import com.kafka.example.ProducerExample;
//import com.kafka.example.util.KafkaUtils;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

public class AppRunner {

    public static void main(String[] args) {


/*
        ProducerExample producerExample = new ProducerExample();
        producerExample.produceMethod("search","hi Kafka");
        producerExample.produceMethod("search","Learning");
        producerExample.produceMethod("search","Testing");
*/
        ConsumerExample consumerExample = new ConsumerExample();
        System.out.println(consumerExample.consumeMethod());

    }
}