package AccessModifiers1.AllClasses;

public class AnotherClass {
    public static void main(String[] args){
        DefaultClass obj=new DefaultClass();
        obj.show();
        System.out.println(obj.age);

        PublicClass obj1=new PublicClass();
        obj1.show3();
        System.out.println(obj1.name);

        ProtectedClass obj2=new ProtectedClass();
        obj2.show2();
        System.out.println(obj2.a);

//        PrivateClass obj3=new PrivateClass();
//        obj3.show1(); Private Method and variable are not accessible in Another class of same package.


    }
}
