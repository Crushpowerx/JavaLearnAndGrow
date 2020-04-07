package Map;

import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Student, Integer> myHTable = new Hashtable<>();
        Student sarah1 = new Student("Sarah","Connor", "Jane", null);
        Student john = new Student("John","Connor", "Kyle",
                new Date(1985, Calendar.FEBRUARY, 28)); // date not exists
        myHTable.put(john,1);
        myHTable.put(sarah1,0);
        System.out.println(myHTable.get(john));
        System.out.println(myHTable.isEmpty());
        System.out.println(myHTable.size());
        System.out.println(myHTable.contains(1));
        myHTable.remove(john);
        System.out.println(myHTable.contains(0));
        System.out.println(myHTable.contains(1));
        System.out.println(myHTable.containsKey(sarah1));
    }
}
