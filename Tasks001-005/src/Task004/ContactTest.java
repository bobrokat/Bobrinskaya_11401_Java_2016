package Task004;

import Task004.Contact;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class ContactTest {
    public static Contact contact;
    public static Contact nophoto;

    @BeforeClass
    public static void beforeclass(){
        contact = new Contact("980777765", "Aig", "photo");
        nophoto = new Contact("980777765", "Aig");
    }

    @Test
    public void constructorShouldWorkCorrect(){
        assertEquals(contact.getNumber(),"980777765" );
        assertEquals(contact.getName(), "Aig");
        assertEquals(contact.getPhoto(), "photo");

    }

    @Test
    public void nophotoconstructorShouldWorkCorrect(){
        assertEquals("980777765", nophoto.getNumber());
        assertEquals("Aig", nophoto.getName());

    }

    @Test
    public void equalsShouldWorkCorrect(){
        assertTrue(contact.equals(new Contact("980777765", "Aig", "photo")));
    }




}
