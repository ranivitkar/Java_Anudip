import java.util.*;

public class Mar12_reverse_string {

    public static void main(String[] args) {

        String s1, s2;
        s2 = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your name");
        s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            s2 = s1.charAt(i) + s2;
            System.out.println(s2);
        }

    }
}
