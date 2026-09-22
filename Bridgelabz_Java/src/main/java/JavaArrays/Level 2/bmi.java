/*
 * Problem 6 - GCR Java arrays Level 2
 * An organization took up an exercise to find the Body Mass Index (BMI) of all
 * the persons in the team. For this create a program to find the BMI and
 * display the height, weight, BMI and status of each individual
 * Hint =>
 * Take input for a number of persons
 * Create arrays to store the weight, height, BMI, and weight status of the
 * persons
 * Take input for the weight and height of the persons
 * Calculate the BMI of all the persons and store them in an array and also find
 * the weight status of the persons
 * Display the height, weight, BMI, and weight status of each person
 * Use the table to determine the weight status of the person

* 
 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];

        double[] height = new double[n];

        double[] bmi = new double[n];

        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)

                status[i] = "Underweight";

            else if (bmi[i] <= 24.9)

                status[i] = "Normal";
            else if (bmi[i] <= 39.9)

                status[i] = "Overweight";

            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.println("Height: " + height[i] + " m");

            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }

        sc.close();
    }
}