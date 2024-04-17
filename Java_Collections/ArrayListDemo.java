package Collections;

import java.util.*;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Rani");
        list.add("Usha");
        list.add("Ashwini");
        list.add("priti");

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
