package Inheritance.Hierarchical;

public class Notification {

        void beep() {
            System.out.println("Notification beep Sound");
        }
    }

    class Email extends Notification {
        void format() {
            System.out.println("Notification for Email");
        }

        public static void main(String[] args) {
            Email e = new Email();
            e.beep();
            e.format();
        }
    }

    class SMS extends Notification {
        void limit() {
            System.out.println("Notification OTP in SMS");
        }
    }


