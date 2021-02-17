package exceptions;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class ThrowExample2 {
    public static void main(String[] args) throws InterruptedException {
        ThrowExample2 throwExample2 = new ThrowExample2();
        try {
            for (int a = 1; a <= 15; a++) {
                throwExample2.willThrowWithCondition(a);
                sleep(500);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void willThrowWithCondition(int a) throws IOException {
        if (a > 10) {
            throw new IOException("a is NOT normal! a > 10");
        } else {
            System.out.println("a is normal: " + a);
        }
    }
}
