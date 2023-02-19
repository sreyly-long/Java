package AbstructFinal1;

public class Circle extends Shape{
    private double radius;
    public Circle(){

        super("red");
        radius = 1.0;
    }
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14*getRadius()*getRadius();
    }

    @Override
    double getPerimeter() {
        return 2*3.14*getRadius();
    }
    public String toString(){
        return "Circle[Shape[color="+getColor()+"]"+", Radius="+getRadius()
                +", Area="+getArea()+", Perimeter="+getPerimeter()+"]";
    }
}
