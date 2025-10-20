package Ngay2_Mang;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for ( int i = 0; i < a.length; i++ ){
            System.out.println("Nhap vao cac phan tu cua mang: ");
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;
        if(a.length < 2){
            System.out.println("Khong the tim so lon thu 2 vi mang co it hon 2 phan tu");
        }
        for( int i = 0; i < a.length; i++){
            if (a[i] > max) {
                maxSecond = max;
                max = a[i];
            }
            else if(a[i] >= maxSecond && a[i] < max){
                maxSecond = a[i];
            }
        }
        if(maxSecond == Integer.MIN_VALUE){
            System.out.println("Khong co so lon thu 2 vi mang gom cac so giong nhau");
        }
        else
            System.out.println("So lon thu 2 cua mang la: " + maxSecond);
    }
}
