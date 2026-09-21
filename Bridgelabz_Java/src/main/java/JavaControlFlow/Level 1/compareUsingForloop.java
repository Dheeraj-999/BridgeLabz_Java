
/*
Problem 13 - GCR Control Flow Level 1
Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result



* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class compareUsingForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number.");
        } else {

            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            int formulaSum = number * (number + 1) / 2;

            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula = " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Both computations are not equal.");
            }
        }

        sc.close();
    }

}
