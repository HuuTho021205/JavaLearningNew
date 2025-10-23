package Ngay5_OOP.Encapsulation;

public class Studentt extends Person {
    private String studentId;
    private double gpa;

    public Studentt(){
    }
    public  Studentt(String name, int age, String address, String studentId, double gpa){
        super(name, age, address);
        this.studentId = studentId;
        this.setGpa(gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa < 0 || gpa >4.0){
            System.out.println("Gpa khong hop le");
            return;
        }
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  "Studentt{" + super.toString() +
                " ,studentId='" + studentId + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
