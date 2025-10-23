package Ngay5_OOP.Encapsulation;

public class Student {
    private String name;
    private int age;
    private  String studentId;

    public Student(String name, int age, String studentId){
        this.name = name;
        this.setAge(age);
        this.studentId = studentId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        if(age < 0 || age > 100 ){
            System.out.println("Tuoi khong hop le");
            return;
        }
        this.age = age;
    }
    public String getStudentId(){
        return  studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    @Override
    public String toString(){
        return "{Student\n"+"Ten sinh vien: " + name +"\n"+"Ma sinh vien: " + studentId + "\n" +"Tuoi: " + age +"}" ;

    }
}
