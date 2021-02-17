package threads;

public class ThreadInheritance2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadInheritance runnable1 = new ThreadInheritance();
        ThreadInheritance runnable2 = new ThreadInheritance();
        ThreadInheritance runnable3 = new ThreadInheritance();

        Thread threadRunnable1 = new Thread(runnable1);
        Thread threadRunnable2 = new Thread(runnable2);
        Thread threadRunnable3 = new Thread(runnable3);

        threadRunnable1.start();
        threadRunnable2.start();
        threadRunnable3.start();
    }
}
