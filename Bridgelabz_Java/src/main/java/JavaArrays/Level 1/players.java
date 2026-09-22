/*
 * Problem 6 - GCR Java arrays Level 1
Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class players{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double sum=0;

        double heights[] =new double[11];

        for(int i=0;i<heights.length;i++){
            System.out.println("Enter player "+ (i+1)+" height");
            heights[i]= sc.nextDouble();
        }

        for(int i=0;i<heights.length;i++){
            sum =  sum + heights[i];
        }

      double mean = sum / 11;
        System.out.println("The mean height is "+ mean);

sc.close();
    }
}