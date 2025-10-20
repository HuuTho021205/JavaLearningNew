package Ngay2_Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        int [] a = new int[n];
//      Nhap vao cac phan tu cua mang
        for ( int i = 0; i < a.length; i++ ){
            System.out.println("Nhap vao cac phan tu cua mang: ");
            a[i] = sc.nextInt();
        }
//      Xuat ra cac phan tu cua mang
        System.out.println("Cac phan tu cua mang: ");
        for ( int b : a){
            System.out.println(b);
        }
//      Dao nguoc mang va xuat mang sau khi dao nguoc
        int i = 0;
        int j = a.length - 1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("Mang sau khi dao nguoc: ");
        for( int c : a){
            System.out.println(c);
        }
//        sap xep mang tang dan
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep: ");
        for( int c : a){
            System.out.println(c);
        }
// tinh tong cac phan tu trong mang
        int sum = 0;
        for( int c : a){
            sum += c;
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);
// kiem tra co ton tai trong mang hay khong
        System.out.println("Nhap vao phan tu can kiem tra: ");
        int b = sc.nextInt();
        int check = 0;
        for( i = 0; i < a.length; i++){
            if(a[i] == b) {
                check = i;
                break;
            }
        }
        if(check != 0){
            System.out.println("Phan tu khong ton tai");
        }
        else{
            System.out.println("Phan tu da ton tai trong mang. Vi tri thu " + check);
        }
    }

}
