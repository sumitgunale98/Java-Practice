package Inheritance;

public class Account {
    void Type() {
        System.out.println("Type of Account is Current");

    }
}
    class Current extends Account{
        void balance(){
            int CurrentBalance =1000000;
            System.out.println("Current account Balance is:"+CurrentBalance);

        }
        public static void main(String[]args){
            Current c= new Current();
            c.Type();
            c.balance();

        }
    }

