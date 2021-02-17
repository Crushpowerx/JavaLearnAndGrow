package singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(int i){
        System.out.println("Singleton instance " + i);
    }
    public static Singleton getInstance(int i){
        if (instance == null){
            instance = new Singleton(i);
        } else {
            System.out.println("Only one instance!!!");
            return instance;
        }
        return instance;
    }
}

class TestSingleton {
    public static void main(String[] args) {
        System.out.println("Return instance: " + Singleton.getInstance(1));
        System.out.println("Return instance: " + Singleton.getInstance(2));
        System.out.println("Return instance: " + Singleton.getInstance(3));
    }
}
