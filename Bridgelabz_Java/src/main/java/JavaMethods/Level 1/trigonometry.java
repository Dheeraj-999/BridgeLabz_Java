/*
 * Problem 12 - GCR Java Methods level 1
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class trigonometry {

    public static double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);
        // i am converting into randians first..
        double sine = Math.sin(radians);

        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine = " + result[0]);

        System.out.println("Cosine = " + result[1]);

        System.out.println("Tangent = " + result[2]);

        sc.close();
    }
}