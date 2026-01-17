package Inheritance.Hierarchical;

public class Services {
    void request() {
            System.out.println("Service requested");
        }
    }

    class Cleaning extends Services {
        void sweep() {
            System.out.println("Cleaning in progress");
        }

        }


    class Repair extends Services {
        void fix() {
            System.out.println("Repair working  started");
        }

        public static void main(String[] args) {
            Repair r = new Repair();
            r.request();
            r.fix();
        }
    }

