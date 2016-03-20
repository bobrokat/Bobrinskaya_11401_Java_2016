package Task010.test;

import Task010.Contact;
import Task010.Interfaces.Lightable;
import Task010.JavaConfig;
import Task010.SonyEricsonZ550i;
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
public class SonyEricsonZ550iTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    public  SonyEricsonZ550i sonyEricsonZ550i = ac.getBean(SonyEricsonZ550i.class);
    public static Contact kate;
    public static Contact julia;
    public static ArrayList contacts;

    @BeforeClass
    public static void beforeclass() {
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
    public void simpleCalculatorShouldWorkCorrect() {
        assertEquals("SonyEricsonZ550i simple calculator mode is on", sonyEricsonZ550i.simpleCalculator() );
    }

    @Test
    public void engineerCalculatorShouldWorkCorrect() {
        assertEquals("SonyEricsonZ550i engineer calculator mode is on", sonyEricsonZ550i.engineerCalculator() );
    }

    @Test
    public void programmerCalculatorShouldWorkCorrect() {
        assertEquals("Not Available",sonyEricsonZ550i.programmerCalculator());
    }


    @Test
    public void makePhotoShouldWorkCorrect() {
        assertEquals("SonyEricsonZ550i makes photo", sonyEricsonZ550i.makePhoto() );
    }

    @Test
    public void makePhotoWithLightShouldWorkCorrect() {
        Lightable flash = mock(Lightable.class);
        assertEquals("Not Available", sonyEricsonZ550i.makePhotoWithLight(flash) );
    }

    @Test
    public void makeVideoShouldWorkCorrect() {
        assertEquals("SonyEricsonZ550i makes video", sonyEricsonZ550i.makeVideo());
    }

    @Test
    public void makeFrontCameraPhotoShouldWorkCorrect() {
        assertEquals("Not Available", sonyEricsonZ550i.makeFrontCameraPhoto() );
    }

}
