package maps;

import java.util.*;

public class HashMapExample {
//    immutable HashMap
    private static final Map<Integer, String> Map;
    static {
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(1, "one");
        aMap.put(2, "two");
        Map = Collections.unmodifiableMap(aMap);
    }

    public static void main(String[] args) {
//        test immutable HashMap - uncomment next raw
//        Map.put(3, "three");
        System.out.println(Map);

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("London", "Kyiv");
        hashMap.put("Kyiv", "London");
        hashMap.put("Paris", "New York");
        hashMap.put("New York", "Paris");
        hashMap.put("Madrid", "Barcelona");
        hashMap.put("Barcelona", "Madrid");
        System.out.println(hashMap);
        for (Map.Entry<String, String> entry: hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
