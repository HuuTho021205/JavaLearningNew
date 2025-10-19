package Ngay1_JavaCoBan;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a, b, c cua phuong trinh ax^2 + bx + c = 0: ");
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("Nhap c: ");
        int c = sc.nextInt();
        sc.nextLine();
        if (a == 0) {
            // Phuong trinh tro thanh: bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem!");
                } else { // c != 0
                    System.out.println("Phuong trinh vo nghiem!");
                }
            } else { // b != 0
                double x = -c / b;
                System.out.println("Phuong trinh co mot nghiem duy nhat x = " + x);
            }
        } else {
            int denta = b * b - 4 * a * c;
            if (denta < 0) {
                System.out.println("Phuong Trinh Vo Nghiem ");
            } else if (denta > 0) {
                double x1 = (-b + Math.sqrt(denta)) / (2 * a);
                double x2 = (-b - Math.sqrt(denta)) / (2 * a);
                System.out.println("Phuong Trinh Co 2 Nghiem x1 = " + x1 + " x2 = " + x2);
            } else {
                System.out.println("Phuong Trinh Co Nghiem Kep x1 = x2 = " + (double) (-b / 2 * a));
            }
        }
        sc.close();
    }
}
