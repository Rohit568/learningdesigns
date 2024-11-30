package decoratorpattern;

public class Whip extends ContidentMent{

    Bevarage bevarage;

    public Whip(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public double cost() {
        return 0.59 + this.bevarage.cost();
    }

    @Override
    public String getDescription() {
        return this.bevarage.getDescription()+ " Whip";
    }
}