package Task010;

import Task010.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 11.02.2016.
 */
public class GalaxyS extends Phone implements AndroidBehaviour, Calculatable, Lightable, Photoable, InternetConnectable {


    public GalaxyS(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    @Override
    public String okayGoogleFunction() {

        return "say ok google to GalaxyS";
    }

    @Override
    public String connectToPlayMarket() {
        return "you are connected to Play Market";
    }

    @Override
    public String saveBataryLife() {
        return "now your GalaxyS will workLonger";
    }

    @Override
    public String simpleCalculator() {
        return "GalaxyS simple calculator mode is on";
    }

    @Override
    public String engineerCalculator() {
        return "GalaxyS engineer calculator mode is on";
    }

    @Override
    public String programmerCalculator() {
        return "GalaxyS programmer calculator mode is on";
    }

    @Override
    public String turnOnLight() {
        return "GalaxyS light is on";
    }

    @Override
    public String turnOffLight() {
        return "GalaxyS light is off";
    }

    @Override
    public String turnOnScreenLight() {
        return "GalaxyS screen light is on";
    }

    @Override
    public String turnOffScreenLight() {
        return "GalaxyS screen light is off";
    }

    @Override
    public String makePhoto() {
        return "GalaxyS makes photo";
    }

    @Override
    public String makePhotoWithLight(Lightable lightable) {
        return "GalaxyS makes photo with light";
    }

    @Override
    public String makeVideo() {

        return "GalaxyS makes video";
    }

    @Override
    public String makeFrontCameraPhoto() {
        return "GalaxyS makes selfie!!!";
    }

    @Override
    public String useWiFi() {
        return "GalaxyS is connected to wifi";
    }

    @Override
    public String use3G(String mobilecompany) {

        return "GalaxyS is using " + mobilecompany + " 3G";
    }

    @Override
    public String use4G(String mobilecompany) {
        return "GalaxyS is using " + mobilecompany + " 4G";
    }

}
