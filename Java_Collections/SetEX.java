package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEX {

    public static void main(String[] args) {

        int count[] = { 21, 35, 67, 93, 12, 26 };

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i <= 5; i++) {
            set.add(count[i]);
        }
        System.out.println(set);

        TreeSet<Integer> sortedset = new TreeSet<Integer>(set);

        System.out.println("The sorted list is: ");

        System.out.println(sortedset);

        System.out.println("1st element of set " + (Integer) sortedset.first());

        System.out.println("last element of set " + (Integer) sortedset.last());

    }
}
