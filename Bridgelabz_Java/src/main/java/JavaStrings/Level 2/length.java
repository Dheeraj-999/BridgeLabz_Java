/*
Problem -1 GCR Java strings Level 2
Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result


* Author: Dheeraj Buchha
 * Date: 26-09-2026
*/

import java.util.Scanner;

public class length {

    public static int lengthException(String str) {

        int count = 0;
        try {
            while (true) {
                str.charAt(count); // charAt takes each character in string and make it count++
                count++;
            }
        } catch (RuntimeException e) { // it will return runtime exception after count is more than the length
            System.out.println("Runtime Exception occurred"); // printing if error comes
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.next();

        int result1 = lengthException(str); // by user method

        int result2 = str.length(); // by built-in-method

        System.out.println(result1);
        System.out.println(result2);

        System.out.println("Both the ways generate same length: " + (result1 == result2));

        sc.close();
    }
}