package Task010.test;

import Task010.Contact;
import Task010.Interfaces.Lightable;
import Task010.Iphone6;
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
public class Iphone6Test {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    private Iphone6 iphone6 = ac.getBean(Iphone6.class);
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
        assertEquals("Iphone6 simple calculator mmode is on", iphone6.simpleCalculator());
    }

    @Test
    public void engineerCalculatorShouldWorkCorrect() {
        assertEquals("Iphone6 engineer calculator mmode is on", iphone6.engineerCalculator());
    }

    @Test
    public void programmerCalculatorShouldWorkCorrect() {
        assertEquals("Iphone6 programmer calculator mmode is on", iphone6.programmerCalculator());
    }




    @Test
    public void makePhotoShouldWorkCorrect() {
        assertEquals("Iphone6 makes photo", iphone6.makePhoto());
    }

    @Test
    public void makePhotoWithLightShouldWorkCorrect() {
        Lightable flash = mock(Lightable.class);
        assertEquals("Iphone6 makes photo with light", iphone6.makePhotoWithLight(flash));
    }

    @Test
    public void makeVideoShouldWorkCorrect() {
        assertEquals("Iphone6 makes video", iphone6.makeVideo());
    }

    @Test
    public void makeFrontCameraPhotoShouldWorkCorrect() {
        assertEquals("smile, the best Iphone makes selfie", iphone6.makeFrontCameraPhoto());
    }


    @Test
    public void useWiFiShouldWorkCorrect() {
        assertEquals("Your Iphone6 is connected to wifi", iphone6.useWiFi());
    }

    @Test
    public void use3GShouldWorkCorrect() {
        assertEquals("Your Iphone6 uses Megafon 3G", iphone6.use3G(iphone6.getMobilecompany()));
    }

    @Test
    public void use4GShouldWorkCorrect() {
        assertEquals("Your Iphone6 uses Megafon 4G", iphone6.use4G(iphone6.getMobilecompany()));
    }

    @Test
    public void connectToItunesShouldWorkCorrect(){
        assertEquals("Ipnone6 connected to Itunes", iphone6.connectToItunes());
    }

    @Test
    public void fingerPrintDecodingShouldWorkCorrect(){
        assertEquals("Iphone6 decodes your finger print", iphone6.fingerPrintDecoding());
    }

    @Test
    public void siriShouldWorkCorrect(){
        assertEquals("Iphone6 siri is on", iphone6.siri());
    }

    @Test
    public void listenToAppleMusicShouldWorkCorrect(){
        assertEquals("You are listening to Apple Music with your Iphone6", iphone6.listenToAppleMusic());
    }

    @Test
    public void turnOnLightShouldWorkCorrect(){
        assertEquals("Iphone6 light is on", iphone6.turnOnLight());
    }
    @Test
    public void turnOffLightShouldWorkCorrect(){
        assertEquals("Iphone6 light is off", iphone6.turnOffLight());
    }
    @Test
    public void turnOnScreennLightShouldWorkCorrect(){
        assertEquals("Iphone6 screen light is on", iphone6.turnOnScreenLight());
    }
    @Test
    public void turnOffScreenLightShouldWorkCorrect(){
        assertEquals("Iphone6 screen light is off", iphone6.turnOffScreenLight());
    }

    @Test
    public void showOwnerNameShouldWorkCorrect(){
        assertEquals("This happy person is  Pliskin", iphone6.showownerName());
    }

}
