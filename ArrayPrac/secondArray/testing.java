package ArrayPrac.secondArray;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col = sc.nextInt();

        int[][] array = new int[rows][col];

        System.out.println("\nEnter the elements of array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
            System.out.println("\nThe 2d array you entered is: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
        }
        
        int sum = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0;  j < col; j++){
                sum += array [i][j];
            }
        }
        System.out.println("\nThe sum of the numbers in the array is " + sum);

        int max = array[0][0];
        for (int i = 0;  i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The biggest number in the array is " + max);

        System.out.println("Do you want to enter another value? (yes/no)");
        String choice = sc.next();
        if (!choice.equalsIgnoreCase("yes")) {
            break;
        }
    }
    sc.close();
}
}
