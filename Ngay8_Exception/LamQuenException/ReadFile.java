package Ngay8_Exception.LamQuenException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {

        public static void readFile(String filePath) {

            // Cú pháp "try-with-resources"
            // Tự động đóng file (tự gọi .close() trong finally)
            try ( FileReader fr = new FileReader(filePath);
                  BufferedReader br = new BufferedReader(fr) ) {

                System.out.println("--- Bắt đầu đọc file ---");
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("--- Kết thúc đọc file ---");

            } catch (FileNotFoundException e) {
                // Đây là Checked Exception compiler BẮT chúng ta phải xử lý
                // Chạy khi file không tồn tại
                System.out.println("LỖI: Không tìm thấy file tại đường dẫn: " + filePath);

            } catch (IOException e) {
                // Đây cũng là Checked Exception (là "cha" của FileNotFoundException)
                // Chạy khi có lỗi chung (ví dụ: ổ cứng hỏng)
                System.out.println("LỖI: Đã xảy ra lỗi khi đọc file.");
                e.printStackTrace(); // In ra chi tiết lỗi
            }
        }

        public static void main(String[] args) {
            // 1. Thử đọc một file không tồn tại
            System.out.println("--- Thử lần 1 (File không tồn tại) ---");
            readFile("file_khong_ton_tai.txt");

            // 2. Tự tạo 1 file .txt (ví dụ: data.txt)
            //    bên cạnh file .java của bạn và ghi vài dòng vào
            //    rồi chạy lại với tên file đúng.
            System.out.println("\n--- Thử lần 2 (File tồn tại) ---");
            // (Tự tạo file data.txt và chạy)
             readFile("src/Ngay8_Exception/LamQuenException/data.txt");
        }
}
