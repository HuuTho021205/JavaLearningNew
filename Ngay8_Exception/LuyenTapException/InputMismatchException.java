package Ngay8_Exception.LuyenTapException;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban: ");
        try {
            int age = sc.nextInt();
            System.out.println("Day la tuoi cua ban: " + age);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Loi: Ban phai nhap 1 con so");
            System.out.println("Thong bao loi: " + e.getMessage());
        }
        finally {
            System.out.println("Cam on vi da su dung chuong trinh");
            sc.close();
        }
        System.out.println("Ket thuc chuong trinh");
    }
}
