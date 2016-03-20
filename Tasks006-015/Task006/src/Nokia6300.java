import Interfaces.Calculatable;
import Interfaces.Lightable;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Nokia6300 extends Phone implements Lightable, Calculatable {

    public Nokia6300(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public void showContactsList (){
        ArrayList<Contact> contacts = this.getContacts();
        for (Contact contact : contacts){
            System.out.println( contact.name + " " + contact.number + " " + contact.photo);
        }
        System.out.println("Nokia! Connecting people!");
    }
    @Override
    public void simpleCalculator() {
        System.out.println("Nokia6300 simple calculator mode is on");
    }

    @Override
    public void engineerCalculator() {
        System.out.println("Not Available");
    }

    @Override
    public void programmerCalculator() {
        System.out.println("Not Available");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Nokia6300 light is on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Nokia6300 light id off");
    }

    @Override
    public void turnOnScreenLight() {
        System.out.println("Not Available");
    }

    @Override
    public void turnOffScreenLight() {
        System.out.println("Not Available");
    }
}
