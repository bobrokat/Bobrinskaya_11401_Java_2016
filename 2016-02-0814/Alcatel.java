import Interfaces.Calculatable;
import Interfaces.Lightable;
import Interfaces.Photoable;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Alcatel extends Phone implements Lightable, Photoable, Calculatable {


    public Alcatel(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    @Override
    public void simpleCalculator() {
        System.out.println("Alcatel simple calculator mode is on");
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
        System.out.println("Alcatel light is on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Alcatel light is off");
    }

    @Override
    public void turnOnScreenLight() {
        System.out.println("Not Available");
    }

    @Override
    public void turnOffScreenLight() {
        System.out.println("Not Available");
    }

    @Override
    public void makePhoto() {
        System.out.println("Alcatel makes photo");
    }

    @Override
    public void makePhotoWithLight(Lightable lightable) {
        System.out.println("Not Available");
    }



    @Override
    public void makeVideo() {
        System.out.println("Alcatel makes video");
    }

    @Override
    public void makeFrontCameraPhoto() {
        System.out.println("Not Available");
    }
}
