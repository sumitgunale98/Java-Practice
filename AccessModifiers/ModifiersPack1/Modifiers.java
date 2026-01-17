package AccessModifiers.ModifiersPack1;

public class Modifiers {
    int a=10;
    private int b=20;
    public int c=30;
    protected int d=40;



    public void publicMethod(){
        System.out.println("This method is Public");
    }

    private void privateMethod() {
        System.out.println("This method is Private");
    }

  void defaultMethod(){
    System.out.println("This method is Default");
   }
   protected void protectedMethod(){
       System.out.println("This method is protected");
   }
//    public static void main(String[]args){
//        Modifiers M1=new Modifiers();
//        M1.defaultMethod();
//        M1.protectedMethod();
//        M1.privateMethod();
//        M1.publicMethod();



}
class AnotherClass {
    public static void main(String[] args) {
        Modifiers M1 = new Modifiers();
        M1.defaultMethod();
        M1.protectedMethod();
        //M1.privateMethod(); Private Method in another class of same package  is not accessible.
        M1.publicMethod();
        System.out.println(M1.a);
        //System.out.println(M1.b); Private variable not accessible in another class.
        System.out.println(M1.c);
        System.out.println(M1.d);


    }
}

