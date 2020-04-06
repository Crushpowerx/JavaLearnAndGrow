package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();
        Lion simba = new Lion();
        Tiger sherekhan = new Tiger();
        Cheetah chester = new Cheetah();

        aibolit.healAnimal(simba);
        aibolit.healAnimal(sherekhan);
        aibolit.healAnimal(chester);
    }
}
