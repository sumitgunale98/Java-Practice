package Inheritance.Hybrid;

public class School {
    void name(){
        System.out.println("Modern");
    }
}
class classroom extends School{
    void room(){
        System.out.println("Room1");
    }
    public static void main(String[]args){
        Student s = new Student();
        s.name();
        s.room();
        s.present();
        }
    }

class Student extends classroom{
    void present(){
        System.out.println("Student Present in Class");
    }
}
class monitor extends classroom{
    void work(){
        System.out.println("Take attendance in Class");
    }
}