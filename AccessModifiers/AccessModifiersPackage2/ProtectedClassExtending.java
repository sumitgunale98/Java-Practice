package AccessModifiersPackage2;

import AccessModifiers1.AllClasses.ProtectedClass;
import AccessModifiers1.AllClasses.PublicClass;

public class ProtectedClassExtending extends ProtectedClass {

    public static void main(String[]args){
        ProtectedClassExtending Child = new ProtectedClassExtending();
        Child.show2();
        System.out.println(Child.a);

        PublicClass obj1=new PublicClass();
        obj1.show3();
        System.out.println(obj1.name);
    }
}
