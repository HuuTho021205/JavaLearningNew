package Ngay9_JavaIOStream.LuyenTapIOStream.Bai2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Path filePath = Path.of("grades.csv");

        try(BufferedReader br = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null){
                if (line.isEmpty() || line.isBlank()) continue;
                String [] fields = line.split(",");
                if (fields.length == 3) {
                    String id = fields[0];
                    String name = fields[1];
                    double gpa = Double.parseDouble(fields[2]);
                    studentList.add(new Student(id,name,gpa));
                }
                else {
                    System.out.println("File lỗi");
                }
            }
            System.out.println("Đã nhập thành công số lượng "+studentList.size()+ " sinh viên");
            for (Student a : studentList){
                System.out.println(a);
            }
        }catch (IOException e){
            System.out.println("Lỗi đọc file " + e.getMessage());
        }

    }
}
