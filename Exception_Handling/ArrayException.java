package Exception_Handling;

import java.util.*;

public class ArrayException {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 20;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
