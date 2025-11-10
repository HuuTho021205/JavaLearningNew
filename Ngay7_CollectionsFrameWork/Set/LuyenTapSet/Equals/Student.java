package Ngay7_CollectionsFrameWork.Set.LuyenTapSet.Equals;

import java.util.Objects;

/*Tạo lớp Student: Gồm 2 thuộc tính: String studentId (mã số) và String name.
Trong main:
Tạo một Set<Student> classSet = new HashSet<>();.
Thêm 3 sinh viên:
        classSet.add(new Student("SV001", "An Nguyen"));
        classSet.add(new Student("SV002", "Binh Le"));
        classSet.add(new Student("SV001", "Anh Tran"));
(Cố tình thêm một sinh viên có mã SV001 trùng nhưng tên khác).
In ra classSet.size().
Kết quả bạn sẽ thấy (Lúc đầu):
Chương trình sẽ in ra 3. Set đã thất bại trong việc lọc trùng lặp!
Thử thách (Bắt buộc phải làm):
Quay lại lớp Student. Bạn phải @Override (ghi đè) hai phương thức: equals() và hashCode().
equals(Object obj): Định nghĩa rằng "hai Student là bằng nhau
nếu studentId của họ bằng nhau." (Không quan tâm đến tên).
hashCode(): Định nghĩa rằng "hashCode của Student phải được tính dựa trên studentId."
(Gợi ý: Dùng IDE (IntelliJ/Eclipse) để tự động tạo 2 phương thức này.
Bấm chuột phải -> Generate -> equals() and hashCode() -> Chỉ chọn studentId).*/
public class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }
}
