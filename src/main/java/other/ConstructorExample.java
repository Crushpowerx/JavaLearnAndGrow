package other;

public class ConstructorExample {
    String name;
    int age;

    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample("Name", 10);
        System.out.println(constructorExample.name);
        System.out.println(constructorExample.age);
    }
}
