import java.util.*;

public class mar12_StringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1, s2, de;
        char g;

        s1 = "Rani";
        s2 = "Vitkar";

        System.out.println("Your name: " + s1);
        System.out.println("Your sirname: " + s2);

        System.out.println("enter your designation");
        de = sc.nextLine();

        System.out.println("confirm your designation: " + de);

        System.out.println("Enter your gender");
        g = sc.next().charAt(0);
        System.out.println("Your gender is: " + g);

    }

}
