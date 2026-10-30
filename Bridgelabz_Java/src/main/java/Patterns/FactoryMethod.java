package main.java.Patterns;
/*
2. Factory Method Pattern – Steps
1. Create an interface Shape with draw().
2. Create Circle and Rectangle classes implementing Shape.
3. Create ShapeFactory class.
4. Add static method getShape(String type).
5. Return appropriate object based on input.
6. Call factory method from main class.

Dheeraj Buchha
*/

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Shape s = ShapeFactory.getShape("circle");
        s.draw();
    }
}
