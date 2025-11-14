package Ngay9_JavaIOStream.LuyenTapIOStream.Bai2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        Path filePath = Path.of("grades.csv");
        List<String> lines = List.of("SV001,An Nguyen,8.5\n" +
                "SV002,Binh Le,5.0\n" +
                "SV003,Chi Pham,9.0\n" +
                "SV004,Dung Vo,7.2");
        try(BufferedWriter br = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8)) {
            for (String line : lines){
                br.write(line);
                br.newLine();
            }
            System.out.println("Ghi file thành công");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }
}
