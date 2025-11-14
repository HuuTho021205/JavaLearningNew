package Ngay9_JavaIOStream.LuyenTapIOStream.Bai1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) {
        Path filePath =Path.of("filetest.txt");
        Path logPath = Path.of("log.txt");
        try (BufferedReader br = Files.newBufferedReader(filePath, StandardCharsets.UTF_8);
             BufferedWriter bw = Files.newBufferedWriter(logPath, StandardCharsets.UTF_8 )){
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toUpperCase().contains("ERROR")) {
                    bw.write(line);
                    bw.newLine();
                }
            }
            System.out.println("Doc va ghi file hoan tat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
