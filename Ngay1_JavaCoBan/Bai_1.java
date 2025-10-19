package Ngay1_JavaCoBan;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao tong 2 so: ");
        int tong = sc.nextInt();
        System.out.println("Nhap vao hieu 2 so: ");
        int hieu = sc.nextInt();
        double a = (tong + hieu) / 2.0;
        double b = tong - a;
        if (a % 1 == 0) {
            System.out.println("Gia tri x can tim la: " +(int) a);
            System.out.println("Gia tri y can tim la: " +(int) b);
        } else {
            System.out.println("Gia tri x can tim la: " + a);
            System.out.println("Gia tri y can tim la: " + b);
        }
        sc.close();
    }
}
