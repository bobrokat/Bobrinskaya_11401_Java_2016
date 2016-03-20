import Interfaces.Calculatable;
import Interfaces.Lightable;
import Interfaces.Photoable;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 11.02.2016.
 */
public class SonyEricsonZ550i extends Phone implements Photoable, Calculatable {

    public SonyEricsonZ550i(String ownername, ArrayList contacts, String mobilecompany, CaseType caseType) {
        super(ownername, contacts, mobilecompany, caseType);
    }

    @Override
    public void simpleCalculator() {
        System.out.println("SonyEricsonZ550i simple calculator mode is on");
    }

    @Override
    public void engineerCalculator() {
        System.out.println("SonyEricsonZ550i engineer calculator mode is on");
    }

    @Override
    public void programmerCalculator() {
        System.out.println("Not Available");
    }

    @Override
    public void makePhoto() {
        System.out.println("SonyEricsonZ550i makes photo");
    }

    @Override
    public void makePhotoWithLight(Lightable lightable) {
        System.out.println("Not Available");
    }

    @Override
    public void makeVideo() {
        System.out.println("SonyEricsonZ550i makes video");
    }

    @Override
    public void makeFrontCameraPhoto() {
        System.out.println("Not Available");
    }
}
