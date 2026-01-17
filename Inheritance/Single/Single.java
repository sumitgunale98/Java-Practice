package Inheritance;

public class Single {
    void show() {
        System.out.println("Show Method of Parent Class");
    }
}
    class Child extends Single{
        void display(){
            System.out.println("Display Method of Child class");
        }
        public static void main(String[]args){
            Child c=new Child();
            c.show();
            c.display();
        }
    }



