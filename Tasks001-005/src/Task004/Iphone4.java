package Task004;

import Task004.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Iphone4 extends Phone implements IphoneBehaviour, Photoable, Calculatable, InternetConnectable{


    public Iphone4(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public String showownerName(){
        return "Iphone4's owner is  " + this.getOwnername();
    }

    @Override
    public String connectToItunes() {
        return "Ipnone4 connected to Itunes";
    }

    @Override
    public String fingerPrintDecoding() {
        return "Iphone4 decodes your finger print";
    }

    @Override
    public String siri() {
        return "Iphone4 siri is on";
    }

    @Override
    public String listenToAppleMusic() {
        return "You are listening to Apple Music with your Iphone4";
    }

    @Override
    public String simpleCalculator() {
        return "Iphone4 simple calculator mmode is on";
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
    public String makePhoto() {
        return "Iphone4 makes photo";
    }

    @Override
    public String makePhotoWithLight(Lightable lightable) {

        return "Not Available";
    }

    @Override
    public String makeVideo() {
        return "Iphone4 makes video";
    }

    @Override
    public String makeFrontCameraPhoto() {
        return "Iphone4 makes front camera photo";
    }

    @Override
    public String useWiFi() {

        return "Your Iphone4 is connected to wifi";
    }

    @Override
    public String use3G(String mobilecompany) {
        return "Your Iphone4 uses " + mobilecompany + " 3G";
    }

    @Override
    public String use4G(String mobilecompany) {
        return "Your Iphone4 uses " + mobilecompany + " 4G";
    }


}
