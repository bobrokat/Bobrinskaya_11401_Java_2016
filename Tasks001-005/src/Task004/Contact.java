package Task004;

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

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (this.getNumber() != null ? !getNumber().equals(contact.getNumber()) : contact.getNumber() != null) return false;
        if (getName() != null ? !getName().equals(contact.getName()) : contact.getName() != null) return false;
        return !(getPhoto() != null ? !getPhoto().equals(contact.getPhoto()) : contact.getPhoto() != null);

    }

}

