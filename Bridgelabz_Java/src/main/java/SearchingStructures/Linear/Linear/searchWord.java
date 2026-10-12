/*
Linear Search Problem 2: Search for a Specific Word in a List of Sentences
Problem:
You are given an array of sentences (strings). Write a program that performs Linear Search to find the first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains the word, return "Not Found".
Approach:
Iterate through the list of sentences.
For each sentence, check if it contains the specific word.
If the word is found, return the current sentence.
If no sentence contains the word, return "Not Found".

Author: Dheeraj Buchha
*/
public class searchWord {

    static String LinearSearch(String[] arr, String word) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(word)) {
                return arr[i];
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[] arr = {
                "programming language",
                "I am doing searching",
                "Java supports oops",
                "Linear search is easy"
        };

        String word = "Java";

        System.out.println(LinearSearch(arr, word));
    }
}