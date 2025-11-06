package RPG;


public class Player extends Character  {
    private int mana;
    private static final int MANACOST = 20 ;
    private Inventory inventory;
    public Player(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
        this.inventory = new Inventory();
    }

    public Player() {
        super();
        this.inventory = new Inventory();
    }
    public Inventory getInventory() {
        return inventory;
    }


    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void attack(Damageable target){
        System.out.println("Player tan cong thuong !");
        target.takeDamage(getAttackPower());
    }

    @Override
    public void showStartMessage(){
        System.out.println(this.getName() + " da san sang chien dau");
    }
    public boolean castSpell(Damageable target){
         if( this.mana >= MANACOST){
             System.out.println("Player dung skill !");
             target.takeDamage(getAttackPower() * 2);
             this.mana -= MANACOST;
             System.out.println("Luong mana con lai la:  " + mana);
             return true;
         }
         else {
             System.out.println("Khong du mana !");
         }
         return false;
    }
    public void useHealPotion(){
        Item potion = this.inventory.useItem("Binh mau nho");
        if (potion != null){
            this.setHp(this.getHp()+potion.getHealingAmount());
            System.out.println("Hoi mau thanh cong ");
        }
        else
            System.out.println("Khong con binh mau ");
    }


}
