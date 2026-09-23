/*
 * Problem 1 - GCR Java Methods level 1
 * Write a program to input the Principal, Rate, and Time values and calculate
 * Simple Interest.
 * Hint =>
 * Simple Interest = Principal * Rate * Time / 100
 * Take user input for principal, rate, time
 * Write a method to calculate the simple interest given principle, rate and
 * time as parameters
 * Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___
 * and Time ___”
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 23-09-2026
 */

import java.util.Scanner;

public class simpleInterest {
    public static double SimpleInterest(double principal, double rate, double time) {

        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");

        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double simpleInterest = SimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
                + " at Rate of Interest " + rate + " and Time " + time);

        sc.close();
    }
}