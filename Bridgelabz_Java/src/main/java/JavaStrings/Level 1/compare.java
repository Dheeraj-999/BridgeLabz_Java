/*
Problem 1- GCR Java strings Level 1
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 


* Author: Dheeraj Buchha
 * Date: 25-09-2026
*/

import java.util.Scanner;

public class compare {

    public static boolean comparing(String str1, String str2) {
        if (str1.length() != str2.length()) { // returning false if there is no same length
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) { // accessing each character in the string
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1 : ");
        String str1 = sc.next();

        System.out.print("Enter string 2 : ");
        String str2 = sc.next();

        boolean result1 = comparing(str1, str2);
        boolean result2 = str1.equals(str2);

        System.out.println("Using charAt(): " + result1);
        System.out.println("Using equals(): " + result2);

        System.out.println("Both results are same: " + (result1 == result2));
        sc.close();
    }
}
