package Threads;

public class ThreadInheritance extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadInheritance threadInheritance1 = new ThreadInheritance();
        ThreadInheritance threadInheritance2 = new ThreadInheritance();
        ThreadInheritance threadInheritance3 = new ThreadInheritance();
        threadInheritance1.start();
        threadInheritance2.start();
        threadInheritance3.start();
    }
}
