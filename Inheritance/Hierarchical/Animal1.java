package Inheritance.Hierarchical;

public class Animal1 {
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal1{
    void bark(){
        System.out.println("Dog is Barking");
    }
    public static void main(String[]args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
class Cat extends Animal1{
    void meow(){
        System.out.println("Cat is Meowing");
    }
}

