package FinalExam;

public class Invoice{
    private int id;
    private double amount;
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCustomerID() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount*(100-customer.getDiscount())/100;
    }

    public Invoice(int id,Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice[id = "+getId()+
                ", customer = "+getCustomer()+
                ", "+"amount = "+getAmount()+"]";
    }
}
