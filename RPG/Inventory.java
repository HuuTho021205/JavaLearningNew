package RPG;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
         this.items = new ArrayList();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItems(Item item){
        items.add(item);
        System.out.println("Da them vat pham thanh cong ! ");
    }

    public Item useItem(String itemName) {
        if (this.items.isEmpty()) {
            System.out.println("Tui do trong !");
            return null;
        }
        /*Không xóa khi đang duyệt bang foreach được
        Dùng iterator*/
        else {
            Iterator<Item> iterator = this.items.iterator();
            while (iterator.hasNext()) {
                Item item = iterator.next(); // Lấy vật phẩm
                if (item.getItemName().equalsIgnoreCase(itemName)) {
                    System.out.println("Su dung vat pham " + item.getItemName() + " thanh cong");
                    iterator.remove();
                    return item;
                }
            }
            System.out.println("Khong tim thay vat pham ");
            return null;
        }
    }

    public void printItem(){
        if(this.items.isEmpty()){
            System.out.println("Tui do trong !");
        }
        else {
            System.out.println("Cac vat pham trong tui la :");
            for (Item a : items) {
                System.out.println(a.getItemName());
            }
        }
    }


}
