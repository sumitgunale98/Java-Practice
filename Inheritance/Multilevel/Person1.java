package Inheritance.Multilevel;

public class Person1 {
    void info(){
        System.out.println("Person Info");
    }
}
class student extends Person1{
    void study(){
        System.out.println("Student Studies");
    }
}
class result extends student{
    public static void  main(String[]args){
        result r1=new result();
        r1.info();
        r1.study();
        System.out.println("Result Declared");
    }
}
