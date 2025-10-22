package Ngay4_Chot;

import java.util.Scanner;

//Sàng số nguyên tố (Kiểm tra Vòng lặp & Logic)
//Viết một chương trình cho người dùng nhập vào một số nguyên dương N.
//
//Phần a (Cơ bản): Viết một vòng lặp (for) để kiểm tra xem N có phải là số nguyên tố hay không.
//
//Gợi ý: Số nguyên tố là số chỉ chia hết cho 1 và chính nó. Bạn chỉ cần lặp từ 2 đến sqrt(N).
//
//Phần b (Nâng cao): In ra tất cả các số nguyên tố từ 2 cho đến N.
//
//Gợi ý: Dùng một vòng lặp bên ngoài để chạy từ 2 đến N, và bên trong dùng lại logic ở phần a để kiểm tra.
public class Bai_2 {
    public static boolean checkNT(int n){
        for ( int i = 2; i <= Math.sqrt(n); i++){
            if (n < 2) {
                return false;
            }
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so muon kiem tra: ");
        int n = sc.nextInt();
        if( n < 2){
            System.out.println("Day khong phai la so nguyen to");
            return;
        }
        if(checkNT(n)){
            System.out.println(n + " Day la so nguyen to");
        }
        else {
            System.out.println(n + " Day khong phai la so nguyen to");
        }
        System.out.println("Cac so nguyen to tu 2 den N: ");
        for ( int i = 2; i <= n; i++){
            if(checkNT(i)){
                System.out.println(i);
            };
        }
    }
}
