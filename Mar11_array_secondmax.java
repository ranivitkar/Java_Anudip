import java.util.*;

public class Mar11_array_secondmax {
    public static void main(String[] args) {

        int a[] = new int[5];
        int i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five Numbers for 1st Array");

        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Ascending order of given array");

        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }

        System.out.println("Second Largest number: " + a[3]);
        System.out.println("Third minimum number: " + a[2]);

    }

}