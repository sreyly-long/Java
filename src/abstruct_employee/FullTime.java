package abstruct_employee;

public class FullTime extends Employee{
    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public double getTax() {
        return getSalary()*0.5;
    }
    @Override
    public double getIncome() {
        return getSalary()-getTax();
    }
    public FullTime(String name,int id,double salary){
        super(name,id);
        setSalary(salary);
    }
    public void displayFullTime(){
        super.Display();
        System.out.println("Salary:"+getSalary());
        System.out.printf("Tax: %.2f",getTax());
        System.out.println("Income:"+getIncome());
    }
}
