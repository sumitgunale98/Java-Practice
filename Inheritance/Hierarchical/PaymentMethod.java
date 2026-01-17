package Inheritance.Hierarchical;

public class PaymentMethod {

        void pay() {
            System.out.println("Payment initiated");
        }
    }

    class Cash extends PaymentMethod {
        void offline() {
            System.out.println("Payment is done Offline");
        }

        public static void main(String[] args) {
            Cash c = new Cash();
            c.pay();
            c.offline();
        }
    }

    class Card extends PaymentMethod {
        void online() {
            System.out.println("Online Method");
        }
    }


