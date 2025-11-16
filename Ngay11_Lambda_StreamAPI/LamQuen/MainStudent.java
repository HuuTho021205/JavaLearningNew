package Ngay11_Lambda_StreamAPI.LamQuen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Thọ",7.5));
        studentList.add(new Student("An",9.0));
        studentList.add(new Student("Bình",6.5));
        studentList.add(new Student("Chi",8.5));
        studentList.add(new Student("Dũng",8.0));

        List<String> stringList = studentList.stream()
                .filter(s-> s.getGpa() > 8.0)
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
