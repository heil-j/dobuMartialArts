package Test1;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.print("What's your name? ");
        String myName = sc.nextLine();
        System.out.println("Hello " + myName + "! Welcome to Vs Code!");
        sc.close();
    }
}
