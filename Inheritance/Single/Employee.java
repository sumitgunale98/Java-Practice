package Inheritance;

public class Employee {
    int salary = 300000;
}
class Manager extends Employee{
    void income(){
        System.out.println("Manager income is: "+salary);
    }
    public static void main(String[]args){
        Manager m=new Manager();
        m.income();

    }
}
