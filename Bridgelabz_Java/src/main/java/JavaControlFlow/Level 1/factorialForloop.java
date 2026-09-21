
/*
Problem 15 - GCR Control Flow Level 1
Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 


* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class factorialForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = sc.nextInt();
        int factorial = 1;

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

        }
        System.out.print("the factorial is : " + factorial);

        sc.close();
    }

}
