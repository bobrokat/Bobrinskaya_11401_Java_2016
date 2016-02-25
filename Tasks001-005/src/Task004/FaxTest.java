package Task004;

import Task004.CaseType;
import Task004.Contact;
import Task004.Fax;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class FaxTest {

    public static Fax fax;
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

        fax = new Fax("office", contacts, "Tattelecom", CaseType.plastic );

    }

    @Test
    public void  sendFaxShouldWorkCorrect(){
        assertEquals("sending Fax hi to Kate",fax.sendFax(kate, "hi") );
    }
}
