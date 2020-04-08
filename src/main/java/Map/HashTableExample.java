package Map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] arg) {
        String[] animals = {"cat", "dog", "dog", "cat", "bird", "mouse", "mouse"};
        Hashtable<String, Integer> table = new Hashtable<>();

//        for (String animal : animals) {
//            table.compute(animal,
//                    (key, value) -> (value == null ? 1 : value + 1));
//        }

        for (String animal : animals) {
//            table.merge(animal, 1, (oldValue, value) -> (oldValue + value));
            table.merge(animal, 1, Integer::sum); //lambda ^
        }

        table.forEach((k, v) -> System.out.println(k + " - " + v));

        System.out.println(table);
    }
}
