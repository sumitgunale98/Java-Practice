package Inheritance.Hybrid;

public class Electronic {


        void power() {
            System.out.println("Power ON");
        }
    }

    class Phone extends Electronic {
        void call() {
            System.out.println("Calling");
        }
    }

    class Android extends Phone {
        public static void main(String[] args) {
            Android a = new Android();
            a.power();
            a.call();
            System.out.println("Android OS");
        }
    }

    class iPhone extends Phone {
        void ios() {
            System.out.println("iOS");
        }
    }

