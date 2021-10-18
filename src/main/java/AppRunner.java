import com.kafka.example.ConsumerExample;
import com.kafka.example.ProducerExample;

public class AppRunner {

    public static void main(String[] args) {

        ProducerExample producerExample = new ProducerExample();
        producerExample.produceMethod();

        ConsumerExample consumerExample = new ConsumerExample();
        consumerExample.consumeMethod();

    }
}