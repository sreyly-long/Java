package abstruct_employee;

abstract class Employee {
    private String name;
    private int id;
    abstract public double getSalary();
    abstract public double getTax();
    abstract public double getIncome();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employee(String name,int id){
        setName(name);
        setId(id);
    }
    public void Display(){
        System.out.println("Name:"+getName());
        System.out.println("ID:"+getId());
    }
}
