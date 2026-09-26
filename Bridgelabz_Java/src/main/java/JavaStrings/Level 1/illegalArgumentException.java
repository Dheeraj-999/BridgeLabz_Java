/*
 * Problem 6- GCR Java strings Level 1
 * Write a program to demonstrate IllegalArgumentException
 * Hint =>
 * Define a variable of type String and take user input to assign a value
 * Write a Method to generate the Exception. Here use the subString() and set
 * the start index to be greater than the end index. This will generate a
 * runtime exception and abruptly stop the program.
 * Write the Method to demonstrate IllegalArgumentException. Here use the
 * subString() and set the start index to be greater than the end index. This
 * will generate a runtime exception. Use the try-catch block to handle the
 * IllegalArgumentException and the generic runtime exception
 * From the main Firstly call the method to generate the Exception then call the
 * method to handle the RuntimeException
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class illegalArgumentException {

    public static void generateException(String text) {
        System.out.println(text.substring(7, 3));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(7, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();
        generateException(text);
        handleException(text); // handling exception method

        sc.close();
    }
}