package Task010;

import Task010.Interfaces.*;


import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Alcatel extends Phone implements Lightable, Photoable, Calculatable {


    public Alcatel(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    @Override
    public String simpleCalculator() {
        return "Alcatel simple calculator mode is on";

    }

    @Override
    public String engineerCalculator() {
        return "Not Available";

    }

    @Override
    public String programmerCalculator() {
        return "Not Available";
    }

    @Override
    public String turnOnLight() {
        return "Alcatel light is on";
    }

    @Override
    public String turnOffLight() {
        return "Alcatel light is off";
    }

    @Override
    public String turnOnScreenLight() {
        return "Not Available";
    }

    @Override
    public String turnOffScreenLight() {
        return "Not Available";
    }

    @Override
    public String makePhoto() {
        return "Alcatel makes photo";
    }

    @Override
    public String makePhotoWithLight(Lightable lightable) {
        return "Not Available";
    }



    @Override
    public String makeVideo() {
        return "Alcatel makes video";
    }

    @Override
    public String makeFrontCameraPhoto() {
        return "Not Available";
    }
}
