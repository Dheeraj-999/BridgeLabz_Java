package main.java.Patterns;

/*
 * 3. Abstract Factory Pattern – Steps
 * 1. Create interfaces Car and Bike.
 * 2. Create concrete classes (Sedan, SUV, SportsBike, NormalBike).
 * 3. Create abstract factory VehicleFactory.
 * 4. Create CarFactory and BikeFactory implementations.
 * 5. Client uses factory without knowing concrete classes.
 * 
 * Dheeraj Buchha
 */

interface Car {
    void drive();
}

interface Bike {
    void ride();
}

class Sedan implements Car {
    public void drive() {
        System.out.println("Driving Sedan");
    }
}

class SUV implements Car {
    public void drive() {
        System.out.println("Driving SUV");
    }
}

class SportsBike implements Bike {
    public void ride() {
        System.out.println("Riding Sports Bike");
    }
}

class NormalBike implements Bike {
    public void ride() {
        System.out.println("Riding Normal Bike");
    }
}

interface VehicleFactory {
    Car createCar();

    Bike createBike();
}

class CarFactory implements VehicleFactory {
    public Car createCar() {
        return new Sedan();
    }

    public Bike createBike() {
        return null;
    }
}

class BikeFactory implements VehicleFactory {
    public Car createCar() {
        return null;
    }

    public Bike createBike() {
        return new SportsBike();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Car car = factory.createCar();
        car.drive();

        VehicleFactory bikeFactory = new BikeFactory();
        Bike bike = bikeFactory.createBike();
        bike.ride();
    }
}