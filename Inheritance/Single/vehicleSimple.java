package Inheritance;

public class vehicleSimple {
    void showVehicle1details(){
        System.out.println("Vehicle is Started");
    }
}
class car1 extends vehicleSimple{
    void show(){
        System.out.println("This is a car");
    }
    public static void main(String[]args){
        car1 c1=new car1();
        c1.showVehicle1details();
        c1.show();
    }

}
