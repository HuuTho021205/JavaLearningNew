package Ngay2_Mang;

import java.util.Scanner;
import java.util.Arrays;

//Xoay vòng mảng (Rotate Array)
//
//Yêu cầu: Viết chương trình "xoay" các phần tử của mảng sang phải k bước.
//
//Ví dụ: [1, 2, 3, 4, 5] xoay k = 2 bước -> [4, 5, 1, 2, 3].
public class Bai_5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao so phan tu trong mang: ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        System.out.println("Nhap vao cac phan tu cua mang: ");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Nhap vao so buoc muon xoay: ");
//        int k = sc.nextInt();
//        int m =k;
//        while ( k > 0) {
//            int temp = a[a.length-1];
//            for (int i = a.length - 1 ; i > 0; i--) {
//                a[i] = a[i-1];
//            }
//            a[0] = temp;
//            k--;
//        }
//        System.out.println("Mang xoay khi xoay sang phai " + (m) + " buoc: ");
//        for (int b : a) {
//            System.out.println(b);
//        }
//    }
//}

    // Hàm phụ để đảo ngược một phần của mảng
    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vao so buoc muon xoay: ");
        int k = sc.nextInt();
        sc.close();

        // Tối ưu hóa số lần xoay
        k = k % n;

        // Tránh k âm nếu người dùng nhập số âm
        if (k < 0) {
            k = k + n;
        }

        // Áp dụng thuật toán đảo ngược
        reverse(a, 0, n - 1);       // 1. Đảo ngược toàn bộ mảng
        reverse(a, 0, k - 1);       // 2. Đảo ngược k phần tử đầu
        reverse(a, k, n - 1);       // 3. Đảo ngược n-k phần tử cuối

        System.out.println("Mang sau khi xoay " + k + " buoc: ");
        System.out.println(Arrays.toString(a)); // In ra mảng theo định dạng [4, 5, 1, 2, 3]
    }

}