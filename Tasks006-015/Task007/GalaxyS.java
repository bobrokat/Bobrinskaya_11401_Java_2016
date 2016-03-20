package Task007;

import Task007.Interfaces.*;

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
        System.out.println("say ok google to Task007.GalaxyS");
    }

    @Override
    public void connectToPlayMarket() {
        System.out.println("you are connected to Play Market");
    }

    @Override
    public void saveBataryLife() {
        System.out.println("now your Task007.GalaxyS will workLonger");
    }

    @Override
    public void simpleCalculator() {
        System.out.println("Task007.GalaxyS simple calculator mode is on");
    }

    @Override
    public void engineerCalculator() {
        System.out.println("Task007.GalaxyS engineer calculator mode is on");
    }

    @Override
    public void programmerCalculator() {
        System.out.println("Task007.GalaxyS programmer calculator mode is on");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Task007.GalaxyS light is on");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Task007.GalaxyS light is off");
    }

    @Override
    public void turnOnScreenLight() {
        System.out.println("Task007.GalaxyS screen light is on");
    }

    @Override
    public void turnOffScreenLight() {
        System.out.println("Task007.GalaxyS  screen light is off");
    }

    @Override
    public void makePhoto() {
        System.out.println("Task007.GalaxyS makes photo");
    }

    @Override
    public void makePhotoWithLight(Lightable lightable) {
        System.out.println("Task007.GalaxyS makes photo with light");
    }

    @Override
    public void makeVideo() {
        System.out.println("Task007.GalaxyS makes video");
    }

    @Override
    public void makeFrontCameraPhoto() {
        System.out.println("Task007.GalaxyS makes selfie!!!");
    }

    @Override
    public void useWiFi() {
        System.out.println("Task007.GalaxyS is connected to wifi");
    }

    @Override
    public void use3G(String mobilecompany) {
        System.out.println("Task007.GalaxyS is using " + mobilecompany + " 3G");
    }

    @Override
    public void use4G(String mobilecompany) {
        System.out.println("Task007.GalaxyS is using " + mobilecompany + " 4G");
    }

    @Override
    public void useAsWAP() {
        System.out.println("Task007.GalaxyS is WAP");
    }
}
