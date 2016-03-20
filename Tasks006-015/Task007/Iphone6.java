package Task007;

import Task007.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Iphone6 extends Phone implements IphoneBehaviour, Lightable, Photoable, Calculatable, InternetConnectable {


    public Iphone6(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public void showownerName(){
        System.out.println("This happy person is  " + this.getOwnername());
    }
    @Override
    public void connectToItunes() {
        System.out.println("Ipnone6 connected to Itunes");
    }

    @Override
    public void fingerPrintDecoding() {
        System.out.println("Task007.Iphone6 decodes your finger print");
    }

    @Override
    public void siri() {
        System.out.println("Task007.Iphone6 siri is on");
    }

    @Override
    public void listenToAppleMusic() {
        System.out.println("You are listening to Apple Music with your Task007.Iphone6");
    }

    @Override
    public void simpleCalculator() {
        System.out.println("Task007.Iphone6 simple calculator mmode is on");
    }

    @Override
    public void engineerCalculator() {
        System.out.println("Task007.Iphone6 engineer calculator mmode is on");
    }

    @Override
    public void programmerCalculator() {
        System.out.println("Task007.Iphone5 programmer calculator mmode is on");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Task007.Iphone6 light is on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Task007.Iphone6 light is off");
    }

    @Override
    public void turnOnScreenLight() {
        System.out.println("Task007.Iphone6 screen light is on");
    }

    @Override
    public void turnOffScreenLight() {
        System.out.println("Task007.Iphone6 screen light is off");
    }

    @Override
    public void makePhoto() {
        System.out.println("Task007.Iphone6 makes photo");
    }

    @Override
    public void makePhotoWithLight(Lightable lightable) {
        lightable.turnOnLight();
        System.out.println("Task007.Iphone6 makes photo with light");
    }



    @Override
    public void makeVideo() {
        System.out.println("Task007.Iphone6 makes video");
    }

    @Override
    public void makeFrontCameraPhoto() {
        System.out.println("smile, the best Iphone makes selfie");
    }

    @Override
    public void useWiFi() {
        System.out.println("Your Task007.Iphone6 is connected to wifi");
    }

    @Override
    public void use3G(String mobilecompany) {
        System.out.println("Your Task007.Iphone6 uses " + mobilecompany + " 3G");
    }

    @Override
    public void use4G(String mobilecompany) {
        System.out.println("Your Task007.Iphone6 uses " + mobilecompany + " 4G");
    }

    @Override
    public void useAsWAP() {
        System.out.println("Your Task007.Iphone6 is WAP");
    }
}
