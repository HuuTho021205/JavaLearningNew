package Ngay5_OOP.Abstract;

public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(){}
    public FullTimeEmployee(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
