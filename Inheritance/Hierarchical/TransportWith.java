package Inheritance.Hierarchical;

public class TransportWith {
    void start() {
        System.out.println("Transport started");
    }
}

class Taxi extends TransportWith {
    void meter() {
        System.out.println("Taxi meter is running");
    }
    void Type(){
        System.out.println("Transportation with Taxi");
    }

    public static void main(String[] args) {
        Taxi t = new Taxi();
        t.start();
        t.meter();
        t.Type();
    }
}

class Bus extends TransportWith {
    void ticket() {
        System.out.println("Bus ticket issued");
    }
}

