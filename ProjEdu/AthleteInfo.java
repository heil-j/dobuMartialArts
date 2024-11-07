package ProjEdu;

import java.util.Scanner;
import java.util.ArrayList;

public class AthleteInfo {

    private Scanner sc = new Scanner(System.in);
    private final double lightHeavyWeightLimit = 100;
    private final double middleWeightLimit = 90;
    private final double lightMiddleWeightLimit = 81;
    private final double lightWeightLimit = 73;
    private final double flyWeightLimit = 66;
    private boolean isValidCategory = false;
    private boolean confirmName = false;
    private String name;
    private double weight;
    private String weightCategory;
   

    public void setName() {

        while (!confirmName) {
            System.out.println("\nEnter your name: ");
            this.name = sc.nextLine();

            // Validate name input
            if (!this.name.matches("[a-zA-Z]+")) {
                System.out.println("\nInvalid input. Please enter a valid name.");
                continue; // Go back to asking for the name
            }

            System.out.println("\nIs this correct: " + this.name + " (yes/no)");
            String confirm = sc.next();

            sc.nextLine();

            if (confirm.equalsIgnoreCase("yes")) {
                confirmName = true;
            } else if (confirm.equalsIgnoreCase("no")) {
                System.out.println("\nPlease enter your name again");
            } else {
                System.out.println("\nInvalid input, please enter a valid response.");
            }
        }
    }

    public void setCurrentWeight() {       
         while (true) {
            System.out.println("\nEnter your Current Weight in kg:");
            if (sc.hasNextDouble()) {
                weight = sc.nextDouble();
                sc.nextLine(); 
                if (weight <= 0) {
                    System.out.println("\nInvalid weight, please enter a valid weight");
                } else {
                    break;
                }
            } else {
                System.out.println("\nInvalid input, please enter a valid weight");
                sc.next();
                sc.nextLine();
            }
        }
       
            // Centered Weight Category
            System.out.println("\n=======================================");
            System.out.println("|            WEIGHT CATEGORY           |");
            System.out.println("========================================");
            System.out.printf("| %-20s | %-13s |\n", "Category", "Weight");
            System.out.println("----------------------------------------");
            System.out.printf("| %-20s | %-13s |\n", "Heavyweight", "Above 100kg");
            System.out.printf("| %-20s | %-13s |\n", "Light-Heavyweight", "100kg");
            System.out.printf("| %-20s | %-13s |\n", "Middleweight", "90kg");
            System.out.printf("| %-20s | %-13s |\n", "Light-Middleweight", "81kg");
            System.out.printf("| %-20s | %-13s |\n", "Lightweight", "73kg");
            System.out.printf("| %-20s | %-13s |\n", "Flyweight", "66kg");
            System.out.println("========================================");

    
            while(!isValidCategory) {
            System.out.println("\nWhat weight category do you want to enter?");
            weightCategory = sc.nextLine();
            
            if (weightCategory.equalsIgnoreCase("Heavyweight") ||
            weightCategory.equalsIgnoreCase("Light-Heavyweight") ||
            weightCategory.equalsIgnoreCase("Middleweight") ||
            weightCategory.equalsIgnoreCase("Light-Middleweight") ||
            weightCategory.equalsIgnoreCase("Lightweight") ||
            weightCategory.equalsIgnoreCase("Flyweight")) {
                isValidCategory = true;
            } else {
                System.out.println("\nInvalid weight category, please enter a valid weight category");
            }
            if (weightCategory.equalsIgnoreCase("Heavyweight")) {
                if (weight > lightHeavyWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: above 100. Athlete qualified");
                } else {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: above 100. Athlete needs to gain weight");
                }
            } else if (weightCategory.equalsIgnoreCase("Light-Heavyweight")){
                if (weight == lightHeavyWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 100 kg. Athlete qualified");
                } else if (weight > lightHeavyWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 100 kg. Athlete needs to loose weight");
                } else {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 100 kg. Athlete needs to gain weight");
                }
            } else if (weightCategory.equalsIgnoreCase("Middleweight")){
                if (weight == middleWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 90 kg. Athlete qualified");
                } else if (weight > middleWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 90 kg. Athlete needs to loose weight");
                } else {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 90 kg. Athlete needs to gain weight");
                }
            } else if (weightCategory.equalsIgnoreCase("Light-Middleweight")){
                if(weight == lightMiddleWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 81 kg. Athlete qualified");
                } else if (weight > lightHeavyWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 81 kg. Athlete needs to loose weight");
                } else {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 81 kg. Athlete needs to gain weight");
                }
            } else if (weightCategory.equalsIgnoreCase("Lightweight")) {
                if(weight == lightWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 73 kg. Athlete qualified");
                } else if (weight > lightWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 73 kg. Athlete needs to loose weight");
                } else {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 73 kg. Athlete needs to gain weight");
                }
            } else if (weightCategory.equalsIgnoreCase("Flyweight")) {
                if(weight == flyWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 66 kg. Athlete qualified");
                } else if (weight > flyWeightLimit) {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 66 kg. Athlete needs to loose weight");
                } else {
                    System.out.println("\nYour current weight: " + weight + " kg " + "vs Category limit: 66 kg. Athlete needs to gain weight");
                }
            }
        }
    }
    public String getWeightCategory () {
        return this.weightCategory;
    }
    public double getWeight() {
        return this.weight;
    }
    public String getName() {
        return this.name;
    }
   @SuppressWarnings("resource")
public boolean setNewAthlete(ArrayList<AthleteInfo> athletesList) {
    Scanner scanner = new Scanner(System.in);
    String response;

    // Validation loop
    while (true) {
        System.out.println("\nDo you want to add another athlete? (y/n): ");
        response = scanner.nextLine();

        // Check if the input is valid
        if (response.equalsIgnoreCase("y")) {
            return true;  
        } else if (response.equalsIgnoreCase("n")) {
            return false; 
        } else {
            System.out.println("\nInvalid input, please try again.");
        }
    }
  }
}