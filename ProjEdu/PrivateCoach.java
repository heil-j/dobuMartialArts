package ProjEdu;

import java.util.Scanner;

public class PrivateCoach {

    private Scanner sc = new Scanner(System.in);
    private boolean isChoiceValid2 = false;  
    private boolean isChoiceValid3 = false;
    private final int privateTuition = 9; // Cost per hour
    private final int weeksPerMonth = 4; // Assuming 4 weeks in a month
    private int hours;
    private double privateCoachingCost;

    public void privCoach() {
        while (!isChoiceValid2) {
            System.out.println("\nDo you want to avail private coaching? (yes/no)");
            String choice2 = sc.next();

            if (choice2.equalsIgnoreCase("yes")) {
                isChoiceValid2 = true;
                promptForHours();
            } else if (choice2.equalsIgnoreCase("no")) {
                isChoiceValid2 = true;
                break;
            } else {
                System.out.println("\nInvalid input, please try again");
            }
        }
    }

    private void promptForHours() {
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.println("Note for Private Coaching: Athletes can receive a maximum of five hours private coaching a week");
        System.out.println("-----------------------------------------------------------------------------------------------");

        while (!isChoiceValid3) {
            System.out.println("\nHow many hours of private coaching do you want to avail every week in 1 month? (1-5)");
            if (sc.hasNextInt()) {  // Check if the input is an integer
                hours = sc.nextInt();
                if (hours >= 1 && hours <= 5) {
                    privateCoachingCost = hours * privateTuition * weeksPerMonth; // Calculate total cost
                    System.out.println("\nYou will be charged for $" + (hours * privateTuition) + " per week or $" + privateCoachingCost + " per month");
                    isChoiceValid3 = true;
                } else {
                    System.out.println("\nInvalid input, the maximum hours of private coaching is 5 only.");
                }
            } else {
                System.out.println("\nInvalid input, please enter a valid number between 1 and 5.");
                sc.next();  // Consume the invalid input
            }
        }
    }


    public int getHours() {
        return hours;
    }

    public double getPrivateCoachingCost() {
        return privateCoachingCost;
    }

    public void closeScanner() {
        sc.close();
    }
}