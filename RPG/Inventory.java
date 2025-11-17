package RPG;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Inventory {
    private Map<String, Integer> items;

    public Inventory() {
         this.items = new HashMap<>();
    }

    public Map<String, Integer> getItems() {
        return Collections.unmodifiableMap(this.items);
    }

    public void clearInventory() {
        this.items.clear();
    }

    public int addItems(String itemName, int amountToAdd){
        if (amountToAdd <= 0){
            throw new IllegalArgumentException("So luong them vao phai la so duong");
        }
        int newQuantity =0;
        if (items.containsKey(itemName)){
            int oldCount = items.get(itemName);
             newQuantity = oldCount + amountToAdd;
            items.put(itemName, newQuantity);
        }
        else {
            newQuantity = amountToAdd;
            items.put(itemName, newQuantity);

        }
        return newQuantity;
    }

    public boolean useItem(String itemName) {
        if (this.items.isEmpty()) {
            return false;
        }
        if (items.containsKey(itemName)) {
            int oldCount = items.get(itemName);
            if (oldCount > 1) {
                int newCount = oldCount - 1;
                items.put(itemName, newCount);

            } else if (oldCount == 1) {
                items.remove(itemName);

            }
            return true;
        } else {

            return false;
        }
    }

    public void printItem(){
        if(this.items.isEmpty()){
            System.out.println("Tui do trong !");
        }
        else {
            System.out.println("Cac vat pham trong tui la :");
            for (Map.Entry<String, Integer> a : items.entrySet()){
                System.out.println("-"+ a.getKey() +": " + a.getValue());
            }
        }
    }

    public Map<String, Integer> findItemByType(String type){
        return this.items.entrySet()
                .stream()
                .filter(entry -> entry.getKey().contains(type))
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()
                ));
    }
    public Map<String, Integer> findItemWithQuantityGreaterThan(int amount){
        return this.items.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > amount)
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()
                ));
    }

}
