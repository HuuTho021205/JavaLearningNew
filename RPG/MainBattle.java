package RPG;

public class MainBattle {
    public static void main(String[] args) {
        Player a = new Player("Huu Tho",100,30,30);
        Monster b = new Monster("Kaka",100,40);
        Battle c = new Battle();
        c.startBattle(a,b);
    }
}
