package Ngay7_CollectionsFrameWork.Set.LamQuenSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Trong main:
Tạo List<String> departmentA (dùng ArrayList).
Thêm vào: "Alice", "Bob", "Charlie", "David".
Tạo List<String> departmentB (dùng ArrayList).
Thêm vào: "Eve", "Charlie", "Frank", "Alice", "Grace".
Viết phương thức (cách làm TỐT):
public static Set<String> findCommonEmployees(List<String> deptA, List<String> deptB)
Logic bên trong phương thức:
Tạo một Set<String> commonEmployees = new HashSet<>(); (để lưu kết quả).
Tạo một Set<String> deptASet = new HashSet<>(deptA);
(Đây là bước "tối ưu": chuyển List A thành Set để tìm kiếm nhanh).
Dùng vòng lặp for-each duyệt qua deptB.
Với mỗi nhân viên trong deptB, dùng if (deptASet.contains(employee))
để kiểm tra xem deptASet có chứa nhân viên đó không.
Nếu contains trả về true, thêm nhân viên đó vào commonEmploye*/
public class Employee {
    public static Set<String> findCommonEmployees(List<String> deptA, List<String> deptB){
        Set<String> commonEmployess = new HashSet<>();
        Set<String> deptASet = new HashSet<>(deptA);
        for (String b : deptB){
            if (deptASet.contains(b)){
                commonEmployess.add(b);
            }
        }
        return commonEmployess;
    }
    public static void main(String[] args) {
        List<String> departmentA = new ArrayList<>();
        List<String> departmentB = new ArrayList<>();
        departmentA.addAll(List.of("Alice", "Bob", "Charlie", "David"));
        departmentB.addAll(List.of("Eve", "Charlie", "Frank", "Alice", "Grace"));
        Set<String> commonEmployees = findCommonEmployees(departmentA,departmentB);
        for (String a : commonEmployees){
            System.out.println(a);
        }

    }


}
