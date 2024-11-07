package ProjEdu;

import java.util.Scanner;

public class TrainingPlan {
    
    private Scanner sc = new Scanner(System.in);
    private double weeklyFee;
    private int numCompetitions;
    private double competitionCost;

    public int trainChose() {
        int choice1;
        while (true) {
            System.out.println("\nEnter the number of the training plan you want to enroll: (1 (Beginner), 2 (Intermediate), 3 (Elite))");
            if (sc.hasNextInt()) {
                choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        weeklyFee = 25;
                        return choice1;
                    case 2:
                        weeklyFee = 30;
                        System.out.println("\nYou have chosen Intermediate class.");
                        break;
                    case 3:
                        weeklyFee = 35; 
                        System.out.println("\nYou have chosen Elite class.");
                        break;
                    default:
                        System.out.println("\nInvalid training choice.");
                        continue; 
                }

                while (true) {
                    System.out.println("\nDo you want to enter a competition that costs $22 per competition? (yes/no)");
                    String competitionChoice = sc.next();

                    if (competitionChoice.equalsIgnoreCase("yes")) {
                        System.out.println("\nHow many competitions do you want to join?");
                        if (sc.hasNextInt()) {
                            numCompetitions = sc.nextInt();
                            competitionCost = numCompetitions * 22.00; 
                        } else {
                            System.out.println("\nInvalid number of competitions. Please enter a valid number.");
                            sc.next(); 
                            continue; 
                        }
                        return choice1; 
                    } else if (competitionChoice.equalsIgnoreCase("no")) {
                        return choice1;
                    } else {
                        System.out.println("\nInvalid choice. Please enter 'yes' or 'no'.");
                    }
                }
            } else {
                System.out.println("\nInvalid input. Please enter a valid number.");
                sc.next();
            }
        }
    }

    public void setNumCompetitions(int numCompetitions) {
        this.numCompetitions = numCompetitions;
    }

    public int getNumCompetitions() {
        return numCompetitions;
    }

    public double getWeeklyFee() {
        return weeklyFee;
    }

    public double calculateMonthlyFee() {
        return weeklyFee * 4; 
    }

    public void setCompetitionCost(double competitionCost) {
        this.competitionCost = competitionCost;
    }

    public double getCompetitionCost() {
        return competitionCost;
    }   
}