package Ngay3_Mang_tt;

import java.util.Scanner;

//Loại bỏ các phần tử trùng lặp (tại chỗ)
//
//Yêu cầu: Cho một mảng đã sắp xếp, loại bỏ các phần tử trùng lặp ngay tại chỗ (in-place, không dùng mảng phụ)
// sao cho mỗi phần tử duy nhất chỉ xuất hiện một lần. Trả về độ dài mới của mảng.
//
//Ví dụ: [1, 1, 2, 2, 3, 4, 4] -> Sửa mảng thành [1, 2, 3, 4, ?, ?, ?] và trả về độ dài mới là 4.
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        if( n == 0){
            System.out.println("Mang co do dai la 0");
            return;
        }
        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int j = 1;
        for( int i = 1; i < a.length; i++){
            if(a[i] != a[j-1]) {
                a[j] = a[i];
                j++;
            }
        }
        System.out.println("Mang sau khi sap xep co do dai la: " + j);
        for(int b : a ){
            System.out.println(b);
        }
    }
}
