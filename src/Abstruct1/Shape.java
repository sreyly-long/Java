package Abstruct1;

 abstract class Shape {
     public double height;
     public double width;

     public double getHeight() {
         return height;
     }
     public double getWidth() {
         return width;
     }
     public double getPerimeter() {
         return (getHeight()*getWidth())/2;
     }
     public double getArea(){
         return getHeight()*getWidth();
     }

     abstract void result();


 }
