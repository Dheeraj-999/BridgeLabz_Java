/*
 * Sample Program 3: Employee Management System
 * Design an Employee class with the following features:
 * Static:
 * A static variable companyName shared by all employees.
 * A static method displayTotalEmployees() to show the total number of
 * employees.
 * This:
 * Use this to initialize name, id, and designation in the constructor.
 * Final:
 * Use a final variable id for the employee ID, which cannot be modified after
 * assignment.
 * Instanceof:
 * Check if a given object is an instance of the Employee class before printing
 * the employee details.
 * 
 * 
 * Author: Dheeraj Buchhha
 * Date: 30 september
 * 
 */

class Employee {

    // Static variables
    static String companyName = "ABC Technologies";
    static int totalEmployees = 0;

    String name; // Instance variables
    String designation;

    final int id; // final

    Employee(String name, int id, String designation) {

        this.name = name;
        this.id = id;
        this.designation = designation;

        totalEmployees++;
    }

    // Static method
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Instance method
    void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Dheeraj", 101, "Software Developer");

        Employee employee2 = new Employee("Rahul", 102, "Tester");

        // Check if employee1 is an Employee object
        if (employee1 instanceof Employee) {
            employee1.displayDetails();
        }

        System.out.println();

        // Check if employee2 is an Employee object
        if (employee2 instanceof Employee) {
            employee2.displayDetails();
        }

        System.out.println();

        // Display total employees
        Employee.displayTotalEmployees();
    }
}