package RPG;

import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Battle {
    private Monster selectTarget(List<Monster> monsters){
        System.out.println("Chon muc tieu tan cong: 1-"+monsters.size());
        try{
            String choiceMonster = sc.nextLine();
            int targetIndex;
            targetIndex = Integer.parseInt(choiceMonster) - 1;
            if (targetIndex >=0 && targetIndex < monsters.size()){
                return monsters.get(targetIndex);
            }
            else {
                System.out.println("Muc tieu khong hop le");
                return null;
            }
        }
        catch (NumberFormatException e ){
            System.out.println("Lua chon khong hop le");
            return null;
        }

    }
    Scanner sc = new Scanner(System.in);

    public void startBattle(Player player, List<Monster> monsters) {
        player.getInventory().addItems("Binh mau nho",1);
        player.getInventory().addItems("Binh mau nho", 3);
        player.showStartMessage();
        for (Monster monster : monsters){
            monster.showStartMessage();
        }
        while (player.getHp() > 0 && !monsters.isEmpty()) {
            System.out.println("Luot cua Player !");
            System.out.println("So luong quai vat hien tai la ");
            for (int i = 0; i < monsters.size(); i++) {
                System.out.println((i + 1) + ". " + monsters.get(i).getName() + " [" + monsters.get(i).getHp() + " HP]");
            }
            System.out.println("1.Tan cong thuong ");
            System.out.println("2.Dung skill ");
            System.out.println("3.Dung item");
            System.out.println("Lua chon cua ban la : ");

            String choice = sc.nextLine();
            int choiceInt;
            try {
                choiceInt = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le");
                choiceInt = -1;
            }
            Monster target = null;
            switch (choiceInt) {
                case 1:
                        target = selectTarget(monsters);
                        if (target != null ) {
                            player.attack(target);
                            System.out.println("Luong mau con lai cua " + target.getName() + " la: " + target.getHp());

                        }
                    break;
                case 2:
                        target = selectTarget(monsters);
                        if (target != null) {
                            boolean castSpell = false;
                            castSpell = player.castSpell(target);
                            if (castSpell == false) {
                                player.attack(target);
                            }
                            System.out.println("Luong mau con lai cua " + target.getName() + " la: " + target.getHp());
                        }
                    break;
                case 3:
                    player.useHealPotion();
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
            Iterator<Monster> iterator = monsters.iterator();
            while (iterator.hasNext()) {
                Monster monster = iterator.next();
                if (monster.getHp() <= 0) {
                    System.out.println("Quai vat " + monster.getName() + " da chet");
                    iterator.remove();
                } else {
                    monster.attack(player);
                    System.out.println("Luong mau con lai cua " + player.getName() + " la " + player.getHp() );
                }
                if (player.getHp() <= 0){
                    break;
                }
            }

            if (player.getHp() <= 0) {
                System.out.println("Nguoi chien thang la Monster !");
            } else if (monsters.isEmpty()) {
                System.out.println("Nguoi chien thang la Player !");
            }
        }
    }
}

