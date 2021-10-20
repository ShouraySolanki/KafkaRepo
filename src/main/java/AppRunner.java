import com.kafka.example.ConsumerExample;
import com.kafka.example.DataTransformer;
import com.kafka.example.ProducerExample;
//import com.kafka.example.util.KafkaUtils;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

public class AppRunner {

    public static void main(String[] args) {

        DataTransformer dataTransformer = new DataTransformer();
        System.out.println(dataTransformer.getSendTransform());

    }
}