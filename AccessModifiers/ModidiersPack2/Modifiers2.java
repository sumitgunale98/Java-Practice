package AccessModifiers.ModidiersPack2;

import AccessModifiers.ModifiersPack1.Modifiers;

class Modifiers2 extends Modifiers {
    public static void main(String[] args) {
        Modifiers2 M2 = new Modifiers2();
        //M2.defaultMethod(); Default Method is not accessible in different Package.
        M2.protectedMethod();//Create Object of the child class.
        M2.publicMethod();
        System.out.println(M2.c);
        //Only public variable is accessible in different package.
        System.out.println(M2.d);// Protected is accessible through Inheritance.



    }
}

