package Ngay6_LuyenTapOOP;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine a =new VendingMachine();
        Drink d1 = new Drink("Coca",50,100);
        Drink d2 = new Drink("Pepsi",40,100);
        Drink d3 = new Drink("Sting",40,90);
        Drink d4 = new Drink("7 Up",50,80);
        Snack s1 = new Snack("Oishi",10,100);
        Snack s2 = new Snack("kaka",5,70);
        Snack s3 = new Snack("keo mut",8,80);
        Snack s4 = new Snack("kem",7,10);
        a.addProduct(d1);
        a.addProduct(d2);
        a.addProduct(d3);
        a.addProduct(d4);
        a.addProduct(s1);
        a.addProduct(s2);
        a.addProduct(s3);
        a.addProduct(s4);
        a.displayProducts();

        double amount = 0;
        System.out.println("Vui long bo tien vao may: ");
        amount = sc.nextDouble();
        sc.nextLine();
        a.insertMoney(amount);

        String nameProduct;
        System.out.println("Nhap vao ten san pham muon mua: ");
        nameProduct = sc.nextLine();
        a.purchaseProduct(nameProduct);
    }
}
