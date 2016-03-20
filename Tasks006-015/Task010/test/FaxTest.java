package Task010.test;

import Task010.Contact;
import Task010.Fax;
import Task010.JavaConfig;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class FaxTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    public  Fax fax = ac.getBean(Fax.class);
    public static Contact kate;
    public static Contact julia;
    public static ArrayList contacts;
    @BeforeClass
    public static void beforeclass(){
        kate = mock(Contact.class);
        when(kate.getName()).thenReturn("Kate");
        when(kate.getNumber()).thenReturn("8944322344");
        when(kate.getPhoto()).thenReturn("kate's photo");
        julia = mock(Contact.class);
        when(julia.getName()).thenReturn("Julia");
        when(julia.getNumber()).thenReturn("89475869707");
        contacts = new ArrayList();
        contacts.add(kate);
        contacts.add(julia);


    }

    @Test
    public void  sendFaxShouldWorkCorrect(){
        assertEquals("sending Fax hi to Kate",fax.sendFax(kate, "hi") );
    }
}
