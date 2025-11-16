package Ngay11_Lambda_StreamAPI.LuyenTap.Bai2;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private String className;
    private List<Student> students;

    public SchoolClass(String className, List<Student> students) {
        this.className = className;
        this.students = students;
    }

    public SchoolClass() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
