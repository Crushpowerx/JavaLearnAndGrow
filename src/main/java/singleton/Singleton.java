package singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(int i){
        System.out.println("Singleton " + i);
    }
    public static void getInstance(int i){
        if (instance == null){
            instance = new Singleton(i);
            System.out.println("Created instance!!!");
        } else {
            System.out.println("Only one instance!!!");
        }
    }
}

class test {
    public static void main(String[] args) {
        Singleton.getInstance(1);
        Singleton.getInstance(2);
        Singleton.getInstance(3);
    }
}
