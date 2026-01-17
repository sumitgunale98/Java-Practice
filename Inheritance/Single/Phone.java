package Inheritance;

public class Phone {
    void call(){
        System.out.println("Normal Phone used For Calling");
    }
}
class Smartphone extends Phone{
  void New(){
      System.out.println("SmartPhone is used for Multi purpose Working.");
  }
    public static void main(String[]args){
      Smartphone sp = new Smartphone();
      sp.call();
      sp.New();
    }

  }
