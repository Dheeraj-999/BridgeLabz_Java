/*
Problem -5 GCR Java strings Level 2
Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 

* Author: Dheeraj Buchha
 * Date: 26-09-2026
*/

import java.util.Arrays;
import java.util.Scanner;

public class vowelsNconsonants {

    public static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') { // method to check weather a character is vowel , conson,or not a letter...
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "vowels";
            } else {
                return "consonants";
            }
        } else {
            return "Not a letter";
        }
    }

    public static int[] countVowels(String str) {
        int index = 0;
        try {
            while (true) {
                str.charAt(index); // to find the lengthh of a string
                index++;
            }
        } catch (RuntimeException e) {
            System.out.println("runtime error occured");

        }

        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < index; i++) {
            char ch = str.charAt(i);

            String result = checkChar(ch);
            if (result.equals(vowels)) {
                vowels++;
            } else if (result.equals(consonants)) {
                consonants++;
            }
        }

        int arr[] = new int[2]; // making array to store count of vowels and conson..

        arr[0] = vowels;
        arr[1] = consonants;

        return arr;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.next();

        int arr[] = new int[2];
        arr = countVowels(str);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}