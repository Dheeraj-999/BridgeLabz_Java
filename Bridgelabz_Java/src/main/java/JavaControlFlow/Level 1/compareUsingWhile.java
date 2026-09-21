
/*
Problem 12 - GCR Control Flow Level 1
Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result

 

* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class compareUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number.");
        } else {

            int i = 1;
            int sum = 0;

            while (i <= number) {
                sum += i;
                i++;
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
