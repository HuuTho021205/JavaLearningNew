package Ngay2_Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang 1: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang 1: ");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vao so phan tu trong mang 2: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Nhap vao cac phan tu cua mang 2: ");
        for (int i = 0; i < a.length; i++){
            b[i] = sc.nextInt();
        }
        int [] c = new int[n+m];
        System.arraycopy(a, 0, c,0,n);// sao chep mang a vao c=> mang a tu vi tri 0 , mang c tu 0, den cuoi mang a la n
        System.arraycopy(b,0,c,n,m);// sao chep mang b vao c => mang b tu vi tri 0, mang c tu vi tri n, den cuoi mang b la m

//        int[] c = new int[n+m];
//        int d = 0;
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("Nhap vao cac phan tu cua mang 1: ");
//            a[i] = sc.nextInt();
//            c[d] = a[i];
//            d++;
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.println("Nhap vao cac phan tu cua mang 2: ");
//            b[i] = sc.nextInt();
//            c[d] = b[i];
//            d++;
//        }
        Arrays.sort(c);
        System.out.println("Mang sau khi hop nhat la :");
        for(int e : c){
            System.out.println(e);
        }

    }
}
