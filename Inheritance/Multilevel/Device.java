package Inheritance.Multilevel;

public class Device {
    void power(){
        System.out.println("Power On");
    }
}
class Computer extends Device{
    void loading(){
        System.out.println("Computer is Loading");
    }
}
class Laptop extends Computer{
    void portable(){
        System.out.println("Laptop is Portable");
    }
    public static void main(String[]args){
        Laptop l=new Laptop();
        l.power();
        l.loading();
        l.portable();
    }
}

