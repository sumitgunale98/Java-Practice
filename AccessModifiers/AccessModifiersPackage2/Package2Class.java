package AccessModifiersPackage2;

//import AccessModifiers1.AllClasses.DefaultClass;
//import AccessModifiers1.AllClasses.PrivateClass;
//
//import AccessModifiers1.AllClasses.ProtectedClass;
//
//import AccessModifiers1.AllClasses.ProtectedClass;
import AccessModifiers1.AllClasses.PublicClass;

public class Package2Class {
    public static void main(String[]args){
        PublicClass obj1=new PublicClass();
        obj1.show3();
        System.out.println(obj1.name);

//        DefaultClass obj=new DefaultClass();
//        obj.show();
//        System.out.println(obj.age);

//        PrivateClass obj3=new PrivateClass();
//        obj3.show1(); Private Method and variable are not accessible in Another class of same package.


//        ProtectedClass obj2=new ProtectedClass();
//        obj2.show2();
//        System.out.println(obj2.a);
        // Default,Private and Protected are not accessible in Different Package.


    }

}
