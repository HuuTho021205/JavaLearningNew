package Ngay5_OOP.Polymorphism;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[] a = new Animal[3];
        a[0] = new Dog();
        a[1] = new Cat();
        a[2] = new Duck();

        for ( Animal b : a){
            b.makeSound();
        }
    }
}
