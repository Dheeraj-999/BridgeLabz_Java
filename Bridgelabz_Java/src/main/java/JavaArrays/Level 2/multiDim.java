/*
 * Problem 7 - GCR Java arrays Level 2
 * Rewrite the above program using multi-dimensional array to store height,
 * weight, and BMI in 2D array for all the persons
 * Hint =>
 * Take input for a number of persons
 * Create a multi-dimensional array to store weight, height and BMI. Also create
 * an to store the weight status of the persons
 * double[][] personData = new double[number][3];
 * String[] weightStatus = new String[number];
 * Take input for weight and height of the persons and for negative values, ask
 * the user to enter positive values
 * Calculate BMI of all the persons and store them in the personData array and
 * also find the weight status and put them in the weightStatus array
 * Display the height, weight, BMI and status of each person
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class multiDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];

        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();

            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = sc.nextDouble();

            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4)

                weightStatus[i] = "Underweight";

            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";

            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";

            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");

            System.out.println("Height: " + personData[i][1] + " m");

            System.out.println("BMI: " + personData[i][2]);

            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
