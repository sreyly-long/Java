package Inheritence1;

public class Prodouct {
    private int code;
    private String name;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Prodouct(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public void Display(){
        System.out.println("Code:"+getCode());
        System.out.println("Name:"+getName());
    }
}
