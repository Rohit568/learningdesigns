package decoratorpattern;

public class Expresso extends Bevarage{

    public Expresso(){
        this.description = "expresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
