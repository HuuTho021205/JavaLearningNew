package Ngay9_JavaIOStream.LuyenTapIOStream.Bai3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        Path filePath = Path.of("sales_log.txt");
        List<String> lines = List.of("Laptop\n" +
                "Phone\n" +
                "Mouse\n" +
                "Laptop\n" +
                "Headphones\n" +
                "Phone\n" +
                "Laptop\n" +
                "Mouse\n" +
                "Phone");

        try(BufferedWriter bw = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8)) {
            for (String line: lines){
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Ghi file thành công ");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }


}
