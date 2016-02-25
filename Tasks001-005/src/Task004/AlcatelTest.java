package Task004;

import Task004.Alcatel;
import Task004.CaseType;
import Task004.Contact;
import Task004.Interfaces.Lightable;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 23.02.2016.
 */
public class AlcatelTest {
    public static Alcatel alcatel;
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
        alcatel = new Alcatel("Kate", contacts, "MTS", CaseType.aluminium);
    }

    @Test
    public void simpleCalculatorShouldWorkCorrect() {
        assertEquals("Alcatel simple calculator mode is on",alcatel.simpleCalculator() );
    }

    @Test
    public void engineerCalculatorShouldWorkCorrect() {
        assertEquals("Not Available", alcatel.engineerCalculator() );
    }

    @Test
    public void programmerCalculatorShouldWorkCorrect() {
        assertEquals("Not Available", alcatel.programmerCalculator() );
    }

    @Test
    public void turnOnLightShouldWorkCorrect() {
        assertEquals("Alcatel light is on",alcatel.turnOnLight() );
    }

    @Test
    public void turnOffLightShouldWorkCorrect() {
        assertEquals("Alcatel light is off", alcatel.turnOffLight() );
    }

    @Test
    public void turnOnScreenLightShouldWorkCorrect() {
        assertEquals( "Not Available", alcatel.turnOnScreenLight());
    }

    @Test
    public void turnOffScreenLightShouldWorkCorrect() {
        assertEquals("Not Available", alcatel.turnOffScreenLight() );
    }


    @Test
    public void makePhotoShouldWorkCorrect() {
        assertEquals("Alcatel makes photo", alcatel.makePhoto());
    }

    @Test
    public void makePhotoWithLightShouldWorkCorrect() {
        Lightable flash = mock(Lightable.class);
        assertEquals("Not Available", alcatel.makePhotoWithLight(flash) );
    }

    @Test
    public void makeVideoShouldWorkCorrect() {
        assertEquals("Alcatel makes video", alcatel.makeVideo() );
    }

    @Test
    public void makeFrontCameraPhotoShouldWorkCorrect() {
        assertEquals("Not Available", alcatel.makeFrontCameraPhoto() );
    }

}
