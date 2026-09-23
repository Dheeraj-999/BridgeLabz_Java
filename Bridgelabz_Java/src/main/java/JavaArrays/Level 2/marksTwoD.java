/*
 * Problem 9 - GCR Java arrays Level 2
 * 1. Rewrite the above program to store the marks of the students in physics,
 * chemistry, and maths in a 2D array and then compute the percentage and grade
 ** 
 * Hint => **
 * 
 * 1. All the steps are the same as the problem 8 except the marks are stored in
 * a 2D array
 * 2. Use the 2D array to calculate the percentages, and grades of the students
 * 
 * Author: Dheeraj Buchha
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class marksTwoD {
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

                System.out.println("Enter positive marks.");
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

            System.out.println("Student " + (i + 1));

            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);

            System.out.println("Percentage: " + percentage[i]);

            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}