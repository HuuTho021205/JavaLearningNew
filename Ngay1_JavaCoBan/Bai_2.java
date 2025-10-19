package Ngay1_JavaCoBan;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao (m): ");
        float chieuCao = sc.nextFloat();
        System.out.println("Nhap vao can nang (kg): ");
        float canNang = sc.nextFloat();
        float BMI = canNang / (chieuCao * chieuCao);
        String phanLoai = "";
        if (BMI < 15){
            phanLoai = "Than hinh qua gay";
        } else if (BMI < 16) {
            phanLoai = "Than hinh gay";
        } else if (BMI < 18.5) {
            phanLoai = "Than hinh hoi gay";
        } else if (BMI < 25) {
            phanLoai = "Than hinh binh thuong";
        } else if (BMI < 30) {
            phanLoai = "Than hinh hoi beo";
        } else if (BMI < 35) {
            phanLoai = "Than hinh beo";
        }
        else {
            phanLoai = "Than hinh qua beo";
        }
        System.out.println("Chi so BMI cua ban la: " + BMI +"\n" + phanLoai + "\n");
        sc.close();
    }
}
