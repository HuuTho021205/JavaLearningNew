package Ngay7_CollectionsFrameWork.Map.LuyenTapMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Trong main: Tạo một chuỗi: String passage = "hoc java la phai hoc ky java la mot ngon ngu java rat manh hoc";
Viết phương thức: public static Map<String, Integer> countWordFrequency(String text)
Logic bên trong phương thức:
Tạo một Map<String, Integer> wordCountMap = new HashMap<>();
Chuyển chuỗi text về chữ thường (toLowerCase()) và tách thành mảng các từ (split(" ")).
Dùng vòng lặp for-each để duyệt qua mảng các từ này.
Với mỗi word trong vòng lặp, bạn phải thực hiện logic "check-get-update-put" (kiểm tra-lấy-cập nhật-đặt):
Kiểm tra: Dùng if (wordCountMap.containsKey(word)) để xem từ này đã có trong Map chưa.
Nếu CHƯA (Lần đầu tiên thấy):
wordCountMap.put(word, 1); (Đặt số đếm là 1).
Nếu CÓ (Đã thấy trước đó):
Lấy số đếm cũ: int oldCount = wordCountMap.get(word);
Tăng số đếm: int newCount = oldCount + 1;
Ghi đè (cập nhật) số đếm mới: wordCountMap.put(word, newCount);
Cuối cùng, return wordCountMap.
Trong main:
Gọi phương thức countWordFrequency và lưu kết quả.
In ra Map kết quả (Bạn sẽ thấy một thứ gì đó như {java=3, hoc=2, la=2, ...}).*/
public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text){
        Map<String, Integer> wordCountMap = new HashMap<>();
        text = text.toLowerCase();
        String [] arrayWord = text.split(" ");
        for (String w : arrayWord){
            if (!wordCountMap.containsKey(w)){
                wordCountMap.put(w, 1);
            }
            else {
                int oldCount = wordCountMap.get(w);
                int newCount = oldCount + 1;
                wordCountMap.put(w, newCount);
            }
        }
        return wordCountMap;
    }
    public static void main(String[] args) {
        String passage = "hoc java la phai hoc ky java la mot ngon ngu java rat manh";
        Map<String, Integer> count = countWordFrequency(passage);
        System.out.println(count);
    }
}
