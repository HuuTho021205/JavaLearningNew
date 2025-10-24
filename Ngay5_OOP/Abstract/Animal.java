package Ngay5_OOP.Abstract;
/*Tạo một abstract class Animal:
Có thuộc tính private String name.
Có một phương thức đã viết code sẵn: public void eat() in ra "Eating...".
Có một phương thức trừu tượng: public abstract void makeSound();.
Tạo một interface Flyable:
Có một phương thức trừu tượng void fly();.
Tạo các lớp cụ thể:
Cat kế thừa từ Animal:
Bắt buộc phải ghi đè (@Override) phương thức makeSound() để in ra "Meo meo".
Bird kế thừa từ Animal VÀ thực thi Flyable:
Bắt buộc phải ghi đè makeSound() để in ra "Chip chip".
Bắt buộc phải định nghĩa phương thức fly() để in ra "The bird is flapping its wings.".
Trong hàm main:
Tạo một đối tượng Cat và một đối tượng Bird.
Gọi phương thức eat() và makeSound() của cả hai.
Riêng đối tượng Bird, hãy gọi thêm phương thức fly().*/
public abstract class Animal {
    private String name;
    public void eat(){
        System.out.println("Eating...");
    }
    public abstract void makeSound();
}
