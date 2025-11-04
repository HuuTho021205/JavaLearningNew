package Ngay6_LuyenTapOOP;
/*Tạo interface Damageable:
Định nghĩa một "khả năng" bị tấn công.
Có một phương thức void takeDamage(int damage);.
Tạo abstract class Character và cho nó implements Damageable:
Trừu tượng & Kế thừa:
Có các thuộc tính protected String name, protected int hp (máu), protected int attackPower.
Ghi đè phương thức takeDamage(int damage) để giảm hp.
Có một phương thức trừu tượng public abstract void attack(Damageable target);.
Tạo các lớp nhân vật cụ thể kế thừa Character:
Player: Có thêm thuộc tính int mana. Ghi đè attack() để tấn công bình thường.
Có thêm phương thức castSpell(Damageable target) sử dụng mana để gây sát thương gấp đôi.
Monster: Có thể có các lớp con như Goblin, Dragon với các chỉ số khác nhau.
Ghi đè attack() để tấn công.
Tạo class Battle:
Có một phương thức public void startBattle(Player player, Monster monster).
Bên trong phương thức này, tạo một vòng lặp while chạy cho đến khi player hoặc monster có hp <= 0.
Trong mỗi lượt, cho player tấn công monster, sau đó monster tấn công lại player.
In ra lượng máu còn lại của mỗi bên sau mỗi đòn tấn công.
Khi một trong hai hết máu, in ra người chiến thắng.
Trong hàm main:
Tạo một đối tượng Player và một Monster.
Tạo một đối tượng Battle và gọi startBattle() để bắt đầu trận đấu.
Thử thách thêm: Làm sao để thêm "vật phẩm" (Items) vào game?
Ví dụ như HealthPotion mà Player có thể sử dụng? (Gợi ý: tạo interface Usable).*/
public abstract class Character implements Damageable {
    private String name;
    private int hp;
    private int attackPower;

    public Character() {
    }

    public Character(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public void takeDamage(int damage){
        hp-= damage;
    }
    public abstract void attack(Damageable target);
}
