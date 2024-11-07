package Test5;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("This program calculates your grade.");
        System.out.print("\nHow many grades would you like to enter? ");
        int numGrades = sc.nextInt();

        int[] myGrades = new int[numGrades];

        for (int i = 0; i < myGrades.length; i++) {
            System.out.print("Home Work " + (i + 1) + " score: ");
            myGrades[i] = sc.nextInt();
        }   
        
        int sum = 0;    
        for (int i = 0; i < myGrades.length; i++) {
            sum += myGrades[i];
        }

        int avg = sum / myGrades.length;
        int aboveAvg = 70;
        
            if (aboveAvg <= avg) {
                System.out.println("\nYou passed!");
            } else {
                System.out.println("You failed");
            }
        
        System.out.println("Your Average Score is " + avg);
        sc.close();
    }
}
