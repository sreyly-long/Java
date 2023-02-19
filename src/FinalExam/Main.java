package FinalExam;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(88,"Tan ah Teck",10);
        System.out.println(customer);

        customer.setDiscount(8);
        System.out.println(customer);
        System.out.println("ID is :"+customer.getId());
        System.out.println("Name is :"+customer.getName());
        System.out.println("Discount is :"+customer.getDiscount());

        Invoice invoice = new Invoice(101,customer,888.8);
        System.out.println(invoice);

        invoice.setAmount(999.9);
        System.out.println("id is: "+invoice.getId());
        System.out.println("customer is: "+invoice.getCustomer());
        System.out.println("amount is: "+invoice.getAmount());
        System.out.println("customer's id is: "+invoice.getCustomerID());
        System.out.println("customer's name is: "+invoice.getCustomerName());
        System.out.println("customer's discount is: "+invoice.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n",invoice.getAmountAfterDiscount());


    }



}
