package RPG;

public class Monster extends Character {
    public Monster(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void attack(Damageable target){
        target.takeDamage(getAttackPower());
    }
    @Override
    public void showStartMessage(){
        System.out.println(this.getName() + " Gam len GRRR");
    }
}
