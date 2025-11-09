package Ngay7_CollectionsFrameWork.List.LuyenTapList.StoreManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStoreManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> outOfStockNames = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        System.out.println("Nhap vao so luong san pham: ");
        int quantity = Integer.parseInt(sc.nextLine());
        while (quantity > 0){
            System.out.println("Nhap vao loai san pham: ");
            String category = sc.nextLine();
            System.out.println("Nhap vao ten san pham: ");
            String name = sc.nextLine();
            System.out.println("Nhap vao gia san pham: ");
            double price = Double.parseDouble(sc.nextLine());
            Product product = new Product(category,name,price);
            products.add(product);
            quantity--;
        }
        System.out.println("Nhap vao loai hang muon giam gia: ");
        String nameSale = sc.nextLine();
        System.out.println("Nhap vao phan tram muon giam:  ");
        int discount =Integer.parseInt(sc.nextLine());

        StoreManager.applySale(products,nameSale,discount);

        System.out.println("So luong san pham het hang la: ");
        int quantityOutOfStock = Integer.parseInt(sc.nextLine());
        String name="";
        for (int i = 0; i < quantityOutOfStock; i++) {
            System.out.println("Nhap vao ten san pham het hang: ");
            name = sc.nextLine();
            outOfStockNames.add(name);
        }
        StoreManager.removeOutOfStock(products,outOfStockNames);

    }
}
