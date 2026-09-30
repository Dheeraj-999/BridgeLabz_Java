/*
 * Problem 4: Employee Records
 
Author:Dheeraj Buchhha
Date: 29 sept
*/

class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    // Method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to access salary
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.employeeID = 101;
        employee.department = "IT";
        employee.setSalary(50000);

        System.out.println("Employee ID: " + employee.employeeID);
        System.out.println("Department: " + employee.department);
        System.out.println("Salary: " + employee.getSalary());

        // Subclass
        class Manager extends Employee {

            void displayDetails() {
                System.out.println();
                System.out.println("Inside Manager:");
                System.out.println("Employee ID: " + employeeID);
                System.out.println("Department: " + department);
            }
        }

        Manager manager = new Manager();

        manager.employeeID = 102;
        manager.department = "Management";

        manager.displayDetails();
    }
}