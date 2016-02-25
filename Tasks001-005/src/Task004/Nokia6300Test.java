package Task004;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class Nokia6300Test {
    public static Nokia6300 nokia6300;
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

        nokia6300 = new Nokia6300("Allie", contacts, "Beeline", CaseType.steel);
    }

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
        assertTrue(nokia6300.contactListsEquals(contacts));
    }
}
