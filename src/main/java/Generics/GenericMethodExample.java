package Generics;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class GenericMethodExample {
    public static <T> T getTheFirst(List<T> list) {
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            System.out.println("List is null");
            return null;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        Integer intValue = getTheFirst(integerList);
        System.out.println(intValue);
        sleep(1000);

        List<String> stringList = new ArrayList<>();
        stringList.add("word");
        String stringValue = getTheFirst(stringList);
        System.out.println(stringValue);
    }
}
