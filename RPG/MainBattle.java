package RPG;

import java.util.ArrayList;
import java.util.List;

public class MainBattle {
    public static void main(String[] args) {
        Player a = new Player("Huu Tho",100,30,30);
        List<Monster> listQuaiVat = new ArrayList<>();
        Monster m1 = new Monster("Goblin",100,20);
        Monster m2 = new Monster("Soi hung ac",100,10);
        Monster m3 = new Monster("Quy bien di",100,10 );
        listQuaiVat.addAll(List.of(m1,m2,m3));
        Battle c = new Battle();
        c.startBattle(a,listQuaiVat);
    }
}
