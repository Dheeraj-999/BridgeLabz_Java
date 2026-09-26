/*
Problem -2 GCR Java strings Level 2
Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result


* Author: Dheeraj Buchha
 * Date: 26-09-2026
*/

import java.util.Scanner;

public class splittext {

    public static int findLength(String str) {

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

    public static String[] splitingText(String str) {

        int len = findLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int storeIndex[] = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                storeIndex[index] = i;
                index++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < storeIndex.length; i++) {
            int end = storeIndex[i];

            words[i] = str.substring(start, end);
            start = end + 1;
        }
        words[wordCount - 1] = str.substring(start, len);
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        String[] result1 = splitingText(str); // by user method

        String[] result2 = str.split(" "); // by built-in-method

        boolean comparing = compareArrays(result1, result2);

        for (String word : result1) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split() method:");

        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }

        System.out.println("Both the ways generate same length: " + comparing);

        sc.close();
    }
}