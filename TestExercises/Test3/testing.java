package Test3;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("|                                       |");
        System.out.println("|                                       |");
        System.out.println("|                                       |");
        System.out.println("|                                       |");
        System.out.println("-----------------------------------------");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("The number entered is " + number);

        sc.close();
    }
}
