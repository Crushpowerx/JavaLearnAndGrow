package collections;

import java.util.*;

public class collections {
    public static void main(String[] args) {
        //create ArrayList
        ArrayList<String> arrayListExample = new ArrayList<>();
        arrayListExample.add("asd1");
        arrayListExample.add("asd2");
        arrayListExample.add("asd3");
        arrayListExample.add("asd4");
        arrayListExample.add("asd5");
        arrayListExample.add("asd3");
        arrayListExample.add("asd4");
        arrayListExample.add("asd5");
        System.out.println(arrayListExample);

        //create LinkedList
        LinkedList<String> linkedListExample = new LinkedList<>();
        linkedListExample.add("asd1");
        linkedListExample.add("asd2");
        linkedListExample.add("asd3");
        linkedListExample.add("asd4");
        linkedListExample.add("asd5");
        linkedListExample.add("asd3");
        linkedListExample.add("asd4");
        linkedListExample.add("asd5");
        System.out.println(linkedListExample);

        //create Set and remove duplicates from ArrayList
        Set<String> set = new HashSet<>(arrayListExample);
        arrayListExample.clear();
        arrayListExample.addAll(set);
        arrayListExample.sort(Comparator.naturalOrder());
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
