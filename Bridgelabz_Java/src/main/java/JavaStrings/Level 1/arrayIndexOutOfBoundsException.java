/*
Problem -8 GCR Java strings Level 1
Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


* Author: Dheeraj Buchha
 * Date: 25-09-2026
*/

import java.util.Scanner;

public class arrayIndexOutOfBoundsException {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // generating error
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred"); // printing if error comes
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred"); // general error
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // First generate the exception
        generateException(names);

        // Then handle the exception
        handleException(names);

        sc.close();
    }
}