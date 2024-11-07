package oopTest3;

public class Bike extends Vehicle {
    
    boolean hasCarrier;

    public Bike(String brand, int wheels, int speed, boolean hasCarrier) {
        super(brand,  wheels, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}
