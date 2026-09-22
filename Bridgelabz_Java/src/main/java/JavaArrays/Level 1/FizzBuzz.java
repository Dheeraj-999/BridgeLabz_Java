/*
 * Problem 10 - GCR Java arrays Level 1
Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position



 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            

            String[] results = new String[number];

            for (int i = 0; i < number; i++) {

                int value = i + 1;

                if (value % 3 == 0 && value % 5 == 0) {

                    results[i] = "FizzBuzz";
                } 
                else if (value % 3 == 0) {
                    results[i] = "Fizz";
                } 
                else if (value % 5 == 0) {

                    results[i] = "Buzz";
                } 
                else {

                    results[i] = String.valueOf(value);
                }
            }

            for (int i = 0; i < results.length; i++) {

                System.out.println("Position " + (i + 1) + " = " + results[i]);
            }
        }

        sc.close();
    }
}