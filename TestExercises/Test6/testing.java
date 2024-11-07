package Test6;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("Enter a Number: ");
        int rNum = sc.nextInt();

        if (rNum % 3  == 0 && rNum % 5 == 0) {
            System.out.println("FizzBuzz15");
        }
        else if (rNum % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (rNum % 3 == 0) {
            System.out.println("Fizz");
        }
        else {
            System.out.println("The number you entered is not divisible by 3 or 5");
        }
        System.out.println("Do you want to enter another number? (yes /no)");
        String choice = sc.next();
        if (!choice.equalsIgnoreCase("yes")) {
            break;
        }
    }
    System.out.println("Thank you for Participating!");
    sc.close();
  }

}
