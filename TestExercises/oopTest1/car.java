package oopTest1;

import java.util.Scanner;

class car {
    String brand;
    String model;
    int year;
    String color;
    int hp;

    car() {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Brand of your Car: ");
    brand = sc.nextLine();
    System.out.println("Enter the Model of your Car: ");
    model = sc.nextLine();
    System.out.println("Enter the Year Model of your Car: ");
    year = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the Color of your Car: ");
    color = sc.nextLine();
    System.out.println("Enter the Hp of your Car: ");
    hp = sc.nextInt();
    sc.close();
    }

    void carData() {
        System.out.println("\nBrand: " +  brand);
        System.out.println("Model: " +  model);
        System.out.println("Year Model: " +   year);
        System.out.println("Color: " + color);
        System.out.println("Hp: " + hp);
    }
{
    
}
}

