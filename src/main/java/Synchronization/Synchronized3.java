package Synchronization;

import java.util.Arrays;
import java.util.List;

public class Synchronized3 {
    static synchronized void print(List<String> wordsToPrint) {
        wordsToPrint.forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {

        // создаем два треда
        Thread writer1 = new Thread(() -> {
            List<String> poem = Arrays.asList("Я ", "Writer1", " Пишу", " Письмо");
            Synchronized3.print(poem);
        });
        Thread writer2 = new Thread(() -> {
            List<String> poem = Arrays.asList("Не Я ", "Writer2", " Не пишу", " Не Письмо");
            Synchronized3.print(poem);
        });

        // запускаем их
        writer1.start();
        writer2.start();
    }
}
