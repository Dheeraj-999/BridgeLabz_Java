/*
 * Problem -2 GCR Built-in-function practice problem
 * 2. Problem 2: Date Arithmetic Create a program that:
 * ➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
 * ➢ Then subtracts 3 weeks from the result.
 * Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
 * minusWeeks() methods.
 * 
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.time.LocalDate;
import java.util.Scanner;

public class dateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);

        System.out.println("Final date: " + date);
    }
}