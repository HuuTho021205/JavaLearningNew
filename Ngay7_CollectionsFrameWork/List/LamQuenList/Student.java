package Ngay7_CollectionsFrameWork.List.LamQuenList;
/*Tạo một chương trình quản lý sinh viên đơn giản.
Tạo một lớp Student với 2 thuộc tính: String name và double gpa.
Trong hàm main, tạo một List<Student> tên là studentList (sử dụng ArrayList).
Thêm 3 sinh viên vào studentList.
Duyệt và In: Dùng vòng lặp for-each để in ra tên và GPA của tất cả sinh viên.
Tìm "Thủ khoa": Viết một đoạn logic (dùng vòng lặp)
để tìm sinh viên có GPA cao nhất trong List và in ra tên của sinh viên đó.
Xóa sinh viên: Tìm và xóa một sinh viên cụ thể khỏi List
dựa trên tên (Gợi ý: Dùng Iterator giống như bài RPG để duyệt và xóa an toàn).*/

import java.util.Scanner;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void scanStudent(Scanner scanner){
        System.out.println("Nhap vao ten sinh vien: ");
        this.name = scanner.nextLine();
        System.out.println("Nhap vao GPA: ");
        this.gpa = Double.parseDouble(scanner.nextLine());

    }
    public void displayInfo(){
        System.out.println(getName() + " "+ getGpa());
    }
}
