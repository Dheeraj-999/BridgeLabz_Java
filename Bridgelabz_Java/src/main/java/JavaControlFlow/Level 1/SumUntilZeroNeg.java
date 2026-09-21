
/*
Problem 11 - GCR Control Flow Level 1
Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;


* Author: Dheeraj Buchha
* Date: 21-09-2026
*/
import java.util.Scanner;

public class SumUntilZeroNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        double value = sc.nextDouble();

        double total = 0;

        while (true) {

            if (value <= 0) {
                break;

            }

            total += value;

            System.out.println("enter number: ");
            value = sc.nextDouble();

        }
        System.out.println("Total = " + total);

        sc.close();
    }

}
