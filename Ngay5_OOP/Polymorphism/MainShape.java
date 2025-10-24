package Ngay5_OOP.Polymorphism;

import java.util.Scanner;

public class MainShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so hinh: ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Mang rong");
            return;
        }
        sc.nextLine();
        Shape[] s = new Shape[n];

        for (int i = 0; i < s.length; i++){
            System.out.println("Ban muon ve Hình tròn (phím 1) hay Hình chữ nhật (phím 2)");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.println("Nhap vao ban kinh cua hinh tron: ");
                double r = sc.nextDouble();
                Circle c = new Circle(r);
                s[i] = c;
            }
            else if ( choice == 2 ){
                System.out.println("Nhap vao chieu rong: ");
                double w = sc.nextDouble();
                System.out.println("Nhap vao chieu dai: ");
                double h = sc.nextDouble();
                Rectangle re = new Rectangle(w,h);
                s[i] = re;
            }
            else{
                System.out.println("Lua chon khong hop le !");
                i--;
            }
        }
        for ( Shape s1 : s){
            s1.draw();
            double area = s1.getArea();
            System.out.println("Dien tich la: ");
            System.out.println(area);
        }

        Shape max = s[0];
        for ( int i =0; i < s.length; i++){
            if(s[i].getArea() >= max.getArea()){
                max = s[i];
            }
        }
        System.out.println("Hinh co dien tich lon nhat trong mang la: ");
        max.draw();
        System.out.printf("Voi Dien tich la: %.2f\n",  max.getArea());
    }
}
