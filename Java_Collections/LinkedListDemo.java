package Collections;

import java.util.*;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

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