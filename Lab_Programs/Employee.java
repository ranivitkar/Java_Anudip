package Lab;

import java.util.*;

class Emp_Tax {

    // methos for tax calculation
    void displayTaxDetails(String name, double income) {

        double tax;

        if (income <= 250000)
        // if employee annual income is less than 250000
        {
            tax = 0;

        } else if (income > 250001 && income <= 500000)
        // if employee annual income is in between 250001 and 500000
        {
            tax = 0.1 * (income - 250000);
        } else if (income > 500000 && income <= 1000000)
        // if employee annual income is in between 500000 and 1000000
        {
            tax = 30000 + (0.2 * (income - 500000));
        } else
        // if employee annual income is greater than 1000000
        {
            tax = 50000 + (0.3 * (income - 1000000));
        }

        // displaying employee details with income tax

        System.out.println("\n******** Employee Tax Details ********");
        System.out.println("\nEmployee Name: " + name);

        System.out.println("Income Tax: " + tax);

    }
}

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        double income;

        System.out.println("Enter Your Name: ");
        // taking employee name from user
        name = sc.nextLine();
        System.out.println("Enter your annual Income: ");
        // taking Employee annual income from user
        income = sc.nextInt();

        Emp_Tax e = new Emp_Tax();
        // passing name and income to calculate income tax
        e.displayTaxDetails(name, income);

    }
}
