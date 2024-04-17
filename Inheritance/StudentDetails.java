
/**
 * StudentDetails
 */
import java.util.*;

class Student {
    int sid, marks;
    String name;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter Your student ID");
        sid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter your marks");
        marks = sc.nextInt();

    }

    void output() {
        System.out.println("Welcome " + name);
        System.out.println("Your student id is " + sid);
        System.out.println("Your marks " + marks);
    }

}

public class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.output();
    }

}