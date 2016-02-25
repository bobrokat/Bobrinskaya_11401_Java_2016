package Task004;

import Task004.CaseType;
import Task004.Contact;
import Task004.Interfaces.Lightable;
import Task004.Iphone4;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class Iphone4Test {
    private static Iphone4 iphone4;
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
        iphone4 = new Iphone4("Kate", contacts, "Megafon", CaseType.plastic);
    }

    @Test
    public void simpleCalculatorShouldWorkCorrect() {
        assertEquals("Iphone4 simple calculator mmode is on", iphone4.simpleCalculator() );
    }

    @Test
    public void engineerCalculatorShouldWorkCorrect() {
        assertEquals("Not Available", iphone4.engineerCalculator() );
    }

    @Test
    public void programmerCalculatorShouldWorkCorrect() {
        assertEquals("Not Available", iphone4.programmerCalculator() );
    }




    @Test
    public void makePhotoShouldWorkCorrect() {
        assertEquals("Iphone4 makes photo", iphone4.makePhoto() );
    }

    @Test
    public void makePhotoWithLightShouldWorkCorrect() {
        Lightable flash = mock(Lightable.class);
        assertEquals( "Not Available", iphone4.makePhotoWithLight(flash));
    }

    @Test
    public void makeVideoShouldWorkCorrect() {
        assertEquals("Iphone4 makes video", iphone4.makeVideo() );
    }

    @Test
    public void makeFrontCameraPhotoShouldWorkCorrect() {
        assertEquals("Iphone4 makes front camera photo", iphone4.makeFrontCameraPhoto() );
    }


    @Test
    public void useWiFiShouldWorkCorrect() {
        assertEquals("Your Iphone4 is connected to wifi", iphone4.useWiFi() );
    }

    @Test
    public void use3GShouldWorkCorrect() {
        assertEquals("Your Iphone4 uses Megafon 3G", iphone4.use3G(iphone4.getMobilecompany()));
    }

    @Test
    public void use4GShouldWorkCorrect() {
        assertEquals("Your Iphone4 uses Megafon 4G", iphone4.use4G(iphone4.getMobilecompany()) );
    }

    @Test
    public void connectToItunesShouldWorkCorrect(){
        assertEquals("Ipnone4 connected to Itunes", iphone4.connectToItunes() );
    }

    @Test
    public void fingerPrintDecodingShouldWorkCorrect(){
        assertEquals("Iphone4 decodes your finger print", iphone4.fingerPrintDecoding() );
    }

    @Test
    public void siriShouldWorkCorrect(){
        assertEquals("Iphone4 siri is on", iphone4.siri() );
    }

    @Test
    public void listenToAppleMusicShouldWorkCorrect(){
        assertEquals("You are listening to Apple Music with your Iphone4", iphone4.listenToAppleMusic());
    }

    @Test
    public void showOwnerNameShouldWorkCorrect() {
        assertEquals("Iphone4's owner is  Kate", iphone4.showownerName());
    }


}
