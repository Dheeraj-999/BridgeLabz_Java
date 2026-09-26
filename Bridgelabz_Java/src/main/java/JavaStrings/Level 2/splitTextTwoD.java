/*
Problem -3 GCR Java strings Level 2
Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display


* Author: Dheeraj Buchha
 * Date: 26-09-2026
*/

import java.util.Scanner;

public class splitTextTwoD {

    public static int findLength(String str) {

        int count = 0; // finding all the characters including space
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

    public static String[] splitingText(String str) {

        int len = findLength(str); // finding number of words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int storeIndex[] = new int[wordCount - 1]; // making a array to store gaps index form the sentence
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                storeIndex[index] = i;
                index++;
            }
        }

        String[] words = new String[wordCount]; // making another array to store substring i.e each word in the sentence
        int start = 0;
        for (int i = 0; i < storeIndex.length; i++) {
            int end = storeIndex[i];

            words[i] = str.substring(start, end);
            start = end + 1;
        }
        words[wordCount - 1] = str.substring(start, len);
        return words;
    }

    public static String[][] wordAndLength(String[] words) { // making 2d string array
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];

            int length = findLength(words[i]);

            result[i][1] = String.valueOf(length);
        }
        return result;
    }

    public static void main(String[] args) { // main function

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        String[] result1 = splitingText(str); // by user method

        String[][] result = wordAndLength(result1);

        for (int i = 0; i < result.length; i++) {

            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t" + length);
        }
        sc.close();
    }
}