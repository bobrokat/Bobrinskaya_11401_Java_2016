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

    public ArrayList getContacts() {
        return contacts;
    }

    public void showownerName(){
        System.out.println("My owner is  " + this.getOwnername());
    }

    public void showCompany (){
        System.out.println("mobile company is " + this.getMobilecompany());
    }
    public  void call(Contact contact){
        System.out.println("calling " + contact.name );
    }

    public void sms(Contact contact, String text){
        System.out.println ("sending sms " +  text + " to " + contact.name);
    }

    public void showContactsList (){
        ArrayList<Contact> contacts = this.getContacts();
        for (Contact contact : contacts){
            System.out.println( contact.name + " " + contact.number + " " + contact.photo);
        }
    }



}
