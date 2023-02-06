package Interface1;

public class Circle implements Shap{

    private double r;

    public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*getR();
    }


    @Override
    public double getArea() {
        return 3.14*(getR()*getR());
    }
    public Circle(double r){
        setR(r);
    }
    public void ShowCircle(){
        System.out.println("R= "+getR()+" ,Parameter="+getPerimeter()+" ,Area="+getArea());
    }
}
