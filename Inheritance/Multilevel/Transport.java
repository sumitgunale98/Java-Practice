package Inheritance.Multilevel;

import org.w3c.dom.ls.LSOutput;

public class Transport {
    void move(){
        System.out.println("Transport is for Moving");
    }
}
class Train extends Transport{
    void Runs(){
        System.out.println("Runs on Railway Track");
    }
}
class Metro extends Train{
    void TrainType(){
        System.out.println("Merto Transportation for City");
    }
    public static void main(String[]args){
        Metro M=new Metro();
        M.move();
        M.Runs();
        M.TrainType();
    }
}
