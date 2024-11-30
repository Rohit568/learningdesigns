package decoratorpattern;

public class HouseBlend extends Bevarage{

    public HouseBlend(){
        description = "Blend Cold Coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
