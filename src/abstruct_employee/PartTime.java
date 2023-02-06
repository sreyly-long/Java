package abstruct_employee;
 public class PartTime extends Employee{
     private double hour;
     private double rate;
     public void setHour(double hour) {
         this.hour = hour;
     }
     public double getHour() {
         return hour;
     }
     public void setRate(double rate) {
         this.rate = rate;
     }
     public double getRate() {
         return rate;
     }
     public PartTime(String name, int id, double hour,double rate) {
         super(name,id);
         setHour(hour);
         setRate(rate);
     }
     @Override
     public double getSalary() {
         return getHour()*getRate();
     }
     @Override
     public double getTax() {
         return getSalary()*0.1;
     }
     @Override
     public double getIncome() {
         return getSalary()-getTax();
     }
     public void displayPartTime(){
         System.out.println("Name:"+getName());
         System.out.println("ID:"+getId());
         System.out.println("Hour:"+getHour());
         System.out.println("Rate:"+getRate());
         System.out.println("Salary:"+getSalary());
         System.out.printf("Tax: %.2f\n", getTax());
         System.out.println("Income:"+getIncome());
     }
 }
