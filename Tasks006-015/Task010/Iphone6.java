package Task010;

import Task010.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Iphone6 extends Phone implements IphoneBehaviour, Lightable, Photoable, Calculatable, InternetConnectable {


    public Iphone6(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public String showownerName(){
        return "This happy person is  " + this.getOwnername();
    }
    @Override
    public String connectToItunes() {
        return "Ipnone6 connected to Itunes";
    }

    @Override
    public String fingerPrintDecoding() {
        return "Iphone6 decodes your finger print";
    }

    @Override
    public String siri() {
        return "Iphone6 siri is on";
    }

    @Override
    public String listenToAppleMusic() {
        return "You are listening to Apple Music with your Iphone6";
    }

    @Override
    public String simpleCalculator() {
        return "Iphone6 simple calculator mmode is on";
    }

    @Override
    public String engineerCalculator() {
        return "Iphone6 engineer calculator mmode is on";
    }

    @Override
    public String programmerCalculator() {
        return "Iphone6 programmer calculator mmode is on";
    }

    @Override
    public String turnOnLight() {
        return "Iphone6 light is on";
    }

    @Override
    public String turnOffLight() {

        return "Iphone6 light is off";
    }

    @Override
    public String turnOnScreenLight() {

        return "Iphone6 screen light is on";
    }

    @Override
    public String turnOffScreenLight() {
        return "Iphone6 screen light is off";
    }

    @Override
    public String makePhoto() {

        return "Iphone6 makes photo";
    }

    @Override
    public String makePhotoWithLight(Lightable lightable) {
        lightable.turnOnLight();
        return "Iphone6 makes photo with light";
    }



    @Override
    public String makeVideo() {
        System.out.println();
        return "Iphone6 makes video";
    }

    @Override
    public String makeFrontCameraPhoto() {
        return "smile, the best Iphone makes selfie";
    }

    @Override
    public String useWiFi() {

        return "Your Iphone6 is connected to wifi";
    }

    @Override
    public String use3G(String mobilecompany) {
        return "Your Iphone6 uses " + mobilecompany + " 3G";
    }

    @Override
    public String use4G(String mobilecompany) {
        return "Your Iphone6 uses " + mobilecompany + " 4G";
    }


}
