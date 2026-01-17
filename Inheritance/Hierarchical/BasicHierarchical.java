package Inheritance.Hierarchical;

public class BasicHierarchical {
    void b(){
        System.out.println("This is Parent Class");
    }
}
class child11 extends BasicHierarchical{
    void c1(){
        System.out.println("This is extended From Parent Class");
    }
}
class child21 extends BasicHierarchical{
    void c2(){
        System.out.println("This Class is also extended from Parent class");
    }
    public static void main(String[]args){
        child21 C2= new child21();

        C2.b();
        C2.c2();
    }
}
