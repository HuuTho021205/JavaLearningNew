package Ngay5_OOP.Encapsulation;

public class Teacher extends Person{
    private double salary;
    private String subject;

    public Teacher(){
    }
    public Teacher(String name, int age, String address, double salary, String subject){
        super(name, age, address);
        this.salary = salary;
        this. subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return  "Teacher{" + super.toString() +
                " ,salary=" + salary +
                ", subject='" + subject + '\'' +
                '}';
    }
}
