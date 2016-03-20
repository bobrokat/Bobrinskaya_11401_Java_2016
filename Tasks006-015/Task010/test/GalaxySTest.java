package Task010.test;

import Task010.Contact;
import Task010.GalaxyS;
import Task010.Interfaces.Lightable;
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
public class GalaxySTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    public  GalaxyS galaxyS = ac.getBean(GalaxyS.class);
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
        assertEquals(galaxyS.simpleCalculator(), "GalaxyS simple calculator mode is on");
    }

    @Test
    public void engineerCalculatorShouldWorkCorrect() {
        assertEquals(galaxyS.engineerCalculator(), "GalaxyS engineer calculator mode is on");
    }

    @Test
    public void programmerCalculatorShouldWorkCorrect() {
        assertEquals(galaxyS.programmerCalculator(), "GalaxyS programmer calculator mode is on");
    }

    @Test
    public void turnOnLightShouldWorkCorrect() {
        assertEquals(galaxyS.turnOnLight(), "GalaxyS light is on");
    }

    @Test
    public void turnOffLightShouldWorkCorrect() {
        assertEquals(galaxyS.turnOffLight(), "GalaxyS light is off");
    }

    @Test
    public void turnOnScreenLightShouldWorkCorrect() {
        assertEquals(galaxyS.turnOnScreenLight(), "GalaxyS screen light is on");
    }

    @Test
    public void turnOffScreenLightShouldWorkCorrect() {
        assertEquals(galaxyS.turnOffScreenLight(), "GalaxyS screen light is off");
    }


    @Test
    public void makePhotoShouldWorkCorrect() {
        assertEquals(galaxyS.makePhoto(), "GalaxyS makes photo");
    }

    @Test
    public void makePhotoWithLightShouldWorkCorrect() {
        Lightable flash = mock(Lightable.class);
        assertEquals(galaxyS.makePhotoWithLight(flash), "GalaxyS makes photo with light");
    }

    @Test
    public void makeVideoShouldWorkCorrect() {
        assertEquals(galaxyS.makeVideo(), "GalaxyS makes video");
    }

    @Test
    public void makeFrontCameraPhotoShouldWorkCorrect() {
        assertEquals(galaxyS.makeFrontCameraPhoto(), "GalaxyS makes selfie!!!");
    }

    @Test
    public void okayGoogleFunctionShouldWorkCorrect() {
        assertEquals(galaxyS.okayGoogleFunction(), "say ok google to GalaxyS");
    }

    @Test
    public void connectToPlayMarketShouldWorkCorrect() {
        assertEquals(galaxyS.connectToPlayMarket(), "you are connected to Play Market");
    }

    @Test
    public void saveBataryLifeShouldWorkCorrect() {
        assertEquals(galaxyS.saveBataryLife(), "now your GalaxyS will workLonger");
    }

    @Test
    public void useWiFiShouldWorkCorrect() {
        assertEquals(galaxyS.useWiFi(), "GalaxyS is connected to wifi");
    }

    @Test
    public void use3GShouldWorkCorrect() {
        assertEquals(galaxyS.use3G(galaxyS.getMobilecompany()), "GalaxyS is using Tele2 3G");
    }

    @Test
    public void use4GShouldWorkCorrect() {
        assertEquals(galaxyS.use4G(galaxyS.getMobilecompany()), "GalaxyS is using Tele2 4G");
    }


}
