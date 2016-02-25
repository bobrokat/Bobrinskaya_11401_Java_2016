package Task004;

import Task004.Interfaces.*;

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



    public ArrayList<Contact> getContacts() {
        Collections.sort(contacts, contactComparator);
        return contacts;
    }

    static Comparator<Contact> contactComparator = new Comparator<Contact>() {
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    @Override
    public String turnOnLight() {
        return "Zenphone5 light is on";
    }

    @Override
    public String turnOffLight() {
        return "Zenphone5 light is off";
    }

    @Override
    public String turnOnScreenLight() {
        return "Zenphone5 screen light is on";
    }

    @Override
    public String turnOffScreenLight() {

        return "Zenphone5 screen light is off";
    }


    @Override
    public String makePhoto() {
        return "Zenphone5 makes photo";
    }



    @Override
    public String makePhotoWithLight(Lightable lightable) {
        lightable.turnOnLight();

        return "Zenphone5 makes photo with light";
    }

    @Override
    public String makeVideo() {
        return "Zenphone5 makes video";
    }

    @Override
    public String makeFrontCameraPhoto() {

        return "Zenphone5 makes front camera photo";
    }

    @Override
    public String simpleCalculator() {
        return "Zenphone5 simple calculator mode is on";
    }

    @Override
    public String engineerCalculator() {

        return "Zenphone5 engineer calculator mode is on";
    }

    @Override
    public String programmerCalculator() {
        return "Zenphone5 programmer calculator mode is on";
    }

    @Override
    public String okayGoogleFunction() {
        return "say okay google to Zenphone5";
    }

    @Override
    public String connectToPlayMarket() {
        return "Zenphone5 connected to Play Market";
    }

    @Override
    public String saveBataryLife() {
        return "Zenphone5 batary life is saving";
    }

    @Override
    public String useWiFi() {

        return "Zenphone5 is connected to wifi";
    }

    @Override
    public String use3G(String mobilecompany) {
        return "Zenphone5 is using 3G with " + mobilecompany;
    }

    @Override
    public String use4G(String mobilecompany) {
        return "Not Available";
    }



    @Override
    public String addNote() {
        return "Note is added";
    }

    @Override
    public String deleteNote() {
        return "Note is deleted";
    }

    @Override
    public String editNote() {
        return "Now edit this note";
    }
}
