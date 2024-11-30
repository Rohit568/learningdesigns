import decoratorpattern.*;
import observerpattern.*;

public class Main {
    public static void main(String[] args) {


//        System.out.println("Hello world!");
//
//
//        UserCode uc = new UserCode();
//        WeaponBehavior ab = new AxeBehaviour();
//        WeaponBehavior bbb = new BowAndBorrowBehaviour();
//        WeaponBehavior kb = new KnifeBehaviour();
//        WeaponBehavior sb = new SwordBehaviour();
//
//        uc.check(kb);
//        uc.check(bbb);


//        WheatherStation ws = new WheatherStation();
//        ws.setMeasurement(22, 33, 88);
//        ForecaseDisplay ds = new ForecaseDisplay();
//        ThirdPartyDisplay ds2 = new ThirdPartyDisplay();
//        StatiticsDisplay ds3 = new StatiticsDisplay();
//
//
//        ws.addObserver(ds);
//        ws.addObserver(ds2);
//        ws.setMeasurement(12, 12, 12);
//
//        ws.addObserver(ds3);
//        System.out.println();
//        ws.setMeasurement(11.11, 11.11, 11.11);
//
//        System.out.println();
//        ws.removeObserver(ds2);
//        ws.setMeasurement(34, 23.11, 32.11);


        Bevarage bevarage = new Expresso();
        System.out.println(bevarage.description + " " + bevarage.cost());

        Bevarage bevarage2 = new HouseBlend();

        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Soy(bevarage2);

        System.out.println(bevarage2.getDescription() + " " + bevarage2.cost());
        bevarage2 = new Whip(bevarage2);
        System.out.println(bevarage2.getDescription() + " " + bevarage2.cost());




    }

}