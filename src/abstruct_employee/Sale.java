package abstruct_employee;

public class Sale extends Employee{
    private double base;
    private double amount;
    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public Sale(String name,int id,double base,double amount){
        super(name,id);
        setBase(base);
        setAmount(amount);
    }
    @Override
    public double getSalary() {
        return getBase()+(getAmount()*0.3);
    }
    @Override

    public double getTax() {
        return (getAmount()*0.3)*0.15;
    }
    @Override
    public double getIncome() {
        return getSalary()-getTax();
    }
    public void displaySale(){
        super.Display();
        System.out.println("Base:"+getBase());
        System.out.println("Amount:"+getAmount());
        System.out.println("Salary:"+getSalary());
        System.out.printf("Tax: %.2f\n", getTax());
        System.out.println("Income:"+getIncome());
    }
}
