package Lab;

import java.util.*;

public class Perimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c;
        double peri;

        System.out.println("\n******* Perimeter Calculation *******");
        System.out.println("1. Perimeter of a Circle\n2. Perimeter of a Rectangle\n3. Perimeter of a Square");
        System.out.println("\nEnter Your Choice");
        c = sc.nextInt();

        switch (c) {
            case 1:
                // if user enter 1 then calculate perimeter of circle
                double r;
                // taking radius from user
                System.out.println("Enter radius of circle");
                r = sc.nextInt();
                // calculating perimeter of circle
                peri = 2 * (22 / 7) * r;

                System.out.println("perimeter of circle is : " + peri);

                break;

            case 2:
                // if user enter 2 then calculate perimeter of rectangle
                double l, b;
                // taking length and breadth from user
                System.out.println("Enter length and breadth of rectangle");
                l = sc.nextInt();
                b = sc.nextInt();
                // calculating perimeter of rectangle
                peri = 2 * (l + b);

                System.out.println("perimeter of rectangle is : " + peri);

                break;

            case 3:
                // if user enter 3 then calculate perimeter of circle
                double s;
                // taking size of square from user
                System.out.println("Enter size of square");
                s = sc.nextInt();
                // calculating perimeter of square
                peri = 4 * s;

                System.out.println("perimeter of square is : " + peri);

                break;

            default:
                // this for if user enter any other number
                System.out.println("Your choice is wrong");
                break;
        }
    }

}
