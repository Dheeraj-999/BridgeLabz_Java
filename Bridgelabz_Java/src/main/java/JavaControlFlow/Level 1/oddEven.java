
/*
Problem 16 - GCR Control Flow Level 1
Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number


* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }

        }

        sc.close();
    }

}
