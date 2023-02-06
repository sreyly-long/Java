package Interface1;

public class Triangle implements Shap{
    private int a;
    private int b;
    private int c;
    public Triangle(int a,int b,int c) {
        setA(a);
        setB(b);
        setC(c);
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getB() {
        return b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getC() {
        return c;
    }
    @Override
    public double getPerimeter() {
        return getA()+getB()+getC();
    }
    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p- getC()));
    }
    public void showTriangle(){
        System.out.println("A="+getA()+",B="+getB()+",C="+getC()+" ,Perimeter="+getPerimeter()+" ,Area="+getArea());
    }

}
