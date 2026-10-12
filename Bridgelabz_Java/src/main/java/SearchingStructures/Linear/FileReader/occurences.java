/*
FileReader Problem 2: Count the Occurrence of a Word in a File Using FileReader
Problem:
Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
Approach:
Create a FileReader to read from the file and wrap it in a BufferedReader.
Initialize a counter variable to keep track of word occurrences.
For each line in the file, split it into words and check if the target word exists.
Increment the counter each time the word is found.
Print the final count.

Author: Dheeraj Buchha
*/

package main.java.SearchingStructures.Linear.FileReader;

import java.io.*;

public class occurences {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        String word = "Hello";

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\s+");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(word)) {
                    count++;
                }
            }

        }
        br.close();
        System.out.println("Word occured " + count + " times");
    }
}
