
/*
Problem 14 - GCR Control Flow Level 1
Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.



* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class factorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = sc.nextInt();
        int factorial = 1;

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

        }
        System.out.print("the factorial is : " + factorial);

        sc.close();
    }

}
