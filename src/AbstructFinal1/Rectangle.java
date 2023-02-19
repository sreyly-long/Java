package AbstructFinal1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHight(double height) {
        this.height = height;
    }
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }
    public Rectangle(String color,double width, double height){
       super(color);
       this.width = width;
       this.height = height;
    }


    @Override
    double getArea() {
        return getWidth()*getHeight();
    }

    @Override
    double getPerimeter() {
        return (getWidth()+getHeight())*2;
    }
    public String toString(){
        return "Circle[Shape[color="+getColor()+"]"+", Width="+getWidth()+", Height="+getHeight()
                +", Area="+getArea()+", Perimeter="+getPerimeter()+"]";

    }
}
