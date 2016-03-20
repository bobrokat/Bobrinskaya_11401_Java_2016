package Task010;

import Task010.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 11.02.2016.
 */
public class SonyEricsonZ550i extends Phone implements Photoable, Calculatable {

    public SonyEricsonZ550i(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    @Override
    public String simpleCalculator() {
        return "SonyEricsonZ550i simple calculator mode is on";
    }

    @Override
    public String engineerCalculator() {
        return "SonyEricsonZ550i engineer calculator mode is on";
    }

    @Override
    public String programmerCalculator() {

        return "Not Available";
    }

    @Override
    public String makePhoto() {
        return "SonyEricsonZ550i makes photo";
    }

    @Override
    public String makePhotoWithLight(Lightable lightable) {
        return "Not Available";
    }

    @Override
    public String makeVideo() {
        return "SonyEricsonZ550i makes video";
    }

    @Override
    public String makeFrontCameraPhoto() {
        return "Not Available";
    }
}
