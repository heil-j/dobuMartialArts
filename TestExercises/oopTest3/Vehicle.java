package oopTest3;

public class Vehicle {
    
    String brand;
    int wheels;
    int speed;

    public Vehicle(String brand,  int wheels, int speed) {

        this.brand = brand;
        this.wheels = wheels;
        this.speed = speed;
    }
    void start() {
    System.out.println("The Vehicle is starting");
    }

    void stop() {
        System.out.println("The Vehicle is stopping");
    }

    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels; " + wheels);
        System.out.println("Speed: " + speed + " km/h");
    }
    
}
