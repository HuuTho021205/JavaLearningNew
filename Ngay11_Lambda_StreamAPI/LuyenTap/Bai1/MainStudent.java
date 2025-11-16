package Ngay11_Lambda_StreamAPI.LuyenTap.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("An", "IT", 9.0));
        studentList.add(new Student("Bình", "Kinh tế", 7.5));
        studentList.add(new Student("Chi", "IT", 8.0));
        studentList.add(new Student("Dũng", "Kinh tế", 8.5));
        studentList.add(new Student("Hà", "IT", 7.0));
        studentList.add(new Student("Linh", "Kinh tế", 6.5));

        Map<String,Double> gpaByDepart = studentList.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.averagingDouble(Student::getGpa)
                ));
        System.out.println(gpaByDepart);

    }
}
