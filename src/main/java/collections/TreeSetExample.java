package collections;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
//        Integer
        Set<Integer> set = new TreeSet<>();
        for (int j = 10; j >= 0; j--) {
            int i = (int) (1 + Math.random() * 1000);
            set.add(i);
        }
        System.out.println(set);
//        String
        Set<String> set2 = new TreeSet<>();
        set2.add("a");
        set2.add("z");
        set2.add("c");
        set2.add("d");
        set2.add("b");
        System.out.println(set2);
    }
}
