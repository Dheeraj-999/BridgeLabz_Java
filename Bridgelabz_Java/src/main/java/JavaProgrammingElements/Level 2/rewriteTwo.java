/*
Problem 8 - GCR Java Programming elements Level 2
Rewrite the Sample Program 2 with user inputs
Hint => 
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken 
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___

* Author: Dheeraj Buchha
 * Date: 22-09-2026
*/

import java.util.Scanner;
public class rewriteTwo {
 public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

  System.out.print("Enter name:");

String name = sc.nextLine();

  System.out.print("Enter from city: ");

  String fromCity = sc.nextLine();

  System.out.print("Enter via city: ");

  String viaCity = sc.nextLine();

  
System.out.print("Enter to city: ");
  String toCity = sc.nextLine();


  System.out.print("Enter distance from " +fromCity + " to " + viaCity + ": ");
  double fromToVia = sc.nextDouble();

  System.out.print("Enter distance from " +viaCity + " to " + toCity + ": ");
  double viaToFinalCity = sc.nextDouble();

  System.out.print("Enter hours from" +fromCity + " to " + viaCity + ": ");
  int hours1 = sc.nextInt();

  System.out.print(" Enter minutes from" + fromCity + " to " + viaCity + ": ");
  int minutes1 = sc.nextInt();

  System.out.print("Enter hours from " + viaCity + " to " + toCity + ": ");
  int hours2 = sc.nextInt();

  System.out.print("Enter minutes from " + viaCity + " to " + toCity + ": ");
  int minutes2 = sc.nextInt();



 double totalDistance = fromToVia + viaToFinalCity;

  int totalMinutes  = ( hours1 * 60 +  minutes1) + (hours2 * 60 +  minutes2);
  int totalHours = totalMinutes / 60;
  int remainingMinutes = totalMinutes % 60;

  System.out.println( name + " travels from " + fromCity + " to " + toCity + " via " + viaCity);
  System.out.println("The total  distance is " + totalDistance + " km");
  System.out.println("The total time is " + totalHours + " hours " + remainingMinutes + " minutes");
  sc.close();
 }
}