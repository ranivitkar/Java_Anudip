import java.util.*;

public class Array_largest_smallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[10]; // declaration of array with user entered size
        System.out.println("Enter 10 Numbers");

        for (int i = 0; i < 10; i++) { // getting 10 integers from user
            a[i] = sc.nextInt();
        }

        int large = a[0], small = a[0];

        for (int i = 1; i < 10; i++) {

            if (small > a[i]) {//checking the small variable contain the small number or not if it contain the largest number then it replace to the a[i]
                small = a[i];
            }
            if (large < a[i]) {//checking the large variable contain the large number or not if it contain the smallest number then it replace to the a[i]
                large = a[i];
            }

        }

        System.out.println("Smallest number: " + small); // displaying
        System.out.println("Largest number: " + large); // printing odd sum

    }

}
