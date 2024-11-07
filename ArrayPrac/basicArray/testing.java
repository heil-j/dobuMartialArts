package ArrayPrac.basicArray;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] number = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            number[i] = sc.nextInt();
        }

        System.out.println("You entered: ");
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i]; 
        }
        System.out.println("The sum of the numbers is " + sum);

        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                
            }
        }
        System.out.println("The largest number is " + max);
        
        sc.close();
    }
}