package maps;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    static LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            linkedHashMap.put(i, "test " + i);
            System.out.println(linkedHashMap);
        }
        Iterator<Integer> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            it.next();
            System.out.println(linkedHashMap);
            it.remove();
        }
    }
}
