package Collections;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
//        test SSH
        ArrayList<String> arrayListExample = new ArrayList<>();
        arrayListExample.add("asd1");
        arrayListExample.add("asd3");
        arrayListExample.add("asd2");
        arrayListExample.add("asd5");
        arrayListExample.add("asd4");
        arrayListExample.add("asd3");
        arrayListExample.add("asd5");
        arrayListExample.add("asd4");
        System.out.println(arrayListExample);

        //create Set and remove duplicates from ArrayList
        Set<String> set = new HashSet<>(arrayListExample);
        arrayListExample.clear();
        arrayListExample.addAll(set);
        //sort ArrayList
        arrayListExample.sort(Comparator.naturalOrder());
        //print ArrayList
        System.out.println(arrayListExample);

        //remove elements from ArrayList in loop
        Iterator<String> itr = arrayListExample.iterator();
        while (itr.hasNext()) {
            String itrNext = itr.next();
            System.out.println(itrNext);
            itr.remove();
            System.out.println(arrayListExample);
        }
    }
}
