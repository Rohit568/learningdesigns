package decoratorpattern;

public class Mocha extends ContidentMent{

    Bevarage bevarage;

    public Mocha(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public double cost() {
        return 0.49 + this.bevarage.cost();
    }

    @Override
    public String getDescription() {
        return this.bevarage.getDescription() + " Mocha";
    }
}
