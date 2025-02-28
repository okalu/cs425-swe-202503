// Common interface or abstract class
interface Transport {
    void deliver();
}

// Concrete classes implementing the Transport interface
class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}

// Factory class with a method to create Transport objects
class TransportFactory {
    public static Transport createTransport(String type) {
        if (type.equalsIgnoreCase("Truck")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("Ship")) {
            return new Ship();
        } else {
            throw new IllegalArgumentException("Unknown transport type");
        }
    }
}

// Main class to demonstrate the use of the Factory
public class Main {
    public static void main(String[] args) {
        // Use the factory to create objects
        Transport transport1 = TransportFactory.createTransport("Truck");
        transport1.deliver();  // Output: Delivering by land in a truck.

        Transport transport2 = TransportFactory.createTransport("Ship");
        transport2.deliver();  // Output: Delivering by sea in a ship.
    }
}
