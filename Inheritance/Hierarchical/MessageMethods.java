package Inheritance.Hierarchical;

public class MessageMethods {

        void send() {
            System.out.println("Message sent");
        }
    }

    class WhatsApp extends MessageMethods {
        void status() {
            System.out.println("WhatsApp status updated");
        }

        public static void main(String[] args) {
            WhatsApp w = new WhatsApp();
            w.send();
            w.status();
        }
    }

    class Telegram extends MessageMethods {
        void channel() {
            System.out.println("Telegram is used for messaging");
        }
    }


