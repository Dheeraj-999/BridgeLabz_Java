/*
 * Problem 5 - GCR Java arrays Level 1
Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___



 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class mulSixToNine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int multiplicationResult[]= new int[4];

        System.out.println("enter a number: ");
        int number=sc.nextInt();


        for(int i=0;i<multiplicationResult.length;i++){
            multiplicationResult[i]=number * (i+6);
        }

        for(int i=0;i<multiplicationResult.length;i++){
            System.out.println(number+" * "+ (i+6)+" = " + multiplicationResult[i]);
        }

       
        sc.close();
    }
}