/*
 * Problem -4 GCR Built-in-function practice problem
 * Problem 4: Date Comparison Write a program that:
 * ➢ Takes two date inputs and compares them to check if the first date is
 * before, after,
 * or the same as the second date.
 * Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate
 * 
 * class.
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");

        LocalDate date2 = LocalDate.parse(sc.nextLine());

        if (date1.isBefore(date2)) {

            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {

            System.out.println("First date is after the second date.");
        } else if (date1.isEqual(date2)) {

            System.out.println("Both dates are the same.");
        }
    }
}