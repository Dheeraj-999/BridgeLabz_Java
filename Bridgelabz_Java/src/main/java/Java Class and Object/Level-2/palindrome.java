/*
 * Java Classes and Objects , Level 2
Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.


 * Author: Dheeraj Buchhha
 * Date: 28 september
 * 
 */

class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversed = ""; // creating a empty string

        for (int i = text.length() - 1; i >= 0; i--) { // loop backwards
            reversed = reversed + text.charAt(i);
        }

        return text.equals(reversed);
    }

    void displayResult() {
        if (isPalindrome()) { // if palindrome, then print it is palindrome
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        checker.text = "madam";

        checker.displayResult();
    }
}