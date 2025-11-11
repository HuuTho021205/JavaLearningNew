package Ngay7_CollectionsFrameWork.Map.LuyenTapMap;

import java.util.HashMap;
import java.util.Map;

/*Trong main:
Tạo Map<Student, Double> gpaMap = new HashMap<>();. (Key là Student, Value là Double).
Tạo một sinh viên: Student s1 = new Student("SV001", "An Nguyen");
"Cất" điểm của sinh viên đó vào Map: gpaMap.put(s1, 8.5);
In ra kích thước Map (sẽ là 1).*/
public class MainStudent {
    public static void main(String[] args) {
        Map<Student, Double> gpaMap = new HashMap<>();
        Student s1 = new Student("SV001", "An Nguyen");
        gpaMap.put(s1, 8.5);
        System.out.println(gpaMap.size());
        Student s2 = new Student("SV001", "An Nguyen");
        System.out.println(gpaMap.get(s2));
    }

}
