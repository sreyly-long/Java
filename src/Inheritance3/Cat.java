package Inheritance3;

public class Cat extends Mammal{

    public void Greets(){
        System.out.println("Meow");
    }
    public Cat(String name) {
        super(name);
    }
    public String toString(){
        return "Cat:    Cat[Mammal[Animal[name='"+getName()+"']]]";
    }
}
