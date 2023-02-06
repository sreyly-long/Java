package Inheritence;

public class Main {
    public static void main(String[] args) {
      OrderProduct orderProduct = new OrderProduct(1,"dara",12.99,2);
      Employee employee = new Employee("Sok","Chanda",2,12.30,1.2);
      orderProduct.Display();
        System.out.println("======================================");
      employee.showResult();
    }
}
