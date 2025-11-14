package Ngay9_JavaIOStream.LuyenTapIOStream.Bai3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {
    public static void main(String[] args) {
        Path filePath = Path.of("sales_log.txt");
        Path namePath = Path.of("sales_report.txt");
        Map<String, Integer> salesCount = new HashMap<>();
        try(BufferedReader br = Files.newBufferedReader(filePath, StandardCharsets.UTF_8);
            BufferedWriter bw = Files.newBufferedWriter(namePath,StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null){
                /*if (!salesCount.containsKey(line)){
                    salesCount.put(line, 1);
                }
                else {
                    int oldCount = salesCount.get(line);
                    int newCount = oldCount + 1;
                    salesCount.put(line, newCount);
                }*/
                salesCount.put(line,salesCount.getOrDefault(line,0) + 1);
            }
            System.out.println("Đã đọc file thành công");

            bw.write("Báo cáo số lượng\n");
            for (Map.Entry<String, Integer> entry : salesCount.entrySet()){
                bw.write("Product: " + entry.getKey() + " Quantity: " + entry.getValue());
                bw.newLine();
            }
            System.out.println("Đã ghi file thành công");
        }catch (IOException e){
            System.out.println("Lỗi");
            e.printStackTrace();
        }
    }
}
