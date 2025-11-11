package Ngay7_CollectionsFrameWork.Map.LamQuenMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Trong main: Tạo một Map<String, String> tên là studentMap (dùng HashMap).
Key (Chìa khóa) sẽ là MSSV (ví dụ: "SV001").
Value (Giá trị) sẽ là Tên (ví dụ: "An Nguyễn").
Sử dụng put():
Thêm 3 sinh viên vào studentMap:
        "SV001", "An Nguyễn"
        "SV002", "Bình Lê"
        "SV003", "Chi Phạm"
Sử dụng get() (Tra cứu):
In ra tên của sinh viên có mã "SV002". (Kết quả phải là "Bình Lê").
In ra tên của sinh viên có mã "SV004" (một mã không tồn tại). (Kết quả phải là null).
Sử dụng put() (Cập nhật):
Thêm một sinh viên: studentMap.put("SV001", "Anh Trần");
Bây giờ, hãy in lại tên của sinh viên có mã "SV001".
Câu hỏi: Nó sẽ in ra "An Nguyễn" hay "Anh Trần"? (Bạn hãy tự chạy và xem kết quả của việc "ghi đè").
Sử dụng containsKey():
Kiểm tra xem mã "SV003" có tồn tại không (phải trả về true).
Kiểm tra xem mã "SV005" có tồn tại không (phải trả về false).*/
public class StudentDemoMap {
    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("SV001", "An Nguyễn");
        studentMap.put("SV002", "Bình Lê");
        studentMap.put("SV003", "Chi Phạm");

        System.out.println(studentMap.get("SV002"));
        System.out.println(studentMap.get("SV004"));
        studentMap.put("SV001", "Anh Trần");
        System.out.println(studentMap.get("SV001"));
        System.out.println(studentMap.containsKey("SV003"));
        System.out.println(studentMap.containsKey("SV005"));

        // duyet
        Set<String> key = studentMap.keySet();
        for (String k: key){
            System.out.println("Key: " + k);
        }

        Collection<String> values = studentMap.values();
        for (String v : values){
            System.out.println("Value: " + v);
        }
        Set<Map.Entry<String, String>> entries = studentMap.entrySet();
        for (Map.Entry<String, String> e : entries){
            String keyM = e.getKey();
            String valueM = e.getValue();
            System.out.println("Key: " + keyM + ", Value: " + valueM);
        }
    }
}
