package Exceptions;

import java.io.IOException;

class ThrowExample {
    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        throwExample.doSomething();
    }

    void willThrow() throws IOException {
        throw new IOException("IOException was successfully handled");
    }

    void doSomething() {
        System.out.println("Doing something");
        try {
            willThrow();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
