package Inheritance.Multilevel;

public class Shop {
    void open(){
        System.out.println("Shop is Open");
    }
}
class Mall extends Shop{
    void present(){
        System.out.println("Shop is in the Mall");
    }
}
class ClothesShop extends Mall{
    void product(){
        System.out.println("Multiple clothes ");
    }
    public static void main(String[]args){
        ClothesShop CS=new ClothesShop();
        CS.open();
        CS.present();
        CS.product();
    }
}
