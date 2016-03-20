package Task007;

import Task007.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Iphone5 extends Phone implements IphoneBehaviour, Lightable, Photoable, Calculatable, InternetConnectable {


    public Iphone5(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    @Override
    public void connectToItunes() {
        System.out.println("Ipnone5 connected to Itunes");
    }

    @Override
    public void fingerPrintDecoding() {
        System.out.println("Task007.Iphone5 decodes your finger print");
    }

    @Override
    public void siri() {
        System.out.println("Task007.Iphone5 siri is on");
    }

    @Override
    public void listenToAppleMusic() {
        System.out.println("You are listening to Apple Music with your Task007.Iphone5");
    }

    @Override
    public void simpleCalculator() {
        System.out.println("Task007.Iphone5 simple calculator mmode is on");
    }

    @Override
    public void engineerCalculator() {
        System.out.println("Task007.Iphone5 engineer calculator mmode is on");
    }

    @Override
    public void programmerCalculator() {
        System.out.println("Not Available");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Task007.Iphone5 light is on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Task007.Iphone5 light is off");
    }

    @Override
    public void turnOnScreenLight() {
        System.out.println("Task007.Iphone5 screen light is on");
    }

    @Override
    public void turnOffScreenLight() {
        System.out.println("Task007.Iphone5  screen light is on");
    }

    @Override
    public void makePhoto() {
        System.out.println("Task007.Iphone5 makes photo");
    }

    @Override
    public void makePhotoWithLight(Lightable lightable) {
        lightable.turnOnLight();
        System.out.println("Task007.Iphone5 makes photo with light");
    }


    @Override
    public void makeVideo() {
        System.out.println("Task007.Iphone5 makes video");
    }

    @Override
    public void makeFrontCameraPhoto() {
        System.out.println("Task007.Iphone5 makes selfie");
    }

    @Override
    public void useWiFi() {
        System.out.println("Your Task007.Iphone5 is connected to wifi");
    }

    @Override
    public void use3G(String mobilecompany) {
        System.out.println("Your Task007.Iphone5 uses " + mobilecompany + " 3G");
    }

    @Override
    public void use4G(String mobilecompany) {
        System.out.println("Your Task007.Iphone5 uses " + mobilecompany + " 4G");
    }

    @Override
    public void useAsWAP() {
        System.out.println("Your Task007.Iphone5 is WAP");
    }
}
