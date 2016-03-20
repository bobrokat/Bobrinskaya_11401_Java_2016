import Interfaces.Lightable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekaterina on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Contact kate = (Contact) ac.getBean("kate");
        SimplePhone simplePhone = (SimplePhone) ac.getBean("simplePhone");
        simplePhone.showownerName();
        simplePhone.call(kate);
        simplePhone.sms(kate, "hi");
        simplePhone.showContactsList();

        Lightable flash = new Lightable() {
            @Override
            public void turnOnLight() {
                System.out.println("flash is on");
            }

            @Override
            public void turnOffLight() {

            }

            @Override
            public void turnOnScreenLight() {

            }

            @Override
            public void turnOffScreenLight() {

            }
        };

        AsusZenPhone5 asusZenPhone5 = (AsusZenPhone5) ac.getBean("asusZenPhone5");
        asusZenPhone5.showownerName();
        asusZenPhone5.showContactsList();
        System.out.println(asusZenPhone5.getCaseType());
        asusZenPhone5.call(kate);
        asusZenPhone5.sms(kate, "wats up?!");
        asusZenPhone5.turnOnLight();
        asusZenPhone5.turnOffLight();
        asusZenPhone5.turnOnScreenLight();
        asusZenPhone5.turnOffScreenLight();
        asusZenPhone5.makePhoto();
        asusZenPhone5.makePhotoWithLight(flash);
        asusZenPhone5.makeFrontCameraPhoto();
        asusZenPhone5.simpleCalculator();
        asusZenPhone5.engineerCalculator();
        asusZenPhone5.programmerCalculator();
        asusZenPhone5.okayGoogleFunction();
        asusZenPhone5.connectToPlayMarket();
        asusZenPhone5.saveBataryLife();
        asusZenPhone5.addNote();
        asusZenPhone5.deleteNote();
        asusZenPhone5.editNote();
        asusZenPhone5.useWiFi();
        asusZenPhone5.use3G(asusZenPhone5.getMobilecompany());
        asusZenPhone5.use4G(asusZenPhone5.getMobilecompany());
        asusZenPhone5.useAsWAP();

        Alcatel alcatel = (Alcatel) ac.getBean("alcatel");
        alcatel.showownerName();
        System.out.println(alcatel.getCaseType());
        alcatel.showContactsList();
        alcatel.turnOnLight();
        alcatel.turnOffLight();
        alcatel.turnOnScreenLight();
        alcatel.turnOffScreenLight();
        alcatel.simpleCalculator();
        alcatel.engineerCalculator();
        alcatel.programmerCalculator();
        alcatel.makePhoto();
        alcatel.makePhotoWithLight(flash);
        alcatel.makeFrontCameraPhoto();
        alcatel.makeVideo();

        Nokia6300 nokia6300 = (Nokia6300) ac.getBean("nokia6300");
        nokia6300.showownerName();
        nokia6300.showContactsList();
        System.out.println(nokia6300.getCaseType());
        nokia6300.turnOnLight();
        nokia6300.turnOffLight();
        nokia6300.turnOnScreenLight();
        nokia6300.turnOffScreenLight();
        nokia6300.simpleCalculator();
        nokia6300.engineerCalculator();
        nokia6300.programmerCalculator();

        SonyEricsonZ550i sonyEricsonZ550i = (SonyEricsonZ550i) ac.getBean("sonyEricsonZ550i");
        sonyEricsonZ550i.showownerName();
        sonyEricsonZ550i.showContactsList();
        sonyEricsonZ550i.call(kate);
        sonyEricsonZ550i.sms(kate, "hi");
        System.out.println(sonyEricsonZ550i.getCaseType());
        sonyEricsonZ550i.makePhoto();
        sonyEricsonZ550i.makeFrontCameraPhoto();
        sonyEricsonZ550i.makeVideo();
        sonyEricsonZ550i.simpleCalculator();
        sonyEricsonZ550i.engineerCalculator();
        sonyEricsonZ550i.programmerCalculator();

        Iphone4 iphone4 = (Iphone4) ac.getBean("iphone4");
        iphone4.showownerName();
        iphone4.showContactsList();
        iphone4.call(kate);
        System.out.println(iphone4.getCaseType());
        iphone4.sms(kate, "че?");
        iphone4.connectToItunes();
        iphone4.siri();
        iphone4.listenToAppleMusic();
        iphone4.fingerPrintDecoding();
        iphone4.makePhoto();
        iphone4.makeVideo();
        iphone4.makeFrontCameraPhoto();
        iphone4.makePhotoWithLight(flash);
        iphone4.makeFrontCameraPhoto();
        iphone4.simpleCalculator();
        iphone4.engineerCalculator();
        iphone4.programmerCalculator();
        iphone4.useWiFi();
        iphone4.use3G(iphone4.getMobilecompany());
        iphone4.use4G(iphone4.getMobilecompany());
        iphone4.useAsWAP();

        Iphone5 iphone5 = (Iphone5) ac.getBean("iphone5");
        iphone5.showownerName();
        iphone5.showContactsList();
        iphone5.call(kate);
        iphone5.sms(kate, "hi");
        System.out.println(iphone5.getCaseType());
        iphone5.connectToItunes();
        iphone5.siri();
        iphone5.listenToAppleMusic();
        iphone5.fingerPrintDecoding();
        iphone5.makePhoto();
        iphone5.makeVideo();
        iphone5.makeFrontCameraPhoto();
        iphone5.makePhotoWithLight(flash);
        iphone5.simpleCalculator();
        iphone5.engineerCalculator();
        iphone5.programmerCalculator();
        iphone5.turnOnLight();
        iphone5.turnOffLight();
        iphone5.turnOffScreenLight();
        iphone5.turnOffScreenLight();
        iphone5.useWiFi();
        iphone5.use3G(iphone5.getMobilecompany());
        iphone5.use4G(iphone5.getMobilecompany());
        iphone5.useAsWAP();

        Iphone6 iphone6 = (Iphone6) ac.getBean("iphone6");
        iphone6.showownerName();
        iphone6.showContactsList();
        iphone6.call(kate);
        iphone6.sms(kate, "hi");
        System.out.println(iphone6.getCaseType());
        iphone6.connectToItunes();
        iphone6.siri();
        iphone6.listenToAppleMusic();
        iphone6.fingerPrintDecoding();
        iphone6.makePhoto();
        iphone6.makeVideo();
        iphone6.makeFrontCameraPhoto();
        iphone6.makePhotoWithLight(flash);
        iphone6.simpleCalculator();
        iphone6.engineerCalculator();
        iphone6.programmerCalculator();
        iphone6.turnOnLight();
        iphone6.turnOffLight();
        iphone6.turnOffScreenLight();
        iphone6.turnOffScreenLight();
        iphone6.useWiFi();
        iphone6.use3G(iphone6.getMobilecompany());
        iphone6.use4G(iphone6.getMobilecompany());
        iphone6.useAsWAP();

        Fax fax = (Fax) ac.getBean("fax");
        fax.showownerName();
        fax.showContactsList();
        System.out.println(fax.getCaseType());
        fax.call(kate);
        fax.sendFax(kate, "Сложна...");

        GalaxyS galaxyS = (GalaxyS) ac.getBean("galaxyS");
        galaxyS.showownerName();
        galaxyS.showContactsList();
        galaxyS.call(kate);
        galaxyS.sms(kate, "hi");
        System.out.println(galaxyS.getCaseType());
        galaxyS.makePhoto();
        galaxyS.makeVideo();
        galaxyS.makeFrontCameraPhoto();
        galaxyS.makePhotoWithLight(flash);
        galaxyS.simpleCalculator();
        galaxyS.engineerCalculator();
        galaxyS.programmerCalculator();
        galaxyS.turnOnLight();
        galaxyS.turnOffLight();
        galaxyS.turnOffScreenLight();
        galaxyS.turnOffScreenLight();
        galaxyS.useWiFi();
        galaxyS.use3G(galaxyS.getMobilecompany());
        galaxyS.use4G(galaxyS.getMobilecompany());
        galaxyS.useAsWAP();
        galaxyS.okayGoogleFunction();
        galaxyS.saveBataryLife();
        galaxyS.connectToPlayMarket();





    }
}
