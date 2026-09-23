/*
 * Problem 9 - GCR Java Methods level 1
Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class division {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();

        int[] result = findRemainderAndQuotient(num1, num2);

        System.out.println("the remainder is  : " + result[0]);
        System.out.println("the quotient is  : " + result[1]);
        sc.close();

    }
}