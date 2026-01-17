package Inheritance.Hybrid;

public class Account {
    void open(){
        System.out.println("Open Account");
    }
}
class BankAccount extends Account{
    void deposit(){
        System.out.println("Deposit Money");
    }
}
class SavingsAccount extends BankAccount{
    void savingsInterest(){
        System.out.println("Savings Account");
    }
}
class CurrentAccount extends BankAccount{
    void Current(){
        System.out.println("Current Account");
    }
}
class SalaryAccount extends BankAccount{
    void salary(){
        int salary=100000;
        System.out.println("Salary Account "+salary);

    }
    public static void main(String[]args){
        SalaryAccount Sa=new SalaryAccount();
        Sa.open();
        Sa.deposit();
        Sa.salary();


    }
}
