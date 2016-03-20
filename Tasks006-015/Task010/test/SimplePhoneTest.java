package Task010.test;

import Task010.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class SimplePhoneTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    public static Phone phone;
    public Contact kate = (Contact) ac.getBean("kate");
    public Contact julia = (Contact) ac.getBean("julia");
    public Contact ma = (Contact) ac.getBean("ma");



    @Before
    public void before() {
        phone = ac.getBean(SimplePhone.class);
    }

    @Test
    public void constructorShouldWorkCorrect() {
        ArrayList<Contact> list = mock(ArrayList.class);
        when(list.size()).thenReturn(3);
        when(list.get(0)).thenReturn(kate);
        when(list.get(1)).thenReturn(julia);
        when(list.get(2)).thenReturn(ma);
        assertEquals(phone.getOwnername(), "Granny");
        assertTrue(phone.contactListsEquals(list));
        assertEquals(phone.getCaseType(), CaseType.plastic);
        assertEquals(phone.getMobilecompany(), "Megafon");

    }


    @Test
    public void showOwnersNameShouldWorkCorrect() {
        assertEquals("My owner is Granny", phone.showownerName() );
    }

    @Test
    public void showCompanyShouldWorkCorrect() {
        assertEquals("mobile company is Megafon", phone.showCompany() );
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
        when(list.size()).thenReturn(3);
        when(list.get(0)).thenReturn(kate);
        when(list.get(1)).thenReturn(julia);
        when(list.get(2)).thenReturn(ma);
        assertTrue(phone.contactListsEquals(list));

    }

    @Test
    public void contactListsEqualsShouldWorkCorrect(){
        ArrayList<Contact> list = mock(ArrayList.class);
        when(list.size()).thenReturn(3);
        when(list.get(0)).thenReturn(kate);
        when(list.get(1)).thenReturn(julia);
        when(list.get(2)).thenReturn(ma);
        assertTrue(phone.contactListsEquals(list));
    }
}
