/*
 * Problem 11- GCR Java Methods Level 3
 * 1. Create a program to find the bonus of 10 employees based on their years of
 * service as well as the total bonus amount the 10-year-old company Zara has to
 * pay as a bonus, along with the old and new salary.
 ** 
 * Hint => **
 * 
 * 1. Zara decides to give a bonus of 5% to employees whose year of service is
 * more than 5 years or 2% if less than 5 years
 * 2. Create a Method to determine the Salary and years of service and return
 * the same. Use the ***Math.random()*** method to determine the 5-digit salary
 * for each employee and also use the random method to determine the years of
 * service. Define 2D Array to save the salary and years of service.
 * 3. Write a Method to calculate the new salary and bonus based on the logic
 * defined above and return the new 2D Array of the latest salary and bonus
 * amount 
 * 4. Write a Method to Calculate the sum of the Old Salary, the Sum of the New
 * Salary, and the Total Bonus Amount and display it in a Tabular Forma
 * 
 * Author: Dheeraj Buchha
 * Date: 25-09-2026
 */

public class EmployeeBonus {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData() {
        double[][] employees = new double[10][2];

        for (int i = 0; i < 10; i++) {
            employees[i][0] = 10000 + (int) (Math.random() * 90000);
            employees[i][1] = (int) (Math.random() * 11);
        }

        return employees;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] employees) {
        double[][] result = new double[10][2];

        for (int i = 0; i < 10; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    // Method to calculate totals and display the result
    public static void displayResult(double[][] employees, double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");

        for (int i = 0; i < 10; i++) {
            double oldSalary = employees[i][0];
            double years = employees[i][1];
            double newSalary = result[i][0];
            double bonus = result[i][1];

            totalOldSalary = totalOldSalary + oldSalary;
            totalNewSalary = totalNewSalary + newSalary;
            totalBonus = totalBonus + bonus;

            System.out.printf(
                    "%d\t\t%.2f\t\t%.0f\t%.2f\t\t%.2f%n",
                    i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println();
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        double[][] employees = generateEmployeeData();

        double[][] result = calculateBonus(employees);

        displayResult(employees, result);
    }
}