package Inheritance.Multilevel;

public class Country {
    void Region(){
        System.out.println("India");
    }
}
class state extends Country{
    void StateName(){
        System.out.println("Maharashtra");
    }
}
class city extends state{
    void cityName(){
        System.out.println("Udgir");
    }
    public static void main(String[]args){
        city ct=new city();
        ct.Region();
        ct.StateName();
        ct.cityName();

    }
}