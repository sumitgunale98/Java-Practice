package Inheritance.Multilevel;

public class Company {
    void CompanyName(){
        System.out.println("Citi");
    }
}
class Department extends Company{
    void DepName(){
        System.out.println("Software Department");
    }
}
class Employee extends Department{
    void EmployeeName(){
        System.out.println("Sumit");
    }
    public static void main(String[] args){
        Employee EP=new Employee();
        EP.CompanyName();
        EP.DepName();
        EP.EmployeeName();
    }
}
