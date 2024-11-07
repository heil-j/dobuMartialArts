    package Test2;

    import java.util.Scanner;

    public class testing {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
            System.out.println("Choose between 3 choices: Rock, Scissors, Paper");
            System.out.print("Enter your choice player number 1: ");
            String choiceOne = sc.next();
            System.out.print("Enter your choice player number 2: ");
            String choiceTwo = sc.next();

            if (choiceOne.equalsIgnoreCase("Rock") && (choiceTwo.equalsIgnoreCase("Scissors")) || (choiceOne.equalsIgnoreCase("Paper") && choiceTwo.equalsIgnoreCase("Rock")) ||  (choiceOne.equalsIgnoreCase("Scissors") && choiceTwo.equalsIgnoreCase("Paper"))) {
                System.out.println("Player 1 wins");
            } else if  (choiceOne.equalsIgnoreCase("Scissors") && (choiceTwo.equalsIgnoreCase("Rock")) || (choiceOne.equals("Paper") &&  choiceTwo.equalsIgnoreCase("Scissors")) || (choiceOne.equalsIgnoreCase("Rock") && choiceTwo.equalsIgnoreCase("Paper"))) {
                System.out.println("Player 2 wins");
            } else {
                System.out.println("It's a tie");
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String nextGame = sc.next();
            if (!nextGame.equalsIgnoreCase("yes")) {
                break;
            }
        } 
        sc.close();
    }
}

