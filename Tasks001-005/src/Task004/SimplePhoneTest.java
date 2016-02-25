package Task004;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class SimplePhoneTest {
    public static Phone phone;
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

    @Before
    public void before() {
        phone = new SimplePhone("Granny", contacts, "MTS", CaseType.plastic);
    }

    @Test
    public void constructorShouldWorkCorrect() {
        assertEquals(phone.getOwnername(), "Granny");
        assertTrue(phone.contactListsEquals(contacts));
        assertEquals(phone.getCaseType(), CaseType.plastic);
        assertEquals(phone.getMobilecompany(), "MTS");

    }


    @Test
    public void showOwnersNameShouldWorkCorrect() {
        assertEquals("My owner is Granny", phone.showownerName() );
    }

    @Test
    public void showCompanyShouldWorkCorrect() {
        assertEquals("mobile company is MTS", phone.showCompany() );
    }

    @Test
    public void callShouldWorkCorrect() {
        assertEquals("calling Julia", phone.call(julia));
    }

    @Test
    public void smsShouldWorkCorrect() {
        assertEquals("sending sms hi to Julia", phone.sms(julia, "hi") );
    }

    @Test
    public void showContactListShouldWorkCorrect() {
        ArrayList<Contact> list = mock(ArrayList.class);
        when(list.size()).thenReturn(2);
        when(list.get(0)).thenReturn(kate);
        when(list.get(1)).thenReturn(julia);
        assertTrue(phone.contactListsEquals(list));

    }

    @Test
    public void contactListsEqualsShouldWorkCorrect(){
        ArrayList<Contact> list = mock(ArrayList.class);
        when(list.size()).thenReturn(3);
        assertFalse(phone.contactListsEquals(list));
    }
}
