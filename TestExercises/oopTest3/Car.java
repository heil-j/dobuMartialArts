package oopTest3;

public class Car extends Vehicle {

    int doors;

    public Car(String brand,  int wheels, int speed,  int doors) {
    super(brand, wheels, speed);
    this.doors = doors;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Doors: " + doors);
    }
}
