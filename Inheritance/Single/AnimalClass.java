package Inheritance;

public class AnimalClass {
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends AnimalClass{
    void run(){
        System.out.println("Dog is running");
    }
    public static void main(String[]args){
        Dog d=new Dog();
        d.eat();
        d.run();
    }
}
