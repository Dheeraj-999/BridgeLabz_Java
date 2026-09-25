/*
 * Problem 2- GCR Java strings Level 1
 * Write a program to create a substring from a String using the charAt()
 * method. Also, use the String built-in method substring() to find the
 * substring of the text. Finally Compare the the two strings and display the
 * results
 * Hint =>
 * Take user input using the Scanner next() method to take the String variable
 * and also the start and the end index to get the substring from the given text
 * Write a method to create a substring from a string using the charAt() method
 * with the string, start, and end index as the parameters
 * Write a method to compare two strings using the charAt() method and return a
 * boolean result
 * Use the String built-in method substring() to get the substring and compare
 * the two strings. And finally display the result
 * 
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class StringToCharArray {

    public static char[] createCharArray(String str) {
        char[] result = new char[str.length()]; // defining a char array to store each char from the string

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
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
        String str = sc.next();

        char[] result1 = createCharArray(str); // user defined
        char[] result2 = str.toCharArray(); // buit-in function

        boolean result = compareArrays(result1, result2);

        System.out.println("Characters using user-defined method: ");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }

        System.out.println("Characters using toCharArray(): ");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

        System.out.println("Both arrays are same: " + result);

        sc.close();
    }
}