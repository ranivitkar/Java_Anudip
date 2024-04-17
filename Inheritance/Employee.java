
import java.util.*;

class Emp_Demo {
    int eid;
    String name;
    Double sal;
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.println("ENter your empId");
        eid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter your salary");
        sal = sc.nextDouble();
    }

    void display() {

        System.out.println("WElcome to TCS career site " + name + "\n your empId id " + eid + " Your salary is " + sal);
    }
}

public class Employee {
    public static void main(String[] args) {
        Emp_Demo e = new Emp_Demo();
        e.accept();
        e.display();
    }
}
