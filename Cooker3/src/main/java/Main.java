import com.itis.bobrinskaya.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Main {
    @Autowired
    static ProductRepository pr;
    public static void main(String[] args) {

        System.out.println(pr.findAll());
    }
}