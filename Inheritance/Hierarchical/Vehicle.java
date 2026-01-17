package Inheritance.Hierarchical;

public class Vehicle {
    void move(){
        System.out.println("vehicle is Moving");
    }
}
class bike extends Vehicle{
    void wheels(){
        System.out.println("Two Wheeler Vehicle");
    }
    public static void main(String[]args){
        bike b=new bike();
        b.move();
        b.wheels();
    }
}
class car extends Vehicle{
    void doors(){
        System.out.println("Car has 4 Doors");
    }
}
