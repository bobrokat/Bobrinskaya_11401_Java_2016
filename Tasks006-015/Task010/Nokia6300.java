package Task010;

import Task010.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Nokia6300 extends Phone implements Calculatable {

    public Nokia6300(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public ArrayList<Contact> getContacts() {
        System.out.println("Nolia, connecting people");
        return contacts;
    }

    @Override
    public String simpleCalculator() {

        return "Nokia6300 simple calculator mode is on";
    }

    @Override
    public String engineerCalculator() {
        return "Not Available";
    }

    @Override
    public String programmerCalculator() {
        return "Not Available";
    }

}
