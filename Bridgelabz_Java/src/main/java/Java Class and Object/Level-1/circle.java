/*
Java Classes and Objects , Level 1
Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.

Author: Dheeraj Buchhha
Date: 28 september

*/

class Circle { // Class Circle
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {

        Circle circle = new Circle(); // made a new object circle

        circle.radius = 5;

        circle.displayDetails();
    }
}