package abstruct_employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========PartTime============");
        PartTime partTime = new PartTime("dara",2,12.30,2);
        partTime.displayPartTime();
        System.out.println("===========FullTime=============");
        FullTime fullTime = new FullTime("sok",5,500);
        fullTime.displayFullTime();
        System.out.println("============Sale=================");
        Sale sale = new Sale("bopha",3,300,100);
        sale.displaySale();

    }
}
