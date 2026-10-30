package main.java.Patterns;
/*
 * 9. Decorator Pattern – Steps
 * 1. Create Coffee interface with cost().
 * 2. Implement SimpleCoffee.
 * 3. Create abstract CoffeeDecorator.
 * 4. Create MilkDecorator and SugarDecorator.
 * 5. Wrap coffee object dynamically.
 */

interface Coffee {
    double cost();
}

class SimpleCoffee implements Coffee {
    public double cost() {
        return 50;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 10;
    }
}

class SugarDecorator extends CoffeeDecorator {
    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 5;
    }
}

public class Decorator {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println("Total: " + coffee.cost());
    }
}
