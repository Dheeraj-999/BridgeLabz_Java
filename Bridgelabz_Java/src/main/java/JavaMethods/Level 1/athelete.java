/*
 * Problem 4 - GCR Java Methods level 1
 *An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run

 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class athelete {
    public static double rounds(double a, double b, double c) {
        double perimeter = (a + b + c);
        return 5000 / (perimeter);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of triangle(in m): ");
        int a = sc.nextInt();

        System.out.print("Enter side 2 of triangle(in m): ");
        int b = sc.nextInt();

        System.out.print("Enter side 3 of triangle(in m): ");
        int c = sc.nextInt();

        double maxRounds = rounds(a, b, c);

        System.out.print("The max Rounds " + maxRounds);

        sc.close();
    }

}