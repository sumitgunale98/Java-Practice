package Inheritance.Multilevel;

public class BasicMultilevel {
    void show(){
        System.out.println("This is Base class");
    }
}
class child1 extends BasicMultilevel{
    void display(){
        System.out.println("This is Extended class");
    }
}
class child2 extends child1{
    public static void main(String[]args){
        child2 ch2=new child2();
        ch2.show();
        ch2.display();

    }
}
