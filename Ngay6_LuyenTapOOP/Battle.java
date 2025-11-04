package Ngay6_LuyenTapOOP;

import java.util.Scanner;

public class Battle {
    Scanner sc = new Scanner(System.in);

    public void startBattle(Player player, Monster monster){
        while (player.getHp() > 0 && monster.getHp() >0){
            System.out.println("Luot cua Player !");
            System.out.println("1.Tan cong thuong ");
            System.out.println("2.Dung skill ");
            System.out.println("3.Dung item");
            System.out.println("Lua chon cua ban la : ");

            String choice = sc.nextLine();
            int choiceInt;
            try {
                choiceInt = Integer.parseInt(choice);
            }
            catch (NumberFormatException e){
                System.out.println("Lua chon khong hop le");
                choiceInt = -1;
            }
                switch (choiceInt) {
                    case 1:
                        player.attack(monster);
                        break;
                    case 2:
                        boolean castSpell = false;
                        castSpell = player.castSpell(monster);
                        if (castSpell == false) {
                            player.attack(monster);
                        }
                        break;
                    case 3:
                        player.Healpotion(30);
                        break;
                    default:
                        player.attack(monster);
                        break;
                }

            System.out.println("Luong mau con lai cua Monster: " + monster.getHp());
            if (monster.getHp() > 0){
            System.out.println("Monster tan cong ! ");
            monster.attack(player);
            System.out.println("Luong mau con lai cua Player: " + player.getHp());

            if(player.getHp() <=0){
                System.out.println("Nguoi chien thang la Monster !");
                }
            }

            else if (monster.getHp() <= 0) {
                System.out.println("Nguoi chien thang la Player !");
            }
        }
    }
}
