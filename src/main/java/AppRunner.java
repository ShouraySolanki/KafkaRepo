import com.kafka.example.ConsumerExample;
import com.kafka.example.ProducerExample;

public class AppRunner {

    public static void main(String[] args) {

        ProducerExample producerExample = new ProducerExample();
        producerExample.producerSend();

        ConsumerExample consumerExample = new ConsumerExample();
        System.out.println(consumerExample.consumeMethod());

    }
}