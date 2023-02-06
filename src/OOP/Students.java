package OOP;

public class Students {
    private String name;
    private int age;
    private String sex;
    private double java,html,css;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {

        return sex;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getJava() {
        return java;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getHtml() {
        return html;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getCss() {
        return css;
    }
    public double getTotal(){
        return getJava()+getHtml()+getCss();
    }
    public double getAverage(){
        return getTotal()/3;
    }
    public String getGrade(){
        String Grade = " ";
        if (getAverage()>=90){
            Grade = "A";
        }else if (getAverage()>=80){
            Grade = "B";
        }else if (getAverage()>=70){
            Grade = "C";
        } else if (getAverage()>=60) {
            Grade = "D";
        }else if (getAverage()>=50){
            Grade  = "E";
        }
        return Grade ;
    }
    public Students(String name,int age,String sex,double java,double html,double css){
        setName(name);
        setAge(age);
        setSex(sex);
        setJava(java);
        setHtml(html);
        setCss(css);
    }
    public void ShowResult(){
        System.out.printf("Name:"+getName());
        System.out.printf("\nAge: "+getAge());
        System.out.printf("\nSex: "+getSex());
        System.out.printf("\nJava:"+getJava());
        System.out.printf("\nHTML: "+getHtml());
        System.out.printf("\nCSS: "+getCss());
        System.out.println("\ntotal: "+getTotal());
        System.out.println("Average: "+getAverage());
        System.out.println("Grade: "+getGrade());

    }
}
