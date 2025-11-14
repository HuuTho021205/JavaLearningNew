package Ngay9_JavaIOStream.LuyenTapIOStream.Bai1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        Path filePath =Path.of("filetest.txt");
        List<String> lines = List.of("INFO: Application started successfully.\n" +
                "INFO: User 'huutho' logged in.\n" +
                "DEBUG: Checking database connection...\n" +
                "ERROR: NullPointerException at UserService.java:45\n" +
                "INFO: User 'admin' logged in.\n" +
                "WARN: Disk space is running low.\n" +
                "ERROR: IOException: Cannot connect to payment gateway.\n" +
                "INFO: Shutdown sequence initiated.");

        try(BufferedWriter bw = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8)) {
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Da ghi file thanh cong");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }


}
