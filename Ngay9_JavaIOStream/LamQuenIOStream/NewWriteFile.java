package Ngay9_JavaIOStream.LamQuenIOStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NewWriteFile {
    public static void main(String[] args) {
        Path filePath = Path.of("newmy_ouput.txt");
        List<String> lines = List.of("Trần Đình Hữu Thọ", "23T1020520","Ngành công nghệ thông tin");
        try (BufferedWriter bw = Files.newBufferedWriter(filePath,StandardCharsets.UTF_8)){
                for (String line : lines){
                    bw.write(line);
                    bw.newLine();
                }
            System.out.println("Da ghi file thanh cong");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file:  " + e.getMessage());
        }
    }
}
