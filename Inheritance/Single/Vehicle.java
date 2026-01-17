package Inheritance;

public class Vehicle {
    int speed;
    String fuelType;
    void SetDetails(int s,String f){
        speed=s;
        fuelType =f;
    }
    void ShowVehicleDetails(){
        System.out.println("Speed "+speed+"km/hr");
        System.out.println("FuelType "+fuelType);
    }
}
class car extends Vehicle{
    int doors;
    boolean airConditioning;
    double mileage;


    void setCarDetails(int d,boolean ac,double m) {
        doors = d;
        airConditioning = ac;
        mileage = m;
    }

        void showCarDetails(){
            System.out.println("Number of Doors: "+doors);
            System.out.println("Air Conditioning "+airConditioning);
            System.out.println("Mileage "+mileage+"km/1L");


        }
        public static void main(String[]args){
        car c=new car();
        c.SetDetails(120,"petrol");
        c.setCarDetails(4,true,18);

            System.out.println("----Vehicle Details----");
            c.ShowVehicleDetails();
            System.out.println("-----Car Details-----");
            c.showCarDetails();
        }



    }

