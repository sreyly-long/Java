package Inheritance3;

public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Animal:  Animal[name ='"+getName()+"']";



    }
}
