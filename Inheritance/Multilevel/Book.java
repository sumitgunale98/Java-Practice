package Inheritance.Multilevel;

public class Book {
    void read(){
        System.out.println("Reading Book");
    }
}
class textBook extends Book{
    void subject(){
        System.out.println("Java Book");
    }
}
class examBook extends textBook{
    public static void main(String[]args){
        examBook eb=new examBook();
        eb.read();
        eb.subject();
        System.out.println("For Exam Preparation");
    }
}
