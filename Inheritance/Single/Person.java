package Inheritance;

public class Person {
    void show(){
        System.out.println("I am a Person");
    }
}
class Student extends Person{
    void display(){
        System.out.println("I am a Student");
    }
    public static void main(String[]args){
        Student s=new Student();
        s.display();
        s.show();
    }
}
