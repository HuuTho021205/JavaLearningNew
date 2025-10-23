package Ngay5_OOP.Encapsulation;
/*Quản lý Nhân sự Cơ bản 👨‍👩‍👧
Mục tiêu: Nắm vững cú pháp extends và cách lớp con sử dụng thuộc tính của lớp cha.
Tạo lớp cha Person:
Gồm các thuộc tính private chung: String name, int age, String address.
Tạo constructor và các phương thức getters/setters cho các thuộc tính này.
Tạo lớp con Student kế thừa từ Person:
Dùng từ khóa extends Person.
Thêm các thuộc tính private riêng: String studentId, double gpa.
Tạo constructor và getters/setters cho các thuộc tính riêng này.
Tạo lớp con Teacher kế thừa từ Person:
Dùng từ khóa extends Person.
Thêm các thuộc tính private riêng: double salary, String subject.
Tạo constructor và getters/setters cho các thuộc tính riêng này.
Trong hàm main:
Tạo một đối tượng Student và một đối tượng Teacher.
Sử dụng các phương thức setter để gán giá trị cho cả thuộc tính kế thừa (name, age) và thuộc tính riêng (gpa, salary).
In tất cả thông tin ra màn hình để kiểm tra.*/
public class Person {
    private String name;
    private int age;
    private String address;

    public Person (String name, int age , String address ){
        this.name =name;
        this.setAge(age);
        this.address = address;
    }
    public Person(){
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<0 || age > 100){
            System.out.println("Tuoi khong hop le");
            return;
        }
        this.age =age;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\''
                ;
    }
}
