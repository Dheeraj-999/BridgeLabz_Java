/*
 * Problem 9 - GCR Java arrays Level 1
Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element


 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;
public class matrix{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int index=0;

        System.out.println("enter rows : ");
        int rows = sc.nextInt();

         System.out.println("enter columns : ");
        int columns = sc.nextInt();

        int matArr[]=new int[rows*columns];
        int matrix[][]= new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                int a= sc.nextInt();
                matrix[i][j]=a;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matArr[index]=matrix[i][j];
                index++;
            }
        }

for(int i=0;i<matArr.length;i++){
     System.out.println(matArr[i]);
}
        

 
sc.close();

    }
}