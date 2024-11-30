package pattern1;

public class KnifeBehaviour implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("cutting ");
    }
}
