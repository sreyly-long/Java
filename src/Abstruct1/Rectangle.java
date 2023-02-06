package Abstruct1;

  class Rectangle extends Shape {
      @Override
      void result() {
          System.out.println("Height="+getHeight());
          System.out.println("width="+getWidth());
          System.out.println("Perimeter="+getPerimeter());
          System.out.println("Area="+getArea());
      }
      public Rectangle(double height,double width){
          this.height = height;
          this.width = width;
      }
  }
