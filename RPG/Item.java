package RPG;

public class Item {
    private String itemName;
    private int healingAmount;

    public Item() {
    }

    public Item(String itemName, int healingAmount) {
        this.itemName = itemName;
        this.healingAmount = healingAmount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getHealingAmount() {
        return healingAmount;
    }

    public void setHealingAmount(int healingAmount) {
        this.healingAmount = healingAmount;
    }

}
