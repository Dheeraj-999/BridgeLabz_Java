/*
 * Problem 7- GCR Java strings Level 1
 *Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

 * 
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class numberFormatException {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text); //buit in function
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred");  //numberformat exception
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred"); //genearal exception
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String text = sc.next();

        // First generate the exception
        //generateException(text);  //execute one after one,not parallely...

        // Then handle the exception
        handleException(text);

        sc.close();
    }
}