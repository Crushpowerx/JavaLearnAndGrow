package synchronization;

import java.util.Arrays;
import java.util.List;

public class Synchronized2 {
    public static void main(String[] args) {
        // один объект для двух тредов
        Synchronized2 printer = new Synchronized2();

        // создаем два треда
        Thread writer1 = new Thread(() -> {
            List<String> poem = Arrays.asList("Я ", "Writer1", " Пишу", " Письмо");
            printer.print(poem);
        });
        Thread writer2 = new Thread(() -> {
            List<String> poem = Arrays.asList("Не Я ", "Writer2", " Не пишу", " Не Письмо");
            printer.print(poem);
        });

        // запускаем их
        writer1.start();
        writer2.start();
    }

    void print(List<String> wordsToPrint) {
        synchronized (this) {
            wordsToPrint.forEach(System.out::print);
        }
        System.out.println();
    }
}
