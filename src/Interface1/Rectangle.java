package Interface1;

import java.lang.reflect.Parameter;

public class Rectangle implements Shap {

    private double height;
    private double width;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return (getHeight() * getWidth()) / 2;
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public void showRectangle() {
        System.out.println("Height= " + getHeight() + " ,Width=" + getWidth() + " ,Perimeter=" + getPerimeter() + " ,Area=" + getArea());
    }
}
