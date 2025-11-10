package Ngay7_CollectionsFrameWork.Set.LuyenTapSet.UniqueWordCounter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Tạo một phương thức: public static void countUniqueWords(String text)
Trong main: Gọi phương thức đó với một câu văn có nhiều từ trùng lặp.
Ví dụ: String passage = "hoc java la phai hoc ky java la mot ngon ngu java rat manh";
Logic bên trong phương thức:
Chuyển toàn bộ chuỗi về chữ thường (.toLowerCase()) để "Java" và "java" là một.
Tách chuỗi thành các từ (.split(" ")).
Tạo một List<String> từ các từ này.
Tạo một Set<String> (dùng HashSet) từ List ở trên (Gợi ý: new HashSet<>(yourList)).
In ra số lượng từ ban đầu (dùng list.size()).
In ra số lượng từ duy nhất (dùng set.size()).*/
public class Uniquewordcounter {
    public static void  countUniqueWords(String text){
        text = text.toLowerCase();
        List<String> wordList = new ArrayList<>(List.of(text.split(" ")));
        Set<String> wordSet = new HashSet<>(wordList);
        System.out.println(wordList.size());
        for (String a : wordList){
            System.out.println(a);
        }
        System.out.println(wordSet.size());
        for (String a : wordSet){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        String passage = "hoc java la phai hoc ky java la mot ngon ngu java rat manh";
        countUniqueWords(passage);
    }
}
