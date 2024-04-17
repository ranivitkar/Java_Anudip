public class Car_Has {

    private String color;
    private int maxSpeed;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void carInfo() {
        System.out.println("car color: " + color + " Max speed: " + maxSpeed);
    }

    public static void main(String[] args) {
        Car_Has nano = new Car_Has();

        nano.setColor("Black");

        nano.setMaxSpeed(300);

        nano.carInfo();

        Maserati obj = new Maserati();

        obj.masertiStartDemo();
    }

}

class Maserati extends Car_Has {

    public void masertiStartDemo() {

        Engine MasertiEngine = new Engine();
        MasertiEngine.start();
        MasertiEngine.stop();

    }
}

class Engine {
    public void start() {

        System.out.println("Started..");
    }

    public void stop() {
        System.out.println("Stopped..");
    }

}
