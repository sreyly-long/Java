package FinalExam;

public class Customer {
    private int id;
    private String name;
    private int discount;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public Customer(int id,String name,int discount){
        setId(id);
        setName(name);
        setDiscount(discount);
    }
    public String toString() {
        return getName()+"("+getId()+")"+
                "("+getDiscount()+"%)";

        }
}
