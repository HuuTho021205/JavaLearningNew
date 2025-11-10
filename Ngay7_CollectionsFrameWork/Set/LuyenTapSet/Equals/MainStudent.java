package Ngay7_CollectionsFrameWork.Set.LuyenTapSet.Equals;

import java.util.HashSet;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args) {
        Set<Student> classSet = new HashSet<>();
        classSet.add(new Student("SV001","Tran Dinh Huu Tho"));
        classSet.add(new Student("SV002","Huu Tho"));
        classSet.add(new Student("SV001","Tran Tho"));
        System.out.println(classSet.size());

    }
}
