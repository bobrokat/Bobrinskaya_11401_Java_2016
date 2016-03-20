package Task010;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public abstract class Phone {
    String ownername;
    ArrayList contacts = new ArrayList<Contact>();
    String mobilecompany;
    CaseType caseType;

    public Phone(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        this.ownername = ownername;
        this.contacts = contacts;
        this.mobilecompany = mobilecompany;
        this.caseType = caseType;
    }

    public CaseType getCaseType() {
        return caseType;
    }

    public String getOwnername() {
        return ownername;
    }

    public String getMobilecompany() {
        return mobilecompany;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public String showownerName(){
        return "My owner is " + this.getOwnername();
    }

    public String showCompany (){
        return "mobile company is " + this.getMobilecompany();
    }
    public  String call(Contact contact){
        return ("calling " + contact.getName() );
    }

    public String sms(Contact contact, String text){
        return ("sending sms " +  text + " to " + contact.getName());
    }


    public boolean contactListsEquals (ArrayList<Contact> contacts){
        boolean flag = false;
        int i = 0;
        if (this.getContacts().size() != contacts.size()){
            return false;
        }

        for(Contact contact : this.getContacts()){
            if(contact.equals(contacts.get(i))){
                flag = true;
            }
            i++;
        }
        return flag;
    }





}
