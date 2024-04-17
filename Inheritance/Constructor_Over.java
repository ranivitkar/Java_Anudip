
import java.util.*;

class Customer {
    private String name;
    private int age;

    public Customer() {
        name = "";
        age = 0;

    }

    public Customer(String name) {
        this.name = name;
        age = 0;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}

public class Constructor_Over {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer("Rani");
        Customer c3 = new Customer("Rani", 21);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }

}
