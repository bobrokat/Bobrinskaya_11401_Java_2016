package Task013;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekaterina on 19.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

      EmailSetter emailSetter = ac.getBean(EmailSetter.class);
        emailSetter.setEmail("bobrokat@gmail.com");
    }
}
