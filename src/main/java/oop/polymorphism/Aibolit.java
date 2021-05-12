package oop.polymorphism;

public class Aibolit {
    public void healAnimal(Animal animal) {
        System.out.println("Пациент здоров!");
        animal.run();
    }
}
