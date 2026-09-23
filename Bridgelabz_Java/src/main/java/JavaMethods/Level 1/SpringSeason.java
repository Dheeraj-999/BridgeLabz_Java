/*
 * Problem 6 - GCR Java Methods level 1
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class SpringSeason {

    public static boolean checkSeason(int month, int day) {
        if (month == 3 && day >= 20) {

            return true;
        } else if (month == 4 || month == 5) {

            return true;
        } else if (month == 6 && day <= 20) {

            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        boolean result = checkSeason(month, day);

        if (result) {

            System.out.println("Its a Spring Season");
        } else {

            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}