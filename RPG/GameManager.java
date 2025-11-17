package RPG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class GameManager {
    public static void saveGame(Player player, String fileName) throws IOException {
        Path filePath = Path.of(fileName);
        try(BufferedWriter bw = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8)) {
            bw.write("Name=" + player.getName());
            bw.newLine();
            bw.write("Hp=" + player.getHp());
            bw.newLine();
            bw.write("Mana=" + player.getMana());
            bw.newLine();
            Map<String, Integer> items = player.getInventory().getItems();
            for (Map.Entry<String, Integer> a : items.entrySet()) {
                String name = a.getKey();
                int quantity = a.getValue();
                bw.write("Item=" + name + "," + quantity);
                bw.newLine();
            }
            System.out.println("Luu Game thanh cong vao " + fileName);
        }
    }
    public static Player loadGame(String fileName) throws IOException, SaveFileCorruptedException {
        Path filePath = Path.of(fileName);
        Map<String,String> data = new HashMap<>();
        Inventory loadInventory = new Inventory();

        try(BufferedReader br = Files.newBufferedReader(filePath,StandardCharsets.UTF_8)) {
            String line;
            while((line = br.readLine()) != null){
                String [] parts = line.split("=");
                if (parts.length != 2 ) continue;

                String key = parts[0];
                String value = parts[1];

                if (key.equals("Item")){
                    String [] itemParts = value.split(",");
                    String name = itemParts[0];
                    int quantity = Integer.parseInt(itemParts[1]);
                    loadInventory.addItems(name,quantity);
                }
                else {
                    data.put(key,value);
                }
            }
            if (!data.containsKey("Name") || !data.containsKey("Hp")){
                throw new SaveFileCorruptedException("File luu bi hong hoac thieu thong tin");
            }
        }


        Player loadedPlayer = new Player();
        Inventory inventory = new Inventory();
        loadedPlayer.setName(data.get("Name"));
        loadedPlayer.setHp(Integer.parseInt(data.get("Hp")));
        loadedPlayer.setMana(Integer.parseInt(data.get("Mana")));
        loadedPlayer.setInventory(loadInventory);
        System.out.println("Tai game thanh cong cho Player: " + loadedPlayer.getName());
        return loadedPlayer;
    }
}
