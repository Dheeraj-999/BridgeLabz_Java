/*
 * Problem 3 - GCR Java arrays Level 1
 Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___

 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class multiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = sc.nextInt();


        int arr[] = new int[10];

        for(int i=0;i<10;i++){
arr[i] = number * (i+1);
        }

        for(int i=0;i<10;i++){
             System.out.println(number+" * "+ (i+1)+" = "+ arr[i] );

        }

       
        sc.close();
    }
}