package Ngay11_Lambda_StreamAPI.LuyenTap.Bai2;

import java.util.List;
import java.util.stream.Collectors;

public class MainSchool  {
    public static void main(String[] args) {
        List<Student> classA = List.of(
                new Student("An", 9.0),
                new Student("Binh", 7.0),
                new Student("Chau", 8.4)
        );
        List<Student> classB = List.of(
                new Student("Chi", 8.8),
                new Student("Dung", 8.2),
                new Student("Ha", 9.5)
        );
        SchoolClass class12A4 = new SchoolClass("12A4",classA);
        SchoolClass class12A5 = new SchoolClass("12A5",classB);

        List<SchoolClass> school = List.of(class12A4, class12A5);

        List<String>outStandingStudent = school.stream()
                .flatMap(s -> s.getStudents().stream())
                .filter(s->s.getGpa() > 8.5)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(outStandingStudent);
    }
}
