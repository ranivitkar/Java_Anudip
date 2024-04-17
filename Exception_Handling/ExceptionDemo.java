package Exception_Handling;

import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int a, b, c;
            System.out.println("Enter two number for division");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("You can't devide by 0");
        } finally {

            System.out.println("Finally run..");
        }
    }
}
