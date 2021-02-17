package maps;

import java.util.TreeMap;

public class TreeMapExample {
    static TreeMap<Integer, String> treeMap = new TreeMap<>();

    public static void addValueInTreeMap(String value) {
        int i;
        if (!treeMap.isEmpty()) {
            i = treeMap.lastKey() + 1;
        } else {
            i = 1;
        }
        treeMap.put(i, value);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            addValueInTreeMap("test " + i);
            System.out.println(treeMap);
        }
        while (!treeMap.isEmpty()) {
            treeMap.remove(treeMap.lastKey());
            System.out.println(treeMap);
        }
    }
}
