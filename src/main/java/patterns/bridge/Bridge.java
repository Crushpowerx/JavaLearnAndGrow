package patterns.bridge;

interface Model {
    void drive(String str);
}

public class Bridge {
    public static void main(String[] args) {
        Vehicle toyotaCar = new Car(new Toyota());
        toyotaCar.drive();
        Vehicle audiTrack = new Track(new Audi());
        audiTrack.drive();
    }
}

abstract class Vehicle {
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}

class Car extends Vehicle {

    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive car ");
    }
}

class Track extends Vehicle {

    public Track(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive track ");
    }
}

class Audi implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + "audi");
    }
}

class Toyota implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + "toyota");
    }
}
