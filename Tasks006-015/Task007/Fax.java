package Task007;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 12.02.2016.
 */
public class Fax extends Phone {
    public Fax(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    void sendFax (Contact contact, String text) {
        System.out.println("sending Task007.Fax " + text +  " to " + contact.name);
    }
}
