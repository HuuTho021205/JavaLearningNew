package Ngay9_JavaIOStream.LamQuenIOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewReadFile {
    public static void main(String[] args) {
        Path filePath = Path.of("newmy_ouput.txt");
        try(BufferedReader br = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("Doc file thanh cong");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
