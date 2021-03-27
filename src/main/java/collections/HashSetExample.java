package collections;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int j = 100; j >= 0; j--) {
            int i = (int) (1 + Math.random() * 100);
            set.add(i);
            set.add(j);
        }
        System.out.println(set);
    }
}
