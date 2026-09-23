/*
 * Problem 8 - GCR Java arrays Level 2
 * 1. Create a program to take input marks of students in 3 subjects physics,
 * chemistry, and maths. Compute the percentage and then calculate the grade  as
 * per the following guidelines 
 ** 
 * image**
 ** Hint => **
 * 
 * 1. Take input for the number of students
 * 2. Create arrays to store marks, percentages, and grades of the students
 * 3. Take input for marks of students in physics, chemistry, and maths. If the
 * marks are negative, ask the user to enter positive values and decrement the
 * index
 * 4. Calculate the percentage and grade of the students based on the percentage
 * 5. Display the marks, percentages, and grades of each studentFinally display
 * the largest and second-largest number
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3];

        double[] percentage = new double[number];

        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {

                System.out.println("Invalid marks. Enter positive values again.");

                i--;

                continue;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            percentage[i] = total / 3.0;

            if (percentage[i] >= 80)

                grade[i] = 'A';
            else if (percentage[i] >= 70)

                grade[i] = 'B';

            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)

                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';

            else
                grade[i] = 'R';
        }

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);

            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);

            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}