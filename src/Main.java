import pattern1.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");


        UserCode uc = new UserCode();
        WeaponBehavior ab = new AxeBehaviour();
        WeaponBehavior bbb = new BowAndBorrowBehaviour();
        WeaponBehavior kb = new KnifeBehaviour();
        WeaponBehavior sb = new SwordBehaviour();

        uc.check(kb);
        uc.check(bbb);
    }
}