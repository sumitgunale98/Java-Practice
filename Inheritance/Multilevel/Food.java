package Inheritance.Multilevel;

public class Food {
    void eat(){
        System.out.println("I am eating Food");
    }
}
class snacks extends Food{
    void Category(){
        System.out.println("Snacks");
    }
}
class Biscuit extends snacks{
    void name(){
        System.out.println("Biscuit is snacks");
    }
    public static void main(String[]args){
        Biscuit B=new Biscuit();
        B.eat();
        B.Category();
        B.name();
    }
}
