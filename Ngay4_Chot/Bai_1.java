package Ngay4_Chot;

import java.util.Scanner;

//Máy tính chỉ số BMI (Kiểm tra Biến, Toán tử, if/else)
//Viết một chương trình cho phép người dùng nhập vào cân nặng (kg) và chiều cao (mét).
//
//Sử dụng các biến double để lưu trữ cân nặng và chiều cao.
//
//Tính chỉ số BMI theo công thức: BMI = cân nặng / (chiều cao * chiều cao).
//
//Dựa vào chỉ số BMI, dùng if/else if/else để in ra màn hình tình trạng cơ thể của người dùng theo tiêu chuẩn của WHO:
//
//BMI < 18.5: Gầy (Thiếu cân)
//
//18.5 <= BMI < 24.9: Bình thường
//
//25 <= BMI < 29.9: Thừa cân
//
//BMI >= 30: Béo phì
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao can nang (kg): ");
        double kg = sc.nextDouble();
        System.out.println("Nhap vao chieu cao (m): ");
        double m = sc.nextDouble();
        if(m == 0 || kg ==0){
            System.out.println("Du lieu khong hop le ");
            return;
        }
        String phanLoai;
        double BMI = kg / (m*m);
        if ( BMI < 18.5){
            phanLoai ="Thieu can";
        }
        else if ( BMI < 24.9){
            phanLoai ="Binh thuong";
        }
        else if ( BMI < 29.9 ){
            phanLoai="Thua can ";
        }
        else {
            phanLoai="Beo Phi";
        }
        System.out.println("Voi chi so BMI la " + String.format("%.2f",BMI) + " thi tinh trang co the hien tai la: " + phanLoai);
    }
}
