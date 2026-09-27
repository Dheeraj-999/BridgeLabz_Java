/*
 * Problem -1 GCR Java strings Level 3
 * An organization took up the exercise to find the Body Mass Index (BMI) of all
 * the persons in a team of 10 members. For this create a program to find the
 * BMI and display the height, weight, BMI, and status of each individual
 * Hint =>
 * Take user input for the person's weight (kg) and height (cm) and store it in
 * the corresponding 2D array of 10 rows. The First Column stores the weight and
 * the second column stores the height in cm
 * Create a Method to find the BMI and status of every person given the person's
 * height and weight and return the 2D String array. Use the formula BMI =
 * weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
 * Create a Method that takes the 2D array of height and weight as parameters.
 * Calls the user-defined method to compute the BMI and the BMI Status and
 * stores in a 2D String array of height, weight, BMI, and status.
 * Create a method to display the 2D string array in a tabular format of
 * Person's Height, Weight, BMI, and the Status
 * Finally, the main function takes user inputs, calls the user-defined methods,
 * and displays the result.
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 27-09-2026
 */

import java.util.Scanner;

public class bmi {
    public static String[] findBMI(double weight, double height) {
        double heightMeter = height / 100; // converting into meters
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight"; // cal exact status
        } else {
            status = "Obese";
        }

        return new String[] {
                String.valueOf(height),
                String.valueOf(weight),
                String.format("%.2f", bmi),
                status
        };
    }

    public static String[][] findAllBMI(double[][] people) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            result[i] = findBMI(people[i][0], people[i][1]); // finding the string array incluidng hei,wei,bmiandstatus

        }

        return result;
    }

    public static void display(String[][] result) {
        System.out.println("Height\tWeight\tBMI\tStatus"); // displaying te columns

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t" + result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] people = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            people[i][0] = sc.nextDouble();

            System.out.print("Enter height for person " + (i + 1) + " in cm: ");
            people[i][1] = sc.nextDouble();
        }

        String[][] result = findAllBMI(people);

        display(result);
    }
}