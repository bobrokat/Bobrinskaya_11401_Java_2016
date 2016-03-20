package Task010;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 12.02.2016.
 */
public class Fax extends Phone {
    public Fax(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public String sendFax (Contact contact, String text) {
        return ("sending Fax " + text +  " to " + contact.getName());
    }
}
