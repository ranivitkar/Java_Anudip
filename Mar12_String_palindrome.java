import java.util.*;

public class Mar12_String_palindrome {
    public static void main(String[] args) {
        String s1, s2;
        s2 = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            s2 = s1.charAt(i) + s2;

        }
        if (s1.equals(s2)) {
            System.out.println(s1 + " This is Palindrome");
        } else {
            System.out.println(s1 + " This is not Palindrome");
        }
    }
}
