package decoratorpattern;

public class Soy extends ContidentMent{

    Bevarage bevarage;

    public Soy(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public double cost() {
        return 0.69 + this.bevarage.cost();
    }

    @Override
    public String getDescription() {
        return this.bevarage.getDescription()+ " Soy";
    }
}