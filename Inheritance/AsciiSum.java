import java.util.*;

public class AsciiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cr;
        double sum = 0;

        System.out.println("Enter 10 characters: ");
        for (int i = 0; i < 10; i++) {
            cr = sc.next().charAt(0);
            sum += (int) cr;
        }

        System.out.println("Sum of ASCII value: " + sum);

    }
}
