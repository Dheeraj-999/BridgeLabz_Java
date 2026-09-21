/*
Problem 2 - GCR Control Flow Level 1
Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____

* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        System.out.print("Enter number3: ");
        int number3 = sc.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
        sc.close();
    }
}