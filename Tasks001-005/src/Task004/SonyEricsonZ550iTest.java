package Task004;

import Task004.Interfaces.Lightable;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class SonyEricsonZ550iTest {
    public static SonyEricsonZ550i sonyEricsonZ550i;
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

        sonyEricsonZ550i = new SonyEricsonZ550i("Gatin", contacts, "Tele2", CaseType.steel);
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
