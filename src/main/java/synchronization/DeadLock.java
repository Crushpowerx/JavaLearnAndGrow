package synchronization;

public class DeadLock {
    public static void main(String[] args) {
        final Integer r1 = 10;
        final Integer r2 = 15;

        DeadlockThread threadR1R2 = new DeadlockThread(r1, r2);
        DeadlockThread threadR2R1 = new DeadlockThread(r2, r1);

        new Thread(threadR1R2).start();
        new Thread(threadR2R1).start();
    }
}

/**
 * Класс, который принимает два ресурса
 */
class DeadlockThread implements Runnable {

    private final Integer r1;
    private final Integer r2;

    public DeadlockThread(Integer r1, Integer r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() {
        synchronized (r1) {
            System.out.println(Thread.currentThread().getName() + " захватил ресурс: " + r1);

            synchronized (r2) {
                System.out.println(Thread.currentThread().getName() + " захватил ресурс: " + r2);
            }
        }
    }
}
