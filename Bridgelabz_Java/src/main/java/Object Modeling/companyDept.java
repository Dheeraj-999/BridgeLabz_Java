/* 

Problem 3: Company and Departments (Composition)

Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.
*/

import java.util.ArrayList;

class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmpDetails() {
        System.out.println("Employee name: " + name + " | employee id: " + id);
    }
}

class Department {
    String Deptname;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String Deptname) {
        this.Deptname = Deptname;
    }

    void addEmployee(String name, int id) {
        Employee employee = new Employee(name, id);
        employees.add(employee);
    }

    void DisplayDept() {
        System.out.println("Deptartment name " + Deptname);

        for (Employee employee : employees) {
            employee.displayEmpDetails();
            ;
        }
    }

}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(String DeptName) {
        Department department = new Department(DeptName);
        departments.add(department);
    }

    Department getDepartment(int index) {
        return departments.get(index);
    }

    void displayCompany() {
        System.out.println("Company Name: " + companyName);

        for (Department department : departments) {
            department.DisplayDept();
        }
    }

}

public class companyDept {
    public static void main(String[] args) {

        Company company = new Company("Bridgelabz");

        company.addDepartment("development");
        company.addDepartment("AIML");

        Department development = company.getDepartment(0);
        Department AIML = company.getDepartment(1);

        development.addEmployee("Dheeraj", 101);
        development.addEmployee("rahul", 103);

        AIML.addEmployee("Priya", 202);

        company.displayCompany();

    }
}