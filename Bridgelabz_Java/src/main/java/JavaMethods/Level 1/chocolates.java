/*
 * Problem 10 - GCR Java Methods level 1
Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class chocolates {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerStudent = number / divisor;
        int leftChocolates = number % divisor;

        return new int[] { chocolatesPerStudent, leftChocolates };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int N = sc.nextInt();

        System.out.print("Enter number of students : ");
        int M = sc.nextInt();

        int[] result = findRemainderAndQuotient(N, M);

        System.out.println(" No of chocolates per student: " + result[0]);
        System.out.println(" No of chocolates left : " + result[1]);

        sc.close();
    }

}