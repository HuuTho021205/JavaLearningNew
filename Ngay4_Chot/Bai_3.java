package Ngay4_Chot;

import java.util.Scanner;

//Bảng điểm đơn giản (Bài "chốt hạ" - Tổng hợp tất cả)
//Viết một chương trình quản lý điểm cho một lớp học.
//Đầu tiên, hỏi người dùng muốn nhập điểm cho bao nhiêu sinh viên (n).
//Tạo một mảng double[] tên là scores với kích thước n.
//Dùng vòng lặp for để cho phép người dùng nhập điểm cho từng sinh viên và lưu vào mảng scores.
//Sau khi nhập xong, hãy viết code để thực hiện các chức năng sau:
//In ra toàn bộ danh sách điểm vừa nhập.
//Tìm và in ra điểm cao nhất trong lớp.
//Tìm và in ra điểm thấp nhất trong lớp.
//Tính và in ra điểm trung bình của cả lớp.
//Đếm và in ra số lượng sinh viên có điểm "Qua môn" (điểm >= 5.0).
public class Bai_3 {
    public static void inDs(double[] a){
        for ( double b : a){
            System.out.println(b);
        }
    }
    public static double maxScore(double [] a){
        double max = a[0];
        for ( double b : a){
            if(b > max){
                max = b;
            }
        }
        return max;
    }
    public static double minScore(double [] a){
        double min = a[0];
        for ( double b : a){
            if(b < min){
                min = b;
            }
        }
        return min;
    }
    public static double avgScore(double [] a ){
        double avgScore = 0;
        for ( double b : a){
            avgScore+=b;
        }
        return avgScore/a.length;
    }
    public static void quaMon(double [] a ){
        int count = 0;
        for ( double b : a){
            if ( b >= 5.0 ){
                count++;
                System.out.println(b);
            }
        }
        System.out.println("Tong so luong sinh vien qua mon trong danh sach la :" + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien muon nhap diem: ");
        int n = sc.nextInt();
        double [] scores = new double[n];
        if (n <= 0 ){
            System.out.println("Danh sach rong");
            return;
        }
        System.out.println("Nhap diem cho cac sinh vien: ");
        for ( int i =0; i < scores.length; i++){
            scores[i]= sc.nextDouble();
        }
        System.out.println("Danh sach diem vua nhap la: ");
        inDs(scores);
        double a = maxScore(scores);
        System.out.println("Diem cao nhat trong lop la: " + a);
        double b = minScore(scores);
        System.out.println("Diem thap nhat trong lop la: " + b);
        double c = avgScore(scores);
        System.out.println("Diem trung binh trong lop la: " + c);
        System.out.println("Danh sach cac sinh vien qua mon la: ");
        quaMon(scores);
    }
}
