package Inheritance.Multilevel;

public class Building {
    void name(){
        System.out.println("Abc");
    }
}
class floor extends Building{
    void floorNumber(){
        System.out.println("Floor Number");
    }
}

class Room1 extends floor{
    void type(){
        System.out.println("Office Room");
    }
    public static void main(String[]args){
        Room1 R1=new Room1();
        R1.name();
        R1.floorNumber();
        R1.type();
    }
}
