package Ngay6_LuyenTapOOP;

public class Player extends Character implements Usable{
    private int mana;
    private static final int MANACOST = 20 ;

    public Player(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    public Player() {
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
    @Override
    public void Healpotion(int heal){
        int currentHp = this.getHp();
        int newhp = currentHp + heal;
        this.setHp(newhp);
        System.out.println("HP sau khi da su dung binh: " + this.getHp());
    }
}
