import java.util.*;

public class Mar12_String_upper_lower {

    public static void main(String[] args) {

        String s1, s2, s3, s4, s5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your favouirate movie");
        s1 = sc.nextLine();

        System.out.println("Movie in Capital");
        s2 = s1.toUpperCase();
        System.out.println(s2);

        System.out.println("Enter name of hero in capital");
        s3 = sc.nextLine();

        s4 = s3.toLowerCase();
        System.out.println(s4);

        s5 = s2.concat(s3);
        System.out.println(s5);

    }

}
