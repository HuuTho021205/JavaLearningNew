package Ngay5_OOP.Abstract;

public class MainAnimal {
    public static void main(String[] args) {
        Cat c = new Cat();
        Bird b = new Bird();
        c.eat();
        c.makeSound();
        b.eat();
        b.makeSound();
        b.fly();
    }
}
