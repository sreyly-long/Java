package Inheritence1;

public class Person {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public Person(String firstName,String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }
    public void Display(){
        System.out.println("FirstName: "+getFirstName());
        System.out.println("LastName : "+getLastName());
    }

}
