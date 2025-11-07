package Ngay7_CollectionsFrameWork.List.LamQuenList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong sinh vien muon them: ");
        int a = sc.nextInt();
        sc.nextLine();
        for ( int i = 0; i < a; i++){
            Student student = new Student();
            student.scanStudent(sc);
            studentList.add(student);
        }
        for (Student stu : studentList){
            stu.displayInfo();
        }
        Student highestGpaStudent = ManagerStudent.highestGpaStudent(studentList);
        if (highestGpaStudent != null) {
            System.out.println("Day la sinh vien co GPA cao nhat: " + highestGpaStudent.getName() + " " + highestGpaStudent.getGpa());
        }
        System.out.println("Nhap ten sinh vien muon xoa: ");
        String name = sc.nextLine();
        ManagerStudent.removeStudent(studentList,name);
        System.out.println("Danh sach sinh vien sau khi xoa: ");
        for (Student stu : studentList){
            stu.displayInfo();
        }
    }
}
