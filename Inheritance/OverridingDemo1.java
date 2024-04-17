package Inheritance;

class Base {
    public void dispaly() {
        System.out.println("Welcome to parent class");
    }
}

public class OverridingDemo1 extends Base {

    public void dispaly() {
        System.out.println("Welocme to child class");
    }

    public static void main(String[] args) {
        OverridingDemo1 o = new OverridingDemo1();
        o.dispaly();

        Base b = new Base();
        b.dispaly();
    }

}
