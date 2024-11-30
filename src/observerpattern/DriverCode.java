package observerpattern;

public class DriverCode {

    public static void main(String[] args){

        WheatherStation ws = new WheatherStation();
        ws.setMeasurement(22, 33, 88);
        ForecaseDisplay ds = new ForecaseDisplay();
        ThirdPartyDisplay ds2 = new ThirdPartyDisplay();
        StatiticsDisplay ds3 = new StatiticsDisplay();

        ws.addObserver(ds);
        ws.addObserver(ds2);
        ds.display();
        ds2.display();
        ds3.display();
        ws.setMeasurement(11, 11, 11);
        ds.display();
        ds2.display();
        ds3.display();



    }
}
