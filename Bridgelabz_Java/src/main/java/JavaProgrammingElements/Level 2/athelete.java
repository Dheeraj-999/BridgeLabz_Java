/*
Problem 9- GCR Java Programming elements Level 2
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km


* Author: Dheeraj Buchha
 * Date: 22-09-2026
*/

import java.util.Scanner;

public class athelete {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter side1 in meters: ");

    double side1 = sc.nextDouble();

    System.out.print("Enter side2 in meters: ");

    double side2 = sc.nextDouble();

    System.out.print("Enter side3 in meters: ");
    double side3 = sc.nextDouble();

    double perimeter = side1 + side2 + side3;
    double rounds = 5000 / perimeter;

    System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    sc.close();
  }
}
