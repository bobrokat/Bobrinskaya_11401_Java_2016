package Task007;

import Task007.Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 10.02.2016.
 */
public class Iphone4 extends Phone implements IphoneBehaviour, Photoable, Calculatable, InternetConnectable{


    public Iphone4(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    public void showownerName(){
        System.out.println("Task007.Iphone4's owner is  " + this.getOwnername());
    }

    @Override
    public void connectToItunes() {
        System.out.println("Ipnone4 connected to Itunes");
    }

    @Override
    public void fingerPrintDecoding() {
        System.out.println("Task007.Iphone4 decodes your finger print");
    }

    @Override
    public void siri() {
        System.out.println("Task007.Iphone4 siri is on");
    }

    @Override
    public void listenToAppleMusic() {
        System.out.println("You are listening to Apple Music with your Task007.Iphone4");
    }

    @Override
    public void simpleCalculator() {
        System.out.println("Task007.Iphone4 simple calculator mmode is on");
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
    public void makePhoto() {
        System.out.println("Task007.Iphone4 makes photo");
    }

    @Override
    public void makePhotoWithLight(Lightable lightable) {
        System.out.println("Not Available");
    }

    @Override
    public void makeVideo() {
        System.out.println("Task007.Iphone4 makes video");
    }

    @Override
    public void makeFrontCameraPhoto() {
        System.out.println("Task007.Iphone4 makes front camera photo");
    }

    @Override
    public void useWiFi() {
        System.out.println("Your Task007.Iphone4 is connected to wifi");
    }

    @Override
    public void use3G(String mobilecompany) {
        System.out.println("Your Task007.Iphone4 uses " + mobilecompany + " 3G");
    }

    @Override
    public void use4G(String mobilecompany) {
        System.out.println("Your Task007.Iphone4 uses " + mobilecompany + " 4G");
    }

    @Override
    public void useAsWAP() {
        System.out.println("not Available");
    }
}
