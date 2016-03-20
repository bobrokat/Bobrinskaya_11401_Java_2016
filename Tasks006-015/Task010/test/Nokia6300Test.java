package Task010.test;

import Task010.Contact;
import Task010.JavaConfig;
import Task010.Nokia6300;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class Nokia6300Test {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    public  Nokia6300 nokia6300 = ac.getBean(Nokia6300.class) ;
    public Contact kate = (Contact) ac.getBean("kate");
    public Contact julia = (Contact) ac.getBean("julia");
    public Contact ma = (Contact) ac.getBean("ma");




    @Test
    public void simpleCalculatorShouldWorkCorrect() {
        assertEquals("Nokia6300 simple calculator mode is on",nokia6300.simpleCalculator() );
    }

    @Test
    public void engineerCalculatorShouldWorkCorrect() {
        assertEquals("Not Available",nokia6300.engineerCalculator() );
    }

    @Test
    public void programmerCalculatorShouldWorkCorrect() {
        assertEquals("Not Available", nokia6300.programmerCalculator() );
    }

    @Test
    public void getContactsShouldWorkCorrect(){
        ArrayList<Contact> list = mock(ArrayList.class);
        when(list.size()).thenReturn(3);
        when(list.get(0)).thenReturn(julia);
        when(list.get(1)).thenReturn(kate);
        when(list.get(2)).thenReturn(ma);
        assertTrue(nokia6300.contactListsEquals(list));
    }
}
