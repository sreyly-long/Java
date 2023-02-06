package Abstruct1;
 class Circle extends Shape {
     private double r;
     public void setR(double r) {
         this.r = r;
     }
     public double getR() {
         return r;
     }
     public Circle(double r){
         this.r = r;
     }
     @Override
     public double getPerimeter() {
         return 2*3.14*getR();
     }
     @Override
     public double getArea() {
         return 3.14*(getR()*getR());
     }
     @Override
     void result() {
         System.out.println("R="+getR());
         System.out.println("Perimeter="+getPerimeter());
         System.out.println("Area="+getArea());
     }
 }
