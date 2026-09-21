
/*
Problem 17 - GCR Control Flow Level 1
Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.


* Author: Dheeraj Buchha
* Date: 21-09-2026
*/

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter year of service: ");
        double years = sc.nextDouble();

        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05;
            System.out.print("Bonus amount is: " + bonus);

        } else {
            System.out.print("Bonus amount is zero ");

        }

        sc.close();
    }
}