/*
Problem 1 - GCR Control Flow Level 1
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___

* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
        sc.close();
    }
}