package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;
import java.io.*;

public class EmpSet {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        Set<Integer> idset = new HashSet<Integer>();
        Set<String> nameset = new HashSet<String>();
        int id;
        String name;

        for (int i = 0; i <= 5; i++) {

            id = c.nextInt();
            c.nextLine();
            name = c.nextLine();

            idset.add(id);
            nameset.add(name);
        }

        Iterator i = idset.iterator();
        Iterator n = nameset.iterator();

        while (i.hasNext() && n.hasNext()) {
            System.out.println(i.next() + " " + n.next());
        }
    }
}
