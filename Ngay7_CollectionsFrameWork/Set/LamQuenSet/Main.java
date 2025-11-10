package Ngay7_CollectionsFrameWork.Set.LamQuenSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*trong main: Tạo một List<String> tên là emailList (dùng ArrayList).
Thêm các email sau vào list (chú ý sự trùng lặp cố ý):
        "userA@gmail.com"
        "userB@gmail.com"
        "userA@gmail.com" (Trùng)
        "userC@gmail.com"
        "userB@gmail.com" (Trùng)
Sử dụng Set để lọc:
Tạo một Set<String> mới (sử dụng new HashSet<>()).
Thêm tất cả phần tử từ emailList vào Set này (Gợi ý:
Dùng addAll() hoặc một vòng lặp for-each).
In kết quả:
In ra emailList.size() (số lượng email ban đầu).
In ra Set (để thấy các phần tử trùng đã biến mất).
In ra Set.size() (số lượng email duy nhất).*/
public class Main {
    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();
        emailList.add("userA@gmail.com");
        emailList.add("userB@gmail.com");
        emailList.add("userA@gmail.com");
        emailList.add("userC@gmail.com");
        emailList.add("userB@gmail.com");
       /* Set<String> emailListnew = new HashSet<>();
        for (String a : emailList){
            emailListnew.add(a);
        }*/
        Set<String> emailListnew = new HashSet<>(emailList);
        System.out.println(emailList.size());
        for (String a : emailListnew){
            System.out.println(a);
        }
        System.out.println(emailListnew.size());

    }
}
