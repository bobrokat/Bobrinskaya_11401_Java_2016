package Task007;

import Task007.Interfaces.Lightable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 18.03.2016.
 */

@Configuration
public class JavaConfig {


    @Bean
    @Qualifier("kate")
    public Contact kate() {
        return new Contact("89274350840", "Kate", "kate's photo");
    }

    @Bean
    @Qualifier("julia")
    public Contact julia() {
        return new Contact("676858589696", "Julia");
    }

    @Bean
    @Qualifier("ma")
    public Contact ma() {
        return new Contact("865669697", "MA");
    }

    @Autowired
    @Qualifier("kate")
    Contact kate;

    @Autowired
    @Qualifier("julia")
    Contact julia;

    @Autowired
    @Qualifier("ma")
    Contact ma;

    @Bean
    public ArrayList<Contact> contact() {

        ArrayList contacts = new ArrayList<Contact>();
        contacts.add(kate);
        contacts.add(julia);
        contacts.add(ma);
        return contacts;

    }

    @Autowired
    ArrayList<Contact> contacts;

    @Bean
    public SimplePhone simplePhone() {

        return new SimplePhone("Granny", contacts, "Megafon", CaseType.plastic);
    }

    @Bean
    public AsusZenPhone5 asusZenPhone5() {
        return new AsusZenPhone5("Bobrinskaya", contacts, "Megafon", CaseType.aluminium);
    }

    @Bean
    public Alcatel alcatel() {
        return new Alcatel("Mom", contacts, "Megafon", CaseType.plastic);
    }

    @Bean
    public Nokia6300 nokia6300(){
        return new Nokia6300("Uncle Ben", contacts, "Megafon", CaseType.plastic);
    }

    @Bean
    public SonyEricsonZ550i sonyEricsonZ550i(){
        return  new SonyEricsonZ550i("Aigul", contacts, "MTS", CaseType.aluminium);
    }

    @Bean
    public Iphone4 iphone4(){
        return new Iphone4("Julia", contacts, "MTS", CaseType.glass);
    }

    @Bean
    public Iphone5 iphone5(){
        return new Iphone5("Dinar", contacts, "Beeline", CaseType.aluminium);
    }

    @Bean
    public Iphone6 iphone6(){
        return new Iphone6("Pliskin", contacts, "Megafon", CaseType.steel);
    }

    @Bean
    public Fax fax(){
        return new Fax("Ofice", contacts, "tattelekom", CaseType.plastic);
    }

    @Bean
    public GalaxyS galaxyS(){
        return new GalaxyS("Alena", contacts, "Tele2", CaseType.steel);
    }

    @Bean

    public Lightable flash(){
        return new Lightable() {
            @Override
            public void turnOnLight() {
                System.out.println("flash is on");
            }

            @Override
            public void turnOffLight() {

            }

            @Override
            public void turnOnScreenLight() {

            }

            @Override
            public void turnOffScreenLight() {

            }
        };
    }


}
