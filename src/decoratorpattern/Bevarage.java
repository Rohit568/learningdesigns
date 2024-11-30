package decoratorpattern;

public abstract class Bevarage {

    public String description = "bevarage";
    public String getDescription(){
       return description;
    }

    public abstract double cost();
}
