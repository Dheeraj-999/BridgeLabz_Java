/*
 * Problem 5 - GCR Java Methods level 1
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class PN0 {

    public static int checkNumber(int number) {

        if (number > 0) {
            return 1;

        } else if (number < 0) {

            return -1;
        } else {
            return 0;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = checkNumber(number);

        System.out.println("Result: " + result);

        sc.close();
    }
}