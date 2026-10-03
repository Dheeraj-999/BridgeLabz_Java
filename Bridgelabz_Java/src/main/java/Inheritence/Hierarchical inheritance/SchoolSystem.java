/*
Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.

Date:3 oct
*/

class Person {
    String name;
    int age;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Subject: " + this.subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Grade: " + this.grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Department: " + this.department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Rahul", 35, "Mathematics");

        Student student = new Student("Aman", 20, "A");

        Staff staff = new Staff("Ravi", 40, "Administration");

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}