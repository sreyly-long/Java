package Interface1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50,20);
        rectangle.showRectangle();
        Circle circle = new Circle(2);
        circle.ShowCircle();
        Triangle triangle = new Triangle(4,5,3);
        triangle.showTriangle();
    }
}
