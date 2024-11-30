package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WheatherStation implements Subject{

    private List<Observer> listOfObserver;
    private double temperature;
    private double humidity;
    private double pressure;

    public WheatherStation(){
        listOfObserver= new ArrayList<>();
    }



    @Override
    public void addObserver(Observer obs) {
        listOfObserver.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        for(Observer o : listOfObserver)
            if(o.equals(obs)) {
                listOfObserver.remove(obs);
                break;
            }


    }

    @Override
    public void notifyObserver() {
       for(Observer obs : listOfObserver)
           obs.update(temperature, humidity, pressure);
    }


    public void measurementChanged(){
        notifyObserver();
    }
    public void setMeasurement(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();

    }
}
