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
