package Collections;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Random random = new Random(30);
        Set<Integer> numberSet = new LinkedHashSet<>();
        for (int i = 0; i < 1000; i++)
            numberSet.add(random.nextInt(10));
        System.out.println(numberSet);
    }
}
