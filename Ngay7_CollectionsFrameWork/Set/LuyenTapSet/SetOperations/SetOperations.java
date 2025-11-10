package Ngay7_CollectionsFrameWork.Set.LuyenTapSet.SetOperations;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Trong main: Tạo 2 Set<String> (dùng HashSet) đại diện cho 2 câu lạc bộ:
Set<String> clubA = Set.of("Alice", "Bob", "Charlie", "David");
Set<String> clubB = Set.of("Charlie", "David", "Eve", "Frank");
Yêu cầu 1 (Giao - Intersection):
Tìm những người ở cả hai câu lạc bộ.
Tạo một Set<String> mới intersection (lấy bản sao của clubA).
Dùng phương thức intersection.retainAll(clubB);
In ra intersection. (Kết quả phải là: [Charlie, David])
Yêu cầu 2 (Hợp - Union):
Tìm tất cả những người ở ít nhất một câu lạc bộ (không trùng lặp).
Tạo một Set<String> mới union (lấy bản sao của clubA).
Dùng phương thức union.addAll(clubB);
In ra union. (Kết quả phải là: [Alice, Bob, Charlie, David, Eve, Frank])
Yêu cầu 3 (Hiệu - Difference):
Tìm những người chỉ ở clubA mà không ở clubB.
Tạo một Set<String> mới difference (lấy bản sao của clubA).
Dùng phương thức difference.removeAll(clubB);
In ra difference. (Kết quả phải là: [Alice, Bob])*/
public class SetOperations {
    public static Set<String> intersection(Set<String> clubA, Set<String> clubB){
        Set<String> intersection = new HashSet<>(clubA);
        intersection.retainAll(clubB);
        return intersection;
    }
    public static Set<String> union(Set<String> clubA, Set<String> clubB){
        Set<String> union = new HashSet<>(clubA);
        union.addAll(clubB);
        return union;
    }
    public static Set<String> difference (Set<String> clubA, Set<String> clubB){
        Set<String> difference = new HashSet<>(clubA);
        difference.removeAll(clubB);
        return difference;
    }
    public static void main(String[] args) {
        Set<String> clubA = Set.of("Alice", "Bob", "Charlie", "David");
        Set<String> clubB = Set.of("Charlie", "David", "Eve", "Frank");
        System.out.println("Giao: ");
        Set<String> intersection = intersection(clubA,clubB);
        for (String a : intersection){
            System.out.println(a);
        }
        System.out.println("Hop: ");
        Set<String> union = union(clubA,clubB);
        for (String a : union){
            System.out.println(a);
        }
        System.out.println("Hieu: ");
        Set<String> difference = difference(clubA,clubB);
        for (String a : difference){
            System.out.println(a);
        }
    }
}

