package Task010.test;

import Task010.AsusZenPhone5;
import Task010.Contact;
import Task010.Interfaces.Lightable;
import Task010.JavaConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 24.02.2016.
 */
public class AsusZenPhone5Test {

    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    public  AsusZenPhone5 asusZenPhone5 = ac.getBean(AsusZenPhone5.class);
    public Contact kate = (Contact) ac.getBean("kate");
    public Contact julia = (Contact) ac.getBean("julia");
    public Contact ma = (Contact) ac.getBean("ma");
    public static ArrayList contacts;




    @Test
    public void simpleCalculatorShouldWorkCorrect() {
        assertEquals("Zenphone5 simple calculator mode is on", asusZenPhone5.simpleCalculator() );
    }

    @Test
    public void engineerCalculatorShouldWorkCorrect() {
        assertEquals( "Zenphone5 engineer calculator mode is on", asusZenPhone5.engineerCalculator());
    }

    @Test
    public void programmerCalculatorShouldWorkCorrect() {
        assertEquals("Zenphone5 programmer calculator mode is on", asusZenPhone5.programmerCalculator() );
    }

    @Test
    public void turnOnLightShouldWorkCorrect() {
        assertEquals("Zenphone5 light is on", asusZenPhone5.turnOnLight() );
    }

    @Test
    public void turnOffLightShouldWorkCorrect() {
        assertEquals("Zenphone5 light is off", asusZenPhone5.turnOffLight() );
    }

    @Test
    public void turnOnScreenLightShouldWorkCorrect() {
        assertEquals("Zenphone5 screen light is on", asusZenPhone5.turnOnScreenLight() );
    }

    @Test
    public void turnOffScreenLightShouldWorkCorrect() {
        assertEquals("Zenphone5 screen light is off", asusZenPhone5.turnOffScreenLight() );
    }


    @Test
    public void makePhotoShouldWorkCorrect() {
        assertEquals("Zenphone5 makes photo", asusZenPhone5.makePhoto() );
    }

    @Test
    public void makePhotoWithLightShouldWorkCorrect() {
        Lightable flash = mock(Lightable.class);
        assertEquals("Zenphone5 makes photo with light", asusZenPhone5.makePhotoWithLight(flash) );
    }

    @Test
    public void makeVideoShouldWorkCorrect() {
        assertEquals("Zenphone5 makes video", asusZenPhone5.makeVideo() );
    }

    @Test
    public void makeFrontCameraPhotoShouldWorkCorrect() {
        assertEquals("Zenphone5 makes front camera photo", asusZenPhone5.makeFrontCameraPhoto());
    }

    @Test
    public void okayGoogleFunctionShouldWorkCorrect() {
        assertEquals("say okay google to Zenphone5", asusZenPhone5.okayGoogleFunction() );
    }

    @Test
    public void connectToPlayMarketShouldWorkCorrect() {
        assertEquals("Zenphone5 connected to Play Market", asusZenPhone5.connectToPlayMarket() );
    }

    @Test
    public void saveBataryLifeShouldWorkCorrect() {
        assertEquals( "Zenphone5 batary life is saving", asusZenPhone5.saveBataryLife());
    }

    @Test
    public void useWiFiShouldWorkCorrect() {
        assertEquals( "Zenphone5 is connected to wifi", asusZenPhone5.useWiFi());
    }

    @Test
    public void use3GShouldWorkCorrect() {
        assertEquals("Zenphone5 is using 3G with Megafon", asusZenPhone5.use3G( asusZenPhone5.getMobilecompany()) );
    }

    @Test
    public void use4GShouldWorkCorrect() {
        assertEquals("Not Available",asusZenPhone5.use4G( asusZenPhone5.getMobilecompany()) );
    }

    @Test
    public void addNoteShouldWorkCorrect() {
        assertEquals("Note is added", asusZenPhone5.addNote() );
    }

    @Test

    public void deleteNoteShouldWorkCorrect() {
        assertEquals("Note is deleted",asusZenPhone5.deleteNote() );
    }


    @Test
    public void editNoteShouldWorkCorrect() {
        assertEquals("Now edit this note",asusZenPhone5.editNote() );
    }

    @Test
    public void getContactsShouldWorkCorrect(){
        ArrayList<Contact> list = mock(ArrayList.class);
        when(list.size()).thenReturn(3);
        when(list.get(0)).thenReturn(julia);
        when(list.get(1)).thenReturn(kate);
        when(list.get(2)).thenReturn(ma);
        assertTrue(asusZenPhone5.contactListsEquals(list));
    }


}
