package main.java.Patterns;

/*
 * 7. Bridge Pattern – Steps
1. Create Color interface.
2. Implement Red and Blue classes.
3. Create abstract Shape class holding Color reference.
4. Implement Circle and Square shapes.
5. Combine shapes and colors at runtime.
 * 
 * Dheeraj Buchha
 */

interface Color {
    void applyColor();
}

class Red implements Color {
    public void applyColor() {
        System.out.println("Red Color");
    }
}

class Blue implements Color {
    public void applyColor() {
        System.out.println("Blue Color");
    }
}

abstract class Shape {
    protected Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    void draw() {
        System.out.print("Circle with ");
        color.applyColor();
    }
}

class Square extends Shape {
    Square(Color color) {
        super(color);
    }

    void draw() {
        System.out.print("Square with ");
        color.applyColor();
    }
}

public class BridgePattern {
    public static void main(String[] args) {
        Shape s1 = new Circle(new Red());
        Shape s2 = new Square(new Blue());

        s1.draw();
        s2.draw();
    }
}
