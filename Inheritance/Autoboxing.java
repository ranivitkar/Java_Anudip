public class Autoboxing {
    public static void main(String[] args) {

        int x = 25, y;
        Integer val = new Integer(x); // Autoboxing
        y = val;

        System.out.println("value after autoboxing " + val);
        System.out.println("value Before autoboxing " + x);

    }
}
