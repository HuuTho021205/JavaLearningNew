package Ngay11_Lambda_StreamAPI.LuyenTap.Bai1;

public class Student {
    private String name;
    private String department;
    private double gpa;

    public Student(String name, String department, double gpa) {
        this.name = name;
        this.department = department;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
