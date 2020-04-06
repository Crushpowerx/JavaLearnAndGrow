package OOP.Polymorphism;

public class Lion extends Animal {
    @Override
    public void run() {
        System.out.println("Лев бежит со скоростью 80 км/ч");
    }
}

class Tiger extends Animal {
    @Override
    public void run() {
        System.out.println("Тигр бежит со скоростью 60 км/ч");
    }
}

class Cheetah extends Animal {
    @Override
    public void run() {
        System.out.println("Гепард бежит со скоростью до 120 км/ч");
    }
}
