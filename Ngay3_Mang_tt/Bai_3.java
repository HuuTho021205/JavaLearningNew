package Ngay3_Mang_tt;

import java.util.Arrays;
import java.util.Scanner;

//Tìm tổng mảng con lớn nhất (Kadane's Algorithm)
//        Yêu cầu: Cho một mảng số nguyên (có cả số âm).
//Tìm mảng con liên tục (các phần tử liền kề nhau) có tổng lớn nhất và trả về tổng đó.
//
//Ví dụ: [-2, 1, -3, 4, -1, 2, 1, -5, 4] -> Mảng con lớn nhất là [4, -1, 2, 1] có tổng là 6.
public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        if (n==0){
            System.out.println("Mang rong, khong co tong nao");
            return;
        }
        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // duyet mang
        int maxSum = a[0];
        int currentSum = a[0];
        int currentStart = 0;
        int bestStart = 0;
        int bestEnd = 0;
        for ( int i =1; i < a.length; i++){
            int num = a[i];

            if(num >  currentSum + num){
                currentSum = num;
                currentStart = i;
            }
            else {
                currentSum += num;
            }
            if(maxSum < currentSum){
                maxSum = currentSum;
                bestStart = currentStart;
                bestEnd = i;
            }

        }
        int [] b =Arrays.copyOfRange(a,bestStart,bestEnd+1);
        System.out.println("Mang: " + Arrays.toString(a));
        System.out.println("Tong mang con lon nhat la: " + maxSum);
        System.out.println("Mang con ung voi tong lon nhat la: " +Arrays.toString(b) );

    }
}
