package Inheritance3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Koko");
        System.out.println(animal);

        Mammal mammal = new Mammal("Yona");
        System.out.println(mammal);

        Cat cat = new Cat("dora");
        System.out.println(cat);

        Dog dog = new Dog("choko");
        System.out.println(dog);
    }
}
