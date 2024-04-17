
class Vehicle {
    void start() {
        System.out.println("Vehicle starting..");
    }

    void stop() {
        System.out.println("Vehicle stopping..");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("car is driving..");
    }
}

public class SingleInhe {

    public static void main(String[] args) {
        Car c = new Car();

        c.start();
        c.stop();
        c.drive();
    }

}
