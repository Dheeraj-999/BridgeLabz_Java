/*
 * Problem 1: University Management System
 
Author:Dheeraj Buchhha
Date: 29 sept
*/

class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    // Method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.rollNumber = 101;
        student.name = "Dheeraj";
        student.setCGPA(8.5);

        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.name);
        System.out.println("CGPA: " + student.getCGPA());

        // Subclass
        class PostgraduateStudent extends Student {

            void displayDetails() {
                System.out.println();
                System.out.println("Inside PostgraduateStudent:");
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
            }
        }

        PostgraduateStudent pgStudent = new PostgraduateStudent();

        pgStudent.rollNumber = 102;
        pgStudent.name = "Rahul";

        pgStudent.displayDetails();
    }
}