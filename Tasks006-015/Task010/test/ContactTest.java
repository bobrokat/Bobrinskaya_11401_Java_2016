package Task010.test;

import Task010.Contact;
import Task010.JavaConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class ContactTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    public  Contact contact = (Contact) ac.getBean("kate");
    public  Contact nophoto = (Contact) ac.getBean("julia");


    @Test
    public void constructorShouldWorkCorrect(){
        assertEquals(contact.getNumber(),"89274350840" );
        assertEquals(contact.getName(), "Kate");
        assertEquals(contact.getPhoto(), "kate's photo");

    }

    @Test
    public void nophotoconstructorShouldWorkCorrect(){
        assertEquals("676858589696", nophoto.getNumber());
        assertEquals("Julia", nophoto.getName());

    }

    @Test
    public void equalsShouldWorkCorrect(){
        assertTrue(contact.equals(new Contact("89274350840", "Kate", "kate's photo")));
    }




}
