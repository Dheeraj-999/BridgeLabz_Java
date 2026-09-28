/*
 * Problem -3 GCR Built-in-function practice problem
 * 3. Problem 3: Date Formatting Write a program that:
 * ➢ Displays the current date in three different formats:
 * ■ dd/MM/yyyy
 * ■ yyyy-MM-dd
 * ■ EEE, MMM dd, yyyy
 * 
 * Hint: Use DateTimeFormatter with custom patterns for date formatting.
 * Author: Dheeraj Buchha
 * Date: 28-09-2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateFormat {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + date.format(format1));

        System.out.println("Format 2: " + date.format(format2));

        System.out.println("Format 3: " + date.format(format3));
    }
}