package Inheritance3;

public class Mammal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Mammal(String name){
        this.name = name;
    }

    public String toString(){
        return "Mammal: Mammal[Animal[name='"+getName()+"']]";
    }
}
