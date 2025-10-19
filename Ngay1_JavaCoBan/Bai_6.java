package Ngay1_JavaCoBan;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap vao thang can kiem tra: ");
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Thang " + n + " thuoc qui 1");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Thang " + n + " thuoc qui 2");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("Thang " + n + " thuoc qui 3");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("Thang " + n + " thuoc qui 4");
                    break;
                default:
                    System.out.println("Thang khong hop le. ");
            }
            System.out.println("Ban co muon dung kiem tra (y/n):");
            String b = sc.nextLine();
            if("y".equalsIgnoreCase(b)) {
                break;
            }
        }
        sc.close();
    }
}
