package Ngay1_JavaCoBan;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap vao thang can kiem tra: ");
            int thang = sc.nextInt();
            sc.nextLine();
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang " + thang + " co 31 ngay ");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Thang " + thang + " co 30 ngay ");
                    break;
                case 2:
                    System.out.println("Ban muon kiem tra thang 2 cua nam bao nhieu: ");
                    int nam = sc.nextInt();
                    sc.nextLine();
                    if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                        System.out.println("Thang 2 nam " + nam + " co 29 ngay");
                    } else {
                        System.out.println("Thang 2 nam " + nam + " co 28 ngay");
                    }
                    break;
                default:
                    System.out.println("Thang khong hop le. ");
            }
            System.out.println("Ban co muon dung kiem tra: (y/n)");
            String dung = sc.nextLine();
            if ("y".equalsIgnoreCase(dung)) {
                break;
            }
        }
        sc.close();
    }
}
