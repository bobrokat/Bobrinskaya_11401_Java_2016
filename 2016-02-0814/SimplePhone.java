import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class SimplePhone extends Phone  {


    public SimplePhone(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public void showownerName(){
        System.out.println("This simple phone's owner is  " + this.getOwnername());
    }

}

