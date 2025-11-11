package RPG;

import java.util.Map;

public class DemoInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        try {
            int newAmount = inventory.addItems("Binh mau nho", 2);
            System.out.println("Them thanh cong! So luong moi: " + newAmount);
        }
        catch (IllegalArgumentException e){
            System.out.println("Loi: " +  e.getMessage());
        }

       try {
            int newAmount = inventory.addItems("Binh mana", -5);
            System.out.println("Them thanh cong! So luong moi: " + newAmount);
        }
        catch (IllegalArgumentException e){
            System.out.println("Loi: " +  e.getMessage());
        }

       boolean used = inventory.useItem("Binh mau nho");
       if (used){
           System.out.println("Su dung vat pham thanh cong");
       }
       else {
           System.out.println("Khong tim thay vat pham");
       }

       boolean usedKey = inventory.useItem("Binh mana");
       if (usedKey){
           System.out.println("Su dung vat pham thanh cong");
       }
       else {
           System.out.println("Khong tim thay vat pham");
       }
    inventory.printItem();

    System.out.println("Thu nghiem Stream API");
    inventory.addItems("Binh mana", 5);
    inventory.addItems("Kiem sat",1);
    // tim "Binh"
    Map<String, Integer> cacLoaiBinh = inventory.findItemByType("Binh");
    System.out.println("Cac loai binh: "+ cacLoaiBinh);

    Map<String, Integer> itemNhieu = inventory.findItemWithQuantityGreaterThan(3);
    System.out.println("Item co so luong nhieu" + itemNhieu);
    }
}
