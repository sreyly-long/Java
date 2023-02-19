package Inheritence1;

public class Employee extends Person{
    private int id;
    private double hour;
    private double rate;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

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
    public Employee(String firstName,String lastName,int id,double hour,double rate){
       super(firstName,lastName);
        setId(id);
        setHour(hour);
        setRate(rate);
    }
    public void showResult(){
        super.Display();
        System.out.println("ID:"+getId());
        System.out.println("Hour:"+getHour());
        System.out.println("Rate:"+getRate());
    }

}
