import java.util.*;

public class Mar12_String_char_count {
    public static void main(String[] args) {

        String s;
        int c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                continue;
            } else {
                c++;
            }

        }
        System.out.println(c + " character are there in " + s);
    }
}
