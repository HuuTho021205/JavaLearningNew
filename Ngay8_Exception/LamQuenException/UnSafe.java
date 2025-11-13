package Ngay8_Exception.LamQuenException;

public class UnSafe {
    public static void main(String[] args) {
        System.out.println("Bắt đầu...");
        int result = 10 / 0; // Gây ra lỗi
        System.out.println("Kết thúc."); // Dòng này không bao giờ chạy
    }
}
