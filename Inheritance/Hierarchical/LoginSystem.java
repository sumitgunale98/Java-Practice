package Inheritance.Hierarchical;

public class LoginSystem {

        void login() {
            System.out.println("User is Logging in");
        }
    }

    class Admin extends LoginSystem {
        void access() {
            System.out.println("Access is Granted");
        }

        public static void main(String[] args) {
            Admin a = new Admin();
            a.login();
            a.access();
        }
    }

    class Guest extends LoginSystem {
        void type() {
            System.out.println("For Guest-No Logging Required ");
        }
    }


