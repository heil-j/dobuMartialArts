package oopTest3;

public class Truck extends Vehicle {
    
    int loadCapacity;

    public Truck(String brand, int wheels, int speed, int loadCapacity) {
        super(brand, wheels, speed);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Load capacity: " + loadCapacity + " tons");
    }
}
