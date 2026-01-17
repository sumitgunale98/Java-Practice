package Inheritance.Hierarchical;

public class Appliance {
    void PowerON(){
        System.out.println("Appliance Power On");
    }
}
class Fan extends Appliance{
    void rotate(){
        System.out.println("Fan is Rotating");
    }
}
class light extends Appliance{
    void glow(){
        System.out.println("Bulb is Glowing");
    }
    public static void main(String[]args){
        light l= new light();
        l.PowerON();
        l.glow();
    }
}
