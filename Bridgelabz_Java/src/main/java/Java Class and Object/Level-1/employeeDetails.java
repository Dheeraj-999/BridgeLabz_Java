/*
Java Classes and Objects , Level 1
Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

Author: Dheeraj Buchhha
Date: 28 september

*/

class Employee { // class created Employees
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee employee = new Employee(); // new object name employee

        employee.name = "Dheeraj";
        employee.id = 101;
        employee.salary = 50000;

        employee.displayDetails();
    }
}
