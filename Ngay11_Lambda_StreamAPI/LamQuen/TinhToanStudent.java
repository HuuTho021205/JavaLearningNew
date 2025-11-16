package Ngay11_Lambda_StreamAPI.LamQuen;

import java.util.ArrayList;
import java.util.List;

public class TinhToanStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Thọ",7.5));
        studentList.add(new Student("An",9.0));
        studentList.add(new Student("Bình",6.5));
        studentList.add(new Student("Chi",8.5));
        studentList.add(new Student("Dũng",8.0));

        // tính điểm trung bình
        double averageScore = studentList.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
        System.out.println(averageScore);
        //tìm sinh viên có gpa cao nhất
        studentList.stream()
                .max((s1,s2) -> Double.compare(s1.getGpa(), s2.getGpa()))
                .ifPresent(s -> System.out.println("Sinh viên có điểm cao nhất là: " + s.getGpa()));
        // tìm sinh viên có gpa thấp nhất
        studentList.stream()
                .min((s1,s2)-> Double.compare(s1.getGpa(), s2.getGpa()))
                .ifPresent(s-> System.out.println("Sinh viên có điểm thấp nhất là: " + s.getGpa()));
    }
}
