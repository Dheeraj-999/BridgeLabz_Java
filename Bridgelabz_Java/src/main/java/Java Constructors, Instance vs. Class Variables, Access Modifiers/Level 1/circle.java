/*
 * Java Constructor, Level 1
 * Write a Circle class with a radius attribute. Use constructor chaining to
 * initialize radius with default and user-provided values.
 * 
 * Author: Dheeraj Buchhha
 * Date: 29 september
 * 
 */
class Circle {
    double radius;

    Circle() { // constructor with no parameters
        this(5.0); // chaining
        System.out.println("This is first constructor");
    }

    Circle(double radius) { // with parameters
        this.radius = radius;
        System.out.println("This is second constructor");

    }

    public static void main(String[] args) {
        Circle cir1 = new Circle();
        Circle cir2 = new Circle(10);

        System.out.println("Radius: " + cir1.radius);
        System.out.println("Radius: " + cir2.radius);

    }

}
