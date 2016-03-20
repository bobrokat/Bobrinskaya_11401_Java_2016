package Task010.test;

import Task010.Contact;
import Task010.Interfaces.Lightable;
import Task010.Iphone5;
import Task010.JavaConfig;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class Iphone5Test {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    private Iphone5 iphone5 = ac.getBean(Iphone5.class);
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

    @Test
    public void simpleCalculatorShouldWorkCorrect() {
        assertEquals("Iphone5 simple calculator mmode is on", iphone5.simpleCalculator());
    }

    @Test
    public void engineerCalculatorShouldWorkCorrect() {
        assertEquals("Iphone5 engineer calculator mmode is on", iphone5.engineerCalculator());
    }

    @Test
    public void programmerCalculatorShouldWorkCorrect() {
        assertEquals("Not Available", iphone5.programmerCalculator());
    }




    @Test
    public void makePhotoShouldWorkCorrect() {
        assertEquals("Iphone5 makes photo", iphone5.makePhoto());
    }

    @Test
    public void makePhotoWithLightShouldWorkCorrect() {
        Lightable flash = mock(Lightable.class);
        assertEquals("Iphone5 makes photo with light", iphone5.makePhotoWithLight(flash));
    }

    @Test
    public void makeVideoShouldWorkCorrect() {
        assertEquals("Iphone5 makes video", iphone5.makeVideo());
    }

    @Test
    public void makeFrontCameraPhotoShouldWorkCorrect() {
        assertEquals("Iphone5 makes selfie", iphone5.makeFrontCameraPhoto());
    }


    @Test
    public void useWiFiShouldWorkCorrect() {
        assertEquals("Your Iphone5 is connected to wifi", iphone5.useWiFi());
    }

    @Test
    public void use3GShouldWorkCorrect() {
        assertEquals("Your Iphone5 uses Beeline 3G", iphone5.use3G(iphone5.getMobilecompany()));
    }

    @Test
    public void use4GShouldWorkCorrect() {
        assertEquals("Your Iphone5 uses Beeline 4G", iphone5.use4G(iphone5.getMobilecompany()));
    }

    @Test
    public void connectToItunesShouldWorkCorrect(){
        assertEquals("Ipnone5 connected to Itunes", iphone5.connectToItunes());
    }

    @Test
    public void fingerPrintDecodingShouldWorkCorrect(){
        assertEquals("Iphone5 decodes your finger print", iphone5.fingerPrintDecoding());
    }

    @Test
    public void siriShouldWorkCorrect(){
        assertEquals("Iphone5 siri is on", iphone5.siri());
    }

    @Test
    public void listenToAppleMusicShouldWorkCorrect(){
        assertEquals("You are listening to Apple Music with your Iphone5", iphone5.listenToAppleMusic());
    }

   @Test
    public void turnOnLightShouldWorkCorrect(){
       assertEquals("Iphone5 light is on", iphone5.turnOnLight());
   }
    @Test
    public void turnOffLightShouldWorkCorrect(){
        assertEquals("Iphone5 light is off", iphone5.turnOffLight());
    }
    @Test
    public void turnOnScreennLightShouldWorkCorrect(){
        assertEquals("Iphone5 screen light is on", iphone5.turnOnScreenLight());
    }
    @Test
    public void turnOffScreenLightShouldWorkCorrect(){
        assertEquals("Iphone5 screen light is off", iphone5.turnOffScreenLight());
    }



}
