package ProjEdu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("             \t\t   ┌─────────────────────────────────────────────┐");
        System.out.println("             \t\t   │         Welcome to North Sussex Judo        │");
        System.out.println("             \t\t   └─────────────────────────────────────────────┘");

        ArrayList<AthleteInfo> athletesList = new ArrayList<>();
        AthleteInfo athleteInfo = new AthleteInfo();
        boolean addAnotherAthlete = true;

        // Main loop to add athletes
        while (addAnotherAthlete) {
            // Collect athlete's info
            athleteInfo = new AthleteInfo();
            athleteInfo.setName();
            athleteInfo.setCurrentWeight();

            athletesList.add(athleteInfo);

            processAthleteFees(athleteInfo);

            // Ask if they want to add another athlete
            addAnotherAthlete = athleteInfo.setNewAthlete(athletesList);
        }

        // Display list of registered athletes
        System.out.println("\n==============================");
        System.out.println("List of Registered Athletes:");

            System.out.println("\nName: Alex");
            System.out.println("Weight: 98.5");
            System.out.println("No. of Competition: 2");
            System.out.println("Training Plan: Intermediate");
            System.out.println("Private Hours: 5");

            System.out.println("\nName: Charlie");
            System.out.println("Weight: 96.4");
            System.out.println("No. of Competition: 1");
            System.out.println("Training Plan: Elite");
            System.out.println("Private Hours: 0");

            System.out.println("\nName: Danny");
            System.out.println("Weight: 60.5");
            System.out.println("No. of Competition: 0");
            System.out.println("Training Plan: Beginner");
            System.out.println("Private Hours: 0");

            System.out.println("\nName: Bob");
            System.out.println("Weight: 110.6");
            System.out.println("No. of Competition: 3");
            System.out.println("Weight Category: Heavyweight");
            
            System.out.println("\nName: Edward");
            System.out.println("Weight: 105.7");
            System.out.println("No. of Competition: 1");

            System.out.println("\nName: Frank");
            System.out.println("Weight: 86.2");
            System.out.println("No. of Competition: 1");
            System.out.println("Weight Category: Middleweight");

        for (AthleteInfo athlete : athletesList) {
                
            System.out.println("\nName: " + athlete.getName());
            System.out.println("Weight: " + athlete.getWeight() + "kg");
            System.out.println("Weight Category: " + athlete.getWeightCategory());
        }
        System.out.println("==============================");

        System.out.println("\nProgram finished.");
    }

    private static void processAthleteFees(AthleteInfo athlete) {
        // Centered Notes for Athletes
        System.out.println("┌────────────────────────────────────────────────────┐");
        System.out.println("│                 NOTES FOR ATHLETES                 │");
        System.out.println("├────────────────────────────────────────────────────┤");
        System.out.println("│ 1. Athletes can receive a maximum of five hours    │");
        System.out.println("│    private coaching per week.                      │");
        System.out.println("│ 2. Only Intermediate and Elite athletes can enter  │");
        System.out.println("│    competitions.                                   │");
        System.out.println("│ 3. Competitions are held on the second Saturday    │");
        System.out.println("│    of each month.                                  │");
        System.out.println("│ 4. North Sussex Judo assumes that a month consists │");
        System.out.println("│    of four weeks.                                  │");
        System.out.println("└────────────────────────────────────────────────────┘");

        // Centered Training Plan Table
        System.out.println("\n=====================================");
        System.out.println("|            TRAINING PLAN          |");
        System.out.println("=====================================");
        System.out.printf("| %-15s | %-15s |\n", "Plan", "Weekly Fee");
        System.out.println("-------------------------------------");
        System.out.printf("| %-15s | $%-14s |\n", "Beginner", "25.00");
        System.out.printf("| %-15s | $%-14s |\n", "Intermediate", "30.00");
        System.out.printf("| %-15s | $%-14s |\n", "Elite", "35.00");
        System.out.println("=====================================");

        // Training Plan Input and Competition Input
        CalculateFee calculateFee = new CalculateFee();
        TrainingPlan trainingPlan = new TrainingPlan();
        calculateFee.calculateFeeTrainingPlan(trainingPlan); // Calculate training plan costs

        // Private Coaching
        PrivateCoach privateCoach = new PrivateCoach();
        privateCoach.privCoach(); // Set private coaching details

        // Calculate Private Coaching Fee
        calculateFee.calculateFeePrivateCoach(privateCoach);

        // Calculate Total Fee
        calculateFee.calculateTotalFee();
    }
}