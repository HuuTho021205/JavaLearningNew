package Ngay1_JavaCoBan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> namNhuan = new ArrayList<>();
        ArrayList<Integer> namKhongNhuan = new ArrayList<>();
        while (true) {
            System.out.println("Nhap vao cac nam muon kiem tra : ");
            int nam = sc.nextInt();
            sc.nextLine();
            if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                namNhuan.add(nam);
            }
            else {
                namKhongNhuan.add(nam);
            }
            System.out.println("Ban co muon dung kiem tra: (y/n)");
            String dung = sc.nextLine();
            if ( "y".equalsIgnoreCase(dung)) { break; }
        }
        String chuoiNamNhuan = namNhuan.stream().map(String::valueOf).collect(Collectors.joining(","));
        String chuoiNamKhongNhuan = namKhongNhuan.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println("Nam Nhuan: " + chuoiNamNhuan);
        System.out.println("Nam Khong Nhuan: " + chuoiNamKhongNhuan);
    sc.close();
    }
}
