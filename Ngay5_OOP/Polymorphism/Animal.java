package Ngay5_OOP.Polymorphism;
/*Tạo lớp cha Animal:
Có một phương thức public void makeSound() in ra "An animal makes a sound.".
Tạo 3 lớp con kế thừa từ Animal:
Dog: Ghi đè (@Override) phương thức makeSound() để in ra "Gau gau!".
Cat: Ghi đè (@Override) phương thức makeSound() để in ra "Meo meo!".
Duck: Ghi đè (@Override) phương thức makeSound() để in ra "Quac quac!".
Trong hàm main:
Tạo một mảng Animal[] orchestra = new Animal[3];.
Gán các phần tử của mảng bằng các đối tượng con:
orchestra[0] = new Dog();
orchestra[1] = new Cat();
orchestra[2] = new Duck();
Dùng một vòng lặp for-each để duyệt qua mảng orchestra
và gọi phương thức makeSound() của từng con vật. Hãy xem điều "kỳ diệu" xảy ra!*/
public class Animal {
    public void makeSound(){
        System.out.println("An animal makes a sound");
    }
}
