import Interfaces.*;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 11.02.2016.
 */
public class GalaxyS extends Phone implements AndroidBehaviour, Calculatable, Lightable, Photoable, InternetConnectable {


    public GalaxyS(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    @Override
    public void okayGoogleFunction() {
        System.out.println("say ok google to GalaxyS");
    }

    @Override
    public void connectToPlayMarket() {
        System.out.println("you are connected to Play Market");
    }

    @Override
    public void saveBataryLife() {
        System.out.println("now your GalaxyS will workLonger");
    }

    @Override
    public void simpleCalculator() {
        System.out.println("GalaxyS simple calculator mode is on");
    }

    @Override
    public void engineerCalculator() {
        System.out.println("GalaxyS engineer calculator mode is on");
    }

    @Override
    public void programmerCalculator() {
        System.out.println("GalaxyS programmer calculator mode is on");
    }

    @Override
    public void turnOnLight() {
        System.out.println("GalaxyS light is on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("GalaxyS light is off");
    }

    @Override
    public void turnOnScreenLight() {
        System.out.println("GalaxyS screen light is on");
    }

    @Override
    public void turnOffScreenLight() {
        System.out.println("GalaxyS  screen light is off");
    }

    @Override
    public void makePhoto() {
        System.out.println("GalaxyS makes photo");
    }

    @Override
    public void makePhotoWithLight(Lightable lightable) {
        System.out.println("GalaxyS makes photo with light");
    }

    @Override
    public void makeVideo() {
        System.out.println("GalaxyS makes video");
    }

    @Override
    public void makeFrontCameraPhoto() {
        System.out.println("GalaxyS makes selfie!!!");
    }

    @Override
    public void useWiFi() {
        System.out.println("GalaxyS is connected to wifi");
    }

    @Override
    public void use3G(String mobilecompany) {
        System.out.println("GalaxyS is using " + mobilecompany + " 3G");
    }

    @Override
    public void use4G(String mobilecompany) {
        System.out.println("GalaxyS is using " + mobilecompany + " 4G");
    }

    @Override
    public void useAsWAP() {
        System.out.println("GalaxyS is WAP");
    }
}
