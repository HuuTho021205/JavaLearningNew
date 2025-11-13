package Ngay8_Exception.LamQuenException;

public class SafeCode {
        public static void main(String[] args) {
            System.out.println("Bắt đầu...");

            try {
                // Đặt code nguy hiểm vào try
                int result = 10 / 0;
                System.out.println("Kết quả: " + result); // Dòng này bị bỏ qua
            } catch (ArithmeticException e) {
                // Chỉ chạy khi có lỗi
                System.out.println("LỖI: Không thể chia cho 0!");
                System.out.println("Thông báo lỗi: " + e.getMessage());
            } finally {
                // Luôn luôn chạy
                System.out.println("Khối finally: Dọn dẹp xong.");
            }

            System.out.println("Kết thúc."); // Dòng này vẫn chạy
        }
}
