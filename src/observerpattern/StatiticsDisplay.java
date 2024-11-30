package observerpattern;

public class StatiticsDisplay implements Displayer, Observer{
    private double temperature;
    private double humidity;
    private double pressure;
    @Override
    public void display() {
        System.out.println("Wheather updates StaticsDisplay t: "+ temperature +",h: "+ humidity+", p: "+pressure)  ;
    }

    @Override
    public void update(double temperature, double humidity,  double pressure) {
        this.temperature = temperature ;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
