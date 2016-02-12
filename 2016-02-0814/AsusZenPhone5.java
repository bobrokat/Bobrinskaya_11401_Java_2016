import Interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class AsusZenPhone5 extends Phone implements Lightable, Photoable, Calculatable, AndroidBehaviour, InternetConnectable, Notificatable {


    public AsusZenPhone5(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public void showContactsList() {
        ArrayList<Contact> contacts = this.getContacts();
        Collections.sort(contacts, contactComparator);
        for (Contact contact : contacts) {
            System.out.println(contact.name + " " + contact.number + " " + contact.photo);
        }
    }

    static Comparator<Contact> contactComparator = new Comparator<Contact>() {
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    @Override
    public void turnOnLight() {
        System.out.println("Zenphone5 light is on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Zenphone5 light is off");
    }

    @Override
    public void turnOnScreenLight() {
        System.out.println("Zenphone5 screen light is on");
    }

    @Override
    public void turnOffScreenLight() {
        System.out.println("Zenphone5 screen light is off");
    }


    @Override
    public void makePhoto() {
        System.out.println("Zenphone5 makes photo");
    }



    @Override
    public void makePhotoWithLight(Lightable lightable) {
        lightable.turnOnLight();
        System.out.println("Zenphone5 makes photo with light");

    }

    @Override
    public void makeVideo() {
        System.out.println("Zenphone5 makes video");
    }

    @Override
    public void makeFrontCameraPhoto() {
        System.out.println("Zenphone5 makes front camera photo");
    }

    @Override
    public void simpleCalculator() {
        System.out.println("Zenphone5 simple calculator mode is on");
    }

    @Override
    public void engineerCalculator() {
        System.out.println("Zenphone5 engineer calculator mode is on");
    }

    @Override
    public void programmerCalculator() {
        System.out.println("Zenphone5 programmer calculator mode is on");
    }

    @Override
    public void okayGoogleFunction() {
        System.out.println("say okay google to Zenphone5");
    }

    @Override
    public void connectToPlayMarket() {
        System.out.println("Zenphone5 connected to Play Market");
    }

    @Override
    public void saveBataryLife() {
        System.out.println("Zenphone5 batary life is saving");
    }

    @Override
    public void useWiFi() {
        System.out.println("Zenphone5 is connected to wifi");
    }

    @Override
    public void use3G(String mobilecompany) {
        System.out.println("Zenphone5 is using 3G with " + mobilecompany);
    }

    @Override
    public void use4G(String mobilecompany) {
        System.out.println("Zenphone5 is using 4G with " + mobilecompany);
    }

    @Override
    public void useAsWAP() {
        System.out.println("Zenphone5 is WAP");
    }

    @Override
    public void addNote() {
        System.out.println("Note is added");
    }

    @Override
    public void deleteNote() {
        System.out.println("Note is deleted");
    }

    @Override
    public void editNote() {
        System.out.println("Now edit this note");
    }
}
