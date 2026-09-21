/*
Problem 7 - GCR Control Flow Level 1
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20


* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter month: ");
        int month = sc.nextInt();

        System.out.print("enter date: ");
        int date = sc.nextInt();

        if (month == 3 && date <= 20 ||
                month == 4 ||
                month == 5 ||
                month == 6 && date <= 20) {

            System.out.println("its a spring season");
        } else {
            System.out.println("its not a spring season");

        }

        sc.close();
    }

}