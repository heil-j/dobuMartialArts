package oopTest3;

public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Honda", 4, 180, 4);
        Car car2 = new Car("Toyota", 4, 120, 4);
        
        car1.start();
        System.out.println("");
        car1.showInfo();
        System.out.println("");
        car1.stop();
        System.out.println("");
        car2.start();
        System.out.println("");
        car2.showInfo();
        System.out.println("");
        car2.stop();
        System.out.println("");

        Truck truck1 = new Truck("Isuzu", 10, 100, 69);
        Truck truck2 = new Truck("Isuzu", 18, 100, 120);

        truck1.start();
        System.out.println("");
        truck1.showInfo();
        System.out.println("");
        truck1.stop();
        System.out.println("");
        truck2.start();
        System.out.println("");
        truck2.showInfo();
        System.out.println("");
        truck2.stop();
        System.out.println("");

        Bike bike1 = new Bike("Ducati", 2, 299, true);
        Bike bike2 = new Bike("Kawasaki", 2, 299, false);

        System.out.println("");
        bike1.start();
        System.out.println("");
        bike1.showInfo();
        System.out.println("");
        bike1.stop();
        System.out.println("");
        bike2.start();
        System.out.println("");
        bike2.showInfo();
        System.out.println("");
        bike2.stop();

    }
}
