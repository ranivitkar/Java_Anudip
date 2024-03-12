import java.util.*;

public class Mar11_EmpDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int id[] = new int[3];
        double sal[] = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Employee id");
            id[i] = s.nextInt();

            System.out.println("Enter Salary");
            sal[i] = s.nextInt();

        }

        System.out.println("Employee Details");
        for (int i = 0; i < 3; i++) {
            System.out.println("Emp" + (i + 1) + " id: " + id[i]);

            System.out.println("Emp" + (i + 1) + " Salary: " + sal[i]);

        }

    }

}
