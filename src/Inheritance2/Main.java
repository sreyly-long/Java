package Inheritance2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("dara","12");
        System.out.println(person);

        Student student = new Student("sreyly","tik thla","java",3,12.0);
        System.out.println(student);

        Staff staff = new Staff("Mengly","Thul kok","RUPP",15.0);
        System.out.println(staff);
    }

}
