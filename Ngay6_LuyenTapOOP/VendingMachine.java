package Ngay6_LuyenTapOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private ArrayList<Product> products;
    private double currentBalance;

    public VendingMachine() {
        this.products = new ArrayList<>();
        this.currentBalance = 0;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Them san pham thanh cong !");

    }
    public void displayProducts(){
        for(Product p1 : products){
            System.out.println(p1.description());
        }
    }
    public void insertMoney(double amount ){
        currentBalance += amount;
        System.out.println("Nap thanh cong " + amount);
    }

    public void purchaseProduct(String productName){
        Product productFoundProduct = null;
        for(Product p1 : products){
            if(p1.getName().equalsIgnoreCase(productName)){
                    productFoundProduct = p1;
                    break;
            }
        }
        if (productFoundProduct != null ){
            if(productFoundProduct.getPrice() <= currentBalance ) {
                currentBalance -= productFoundProduct.getPrice();
                System.out.println("Mua hang thanh cong !");
                System.out.println("Day la so tien thua: " + currentBalance);
                products.remove(productFoundProduct);
            }
            else  {
                System.out.println("Khong du tien. Vui long nap them !");
            }
        }
        else {
            System.out.println("Khong tim thay san pham !");
        }
    }
}
