package Ngay5_OOP.Abstract;

public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound(){
        System.out.println("Chip Chip");
    }
    @Override
    public void fly(){
        System.out.println("The bird is flapping its wings");
    }
}
