package Inheritance.Hybrid;

public class HybridMain {
    void m(){
        System.out.println("This is Main Class");
    }
}
class child1 extends HybridMain{
    void c1(){
        System.out.println("This is Child class of Main Class");
    }
}
class child2 extends HybridMain{
    void c2(){
        System.out.println("The child2 class is derived from Child1 ");
    }
}
class  child12 extends child1{
    void c12(){
        System.out.println("The Child12 class is derived from Child1 ");
    }
}
class Child21 extends child2{
    void c21(){
        System.out.println("The child21 is derived from Child2");
    }
    public static void main(String[]args){
        Child21 C21 = new Child21();
        C21.m();
        C21.c2();
        C21.c21();
    }
}
