package Abstruct1;

public class Main {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(9,9);
        System.out.println("==============Rectangle==============");
       rectangle.result();
        System.out.println("==============Circle=================");
       Circle circle = new Circle(2.5);
       circle.result();
        System.out.println("==============Triangle================");
        Triangle triangle = new Triangle(2,5,6);
        triangle.result();

    }
}
