package Task004;

import Task004.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Iphone5 extends Phone implements IphoneBehaviour, Lightable, Photoable, Calculatable, InternetConnectable {


    public Iphone5(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    @Override
    public String connectToItunes() {
        return "Ipnone5 connected to Itunes";
    }

    @Override
    public String fingerPrintDecoding() {
        return "Iphone5 decodes your finger print";
    }

    @Override
    public String siri() {
        return "Iphone5 siri is on";
    }

    @Override
    public String listenToAppleMusic() {
        return "You are listening to Apple Music with your Iphone5";
    }

    @Override
    public String simpleCalculator() {
        return "Iphone5 simple calculator mmode is on";
    }

    @Override
    public String engineerCalculator() {
        return "Iphone5 engineer calculator mmode is on";
    }

    @Override
    public String programmerCalculator() {
        return "Not Available";
    }

    @Override
    public String turnOnLight() {
        return "Iphone5 light is on";
    }

    @Override
    public String turnOffLight() {
        return "Iphone5 light is off";
    }

    @Override
    public String turnOnScreenLight() {
        return "Iphone5 screen light is on";
    }

    @Override
    public String turnOffScreenLight() {
        return "Iphone5 screen light is off";
    }

    @Override
    public String makePhoto() {
        return "Iphone5 makes photo";
    }

    @Override
    public String makePhotoWithLight(Lightable lightable) {
        lightable.turnOnLight();
        return "Iphone5 makes photo with light";
    }


    @Override
    public String makeVideo() {
        return "Iphone5 makes video";
    }

    @Override
    public String makeFrontCameraPhoto() {
        return "Iphone5 makes selfie";
    }

    @Override
    public String useWiFi() {
        return "Your Iphone5 is connected to wifi";
    }

    @Override
    public String use3G(String mobilecompany) {
        return "Your Iphone5 uses " + mobilecompany + " 3G";
    }

    @Override
    public String use4G(String mobilecompany) {
        return "Your Iphone5 uses " + mobilecompany + " 4G";
    }


}
