package collections;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> arrayListExample = new ArrayList<>();
        arrayListExample.add("var1");
        arrayListExample.add("var2");
        arrayListExample.add("var2");
        arrayListExample.add("var3");
        arrayListExample.add("var4");
        arrayListExample.add("var5");
        arrayListExample.add("var5");
        arrayListExample.add("var6");
        System.out.println("arrayListExample with duplicates: " + arrayListExample + "\n");

        //create Set and remove duplicates from ArrayList
        Set<String> set = new HashSet<>(arrayListExample);
        arrayListExample.clear();
        arrayListExample.addAll(set);
        //sort ArrayList
        arrayListExample.sort(Comparator.naturalOrder());
        //print ArrayList
        System.out.println("arrayListExample with out duplicates: " + arrayListExample + "\n");

        //remove elements from ArrayList in loop
        Iterator<String> itr = arrayListExample.iterator();
        while (itr.hasNext()) {
            String itrNext = itr.next();
            System.out.println("element " + itrNext + " will be removed");
            itr.remove();
            System.out.println("arrayListExample with out this element: " + arrayListExample + "\n");
        }
    }

}
