package Ngay7_CollectionsFrameWork.List.LamQuenList;

import java.util.Iterator;
import java.util.List;

public class ManagerStudent {



    public static Student highestGpaStudent(List<Student> studentList){
        if (studentList.isEmpty()){
            System.out.println("Khong co sinh vien nao");
            return null;
        }
        Student highestStudent = studentList.get(0);
        for (Student stu : studentList ){
            if(stu.getGpa() > highestStudent.getGpa()){
                highestStudent = stu;
            }
        }
        return highestStudent;
    }
    public static void removeStudent(List<Student> studentList, String nameStudent){
        if (studentList.isEmpty()){
            System.out.println("Danh sach trong");
            return;
        }
        boolean find = false;
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student studentRemove = iterator.next();
            if (studentRemove.getName().equalsIgnoreCase(nameStudent)){
                iterator.remove();
                System.out.println("Da xoa sinh vien thanh cong");
                find = true;
            }
        }
        if (!find){
            System.out.println("Khong tim thay sinh vien can tim");
        }
    }
}
