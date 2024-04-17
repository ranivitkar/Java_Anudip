package Lab;

import java.util.Scanner;

public class String_Reverse {

    public static void main(String[] args) {

        String s1, s2;
        s2 = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        s1 = sc.nextLine();

        // for loop for the getting each character from the string
        for (int i = 0; i < s1.length(); i++) {
            // one by one character is cancating at the first position of the string
            s2 = s1.charAt(i) + s2;

        }
        System.out.println("\n***** Reverse String *****");
        System.out.println(s2);// printing whole reverse string

    }
}
