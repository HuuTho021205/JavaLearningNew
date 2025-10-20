package Ngay2_Mang;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap vao cac phan tu cua mang: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vao phan tu can xoa trong mang: ");
        int b = sc.nextInt();
        int dem = 0;
        for ( int e : a){
            if ( e == b){
                dem++;
            }
        }
        int[] c = new int[n-dem];
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b) {
                c[d] = a[i];
                d++;
            }
        }
        System.out.println("Mang sau khi xoa phan tu " + b + " la: ");
        for (int e : c) {
            System.out.println(e);
        }
    }
}
