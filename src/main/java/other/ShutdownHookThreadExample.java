package other;

public class ShutdownHookThreadExample extends Thread {

    public void run() {
        System.out.println("shutdown hook задачу выполнил");
    }

    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new ShutdownHookThreadExample());

        System.out.println("Теперь программа засыпает, нажмите ctrl+c чтоб завершить ее.");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
