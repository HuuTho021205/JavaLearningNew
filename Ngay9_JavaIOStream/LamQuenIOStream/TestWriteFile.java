package Ngay9_JavaIOStream.LamQuenIOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TestWriteFile {
    public static void main(String[] args) {
        String filePath = "my_output.txt";
        List<String> lines = List.of("Day la dong 1", "Day la dong 2", "Ket Thuc");
        try(FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            for (String a : lines){
                bw.write(a);
                bw.newLine();
            }
            System.out.println("Ghi file thanh cong ");
        }
        catch (IOException e ){
            System.out.println("Loi khi ghi file: " + e.getMessage());
        }
    }
}
