
import java.util.*;

public class Swapping_Numbers {

    Scanner c = new Scanner(System.in);
    int a, b;

    void getNum() {// for taking 2 numbers from user

        System.out.println("Enter 1st Number");
        a = c.nextInt();

        System.out.println("Enter 2nd Number");
        b = c.nextInt();
    }

    void swapNum() {// for swapping numbers

        System.out.println("Before Swapping \n1st_num= " + a + " 2nd_num= " + b);
        a = a + b;// addition of two numbers
        b = a - b;// in 2nd number store the substraction of a and b this for getting actual value
                  // of a
        a = a - b;// for getting value of b we have to subtract b from addition

        System.out.println("\nAfter Swapping \n1st_num= " + a + " 2nd_num= " + b);

    }

    public static void main(String[] args) {

        Swapping_Numbers s = new Swapping_Numbers();
        s.getNum();// method calling for get the input from from user
        s.swapNum();// swap method for swapping two numbers without using third variable

    }

}
