package collections;

import java.util.*;

public class QueueExample {
    // create timer
    public static void timerExample() throws InterruptedException {
        int time = 10;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = time; i >= 0; i--)
            queue.add(i);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            Thread.sleep(1000);
        }
    }

    // create method for sort collections with PriorityQueue
    static <E> List<E> heapSort(Collection<E> c) {
        Queue<E> queue = new PriorityQueue<>(c);
        List<E> result = new ArrayList<>();
        while (!queue.isEmpty())
            result.add(queue.remove());
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
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
        System.out.println(heapSort(linkedListExample));
        timerExample();
    }
}
