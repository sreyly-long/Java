package Inheritance3;

public class Dog extends Mammal{
    public void Greets(){
        System.out.println("Woof");
    }

    public Dog(String name) {
        super(name);
    }
    public String toString(){
        return "Dog:    Dog[Mammal[Animal[name='"+getName()+"']]]";
    }
}
