/*
 * Problem 3- GCR Java strings Level 1
Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result

 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class charactersInString {

    public static char[] charString(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean comparing(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) { // checking if both char arrays are equal or not
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] result1 = charString(text);
        char[] result2 = text.toCharArray();

        boolean result = comparing(result1, result2);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println("are both character same: " + result);

        sc.close();
    }
}