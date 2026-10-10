package main.java.SearchingStructures.Linear.InputStreamReader;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        FileWriter fw = new FileWriter("output.txt");

        String line;

        System.out.println("Enter text (type exit to stop):");

        while ((line = br.readLine()) != null) {

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            fw.write(line + "\n");
        }

        fw.close();
        System.out.println("Input saved to output.txt");
    }
}
