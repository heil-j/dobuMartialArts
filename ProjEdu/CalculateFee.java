package ProjEdu;

public class CalculateFee {

    private double trainingCost;
    private double competitionCost;
    private double privateCoachingCost;
    private double totalCost;

    public void calculateFeeTrainingPlan(TrainingPlan trainingPlan) {
        int trainingChoice = trainingPlan.trainChose();
        
        switch (trainingChoice) {
            case 1:
                trainingCost = 25 * 4; // Cost for Beginner
                System.out.println("\nTraining plan cost (Beginner) for 4 weeks: $" + trainingCost);
                break;
            case 2:
                trainingCost = 30 * 4; // Cost for Intermediate
                System.out.println("\nTraining plan cost (Intermediate) for 4 weeks: $" + trainingCost);
                break;
            case 3:
                trainingCost = 35 * 4; // Cost for Elite
                System.out.println("\nTraining plan cost (Elite) for 4 weeks: $" + trainingCost);
                break;
            default:
                System.out.println("Invalid training choice.");
        }

        competitionCost = trainingPlan.getCompetitionCost();
        if (competitionCost > 0) {
            System.out.println("Competition cost for this month: $" + competitionCost);
        }
    }

    public void calculateFeePrivateCoach(PrivateCoach privateCoach) {
        privateCoachingCost = privateCoach.getPrivateCoachingCost();
        if (privateCoachingCost > 0) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("Private coaching cost for this month: $" + privateCoachingCost);
            System.out.println("------------------------------------------------------------");
        }
    }

    public double calculateTotalFee() {
        double totalCost = trainingCost + competitionCost + privateCoachingCost;
        System.out.println("\n======================================================");
        System.out.println("Total cost for this month: $" + totalCost);
        System.out.println("=======================================================");
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public double getTotalCost() {
        return this.totalCost;
    }
}