/*
 * Problem: University Student Management
 *
 * Author: Dheeraj Buchhha
 * Date: 1 Oct 2026
 */

class Student {

    static String universityName = "ABC University";
    static int totalStudents = 0;

    String name; // instance
    String grade;

    final int rollNumber;// final var

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        totalStudents++;
    }

    // Static method
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Instance method to display details
    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    void updateGrade(String newGrade) { // instance method
        grade = newGrade;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Dheeraj", 101, "A");

        Student student2 = new Student("Rahul", 102, "B");

        // Check student1 before displaying details
        if (student1 instanceof Student) {
            student1.displayDetails();
        }

        System.out.println();

        // Check student2 before displaying details
        if (student2 instanceof Student) {
            student2.displayDetails();
        }

        System.out.println();

        // Check before updating grade
        if (student1 instanceof Student) {
            student1.updateGrade("A+");
        }

        System.out.println("After updating grade:");

        if (student1 instanceof Student) {
            student1.displayDetails();
        }

        System.out.println();

        // Display total students
        Student.displayTotalStudents();
    }
}