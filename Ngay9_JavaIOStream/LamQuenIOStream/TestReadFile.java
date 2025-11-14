package Ngay9_JavaIOStream.LamQuenIOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
    public static void main(String[] args) {
        String file ="my_output.txt";
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);)
        {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("Ket thuc doc file");
        }
        catch (IOException e){
            System.out.println("Lỗi khi đọc file " + e.getMessage());
        }
    }
}
