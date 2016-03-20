package Task007;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Contact {
    String number;
    String name;
    String photo;


    public Contact (String number, String name, String photo){
        this.number = number;
        this.name = name;
        this.photo = photo;
    }

    public Contact(String number, String name) {
        this.number = number;
        this.name = name;
    }
}
