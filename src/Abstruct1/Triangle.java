package Abstruct1;

 class Triangle extends Shape{
     private int a,b,c;

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
         return (this.a+this.b+this.c)/2;
     }
     public double getArea(){
         return Math.sqrt(this.getPerimeter());
     }
     public Triangle(int a, int b, int c){
         this.a = a;
         this.b = b;
         this.c = c;
     }

     @Override
     void result() {
         System.out.println("A="+getA()+" ,B="+getB()+" ,C="+getC());
         System.out.println("Perimeter="+getPerimeter());
         System.out.println("Area="+getArea());
     }
 }
