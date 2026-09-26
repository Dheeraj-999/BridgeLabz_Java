/*
 * Problem 10- GCR Java strings Level 1
 *Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result

 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

import java.util.Scanner;

public class convertToLowerCase {

    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // diff btween A and a ASCII values is 32..
            }

            result = result + ch; // ..adding uppercase char to the result
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) { // checcking if both methods give same result or not
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String result1 = convertToLowerCase(text); // user metod created by my side..
        String result2 = text.toLowerCase(); // built-in -function

        System.out.println("lowercase using user-defined method: " + result1);
        System.out.println("lowercase using built-in method: " + result2);

        boolean result = compareStrings(result1, result2);

        System.out.println("Both results are same: " + result);

        sc.close();
    }
}