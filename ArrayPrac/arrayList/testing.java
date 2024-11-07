package ArrayPrac.arrayList;

import java.util.Scanner;
import java.util.ArrayList;


public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();

        while(true) {
        System.out.println("How many numbers do you want to add?");
        int count = sc.nextInt();

        System.out.println("Enter " + count + " numbers");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            number.add(num);
        }
        System.out.println("The numbers in the ArrayList are: " + number);
        
        int sum = 0;
        for (int num : number) {
            sum += num;
        }
        System.out.println("The sum of the numbers in the ArrayList is " + sum);
        
        int max = number.get(0);
        for (int num : number) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The largest number in the ArrayList is " + max);

        System.out.println("Enter the index of the number you want to remove (0 to " + (number.size() - 1) + "):");
        int index = sc.nextInt();

        if (index >= 0 && index < number.size()) {
            number.remove(index);
            System.out.println("Updated ArrayList" + number);
        } else {
            System.out.println("Invalid Index");
        }
        System.out.println("Do you want to enter another value? (yes/no)");
        String choice = sc.next();
        if (!choice.equalsIgnoreCase("yes")) {
            break;
        }
    }
      sc.close();
    }
}
