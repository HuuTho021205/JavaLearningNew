package Ngay5_OOP.Abstract;
/* 1. Tạo một abstract class Employee:
        * - Có các thuộc tính protected String name, protected double baseSalary.
        * - Có một constructor để khởi tạo các thuộc tính này.
        * - Có một phương thức ĐÃ CÓ CODE SẴN: public void displayInfo() để in ra tên và lương cơ bản.
        * - Có một phương thức TRỪU TƯỢNG: public abstract double calculateSalary();.
        *
        * 2.  Tạo 2 lớp con kế thừa từ Employee:
        * - FullTimeEmployee: Có thêm thuộc tính bonus.
 * - Ghi đè (@Override) phương thức calculateSalary() để trả về `baseSalary + bonus`.
        * - PartTimeEmployee: Có thêm thuộc tính hoursWorked và hourlyRate.
 * - Ghi đè (@Override) phương thức calculateSalary() để trả về `hoursWorked * hourlyRate`.
        *
        * 3.  Trong hàm main:
        * - Tạo một đối tượng FullTimeEmployee và một PartTimeEmployee.
        * - Gọi displayInfo() của cả hai.
        * - In ra tổng lương thực nhận của cả hai bằng cách gọi calculateSalary().
        */
public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(){
    }

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public String toString(){
        return "Ten: " + name + "\nLuong co ban: " + baseSalary;
    }
    public void displayInfo(){
        System.out.println(name);
        System.out.println(baseSalary);
    }
    public abstract double calculateSalary();
}
