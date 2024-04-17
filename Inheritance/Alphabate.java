//Write a program to enter a letter . Change the case 
//of the input letter and display the case of input 
//letter and its ASCII code.
//Sample input :b
//sample output: B
//The ASCII value is B: 66

import java.util.Scanner;

public class Alphabate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char chr, chr1;
        System.out.println("Enter a chraracter: ");
        chr = sc.next().charAt(0);

        if (Character.isUpperCase(chr) == true) {
            chr1 = Character.toLowerCase(chr);
            System.out.println("Lower Case of " + chr + " is" + chr1);
            System.out.println("The ACII value is " + (int) chr1);
        } else {
            chr1 = Character.toUpperCase(chr);
            System.out.println("Lower Case of " + chr + " is" + chr1);
            System.out.println("The ACII value is " + (int) chr1);
        }
    }

}
