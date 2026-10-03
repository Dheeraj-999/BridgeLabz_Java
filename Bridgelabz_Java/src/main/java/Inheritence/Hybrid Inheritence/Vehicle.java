/*
Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.

*/

interface Refuelable {
    void refuel();
}

class Vehicle {
    double maxSpeed;
    String model;

    Vehicle() {
    }

    Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void charge() {
        System.out.println("your model: " + model + "Successfully charged");

    }

}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void refuel() {

        System.out.println("your model: " + model + " Successfully refueled");

    }
}

public class Vehicle {
    public static void main(String[] args) {
        PetrolVehicle pv = new PetrolVehicle(300, "SUV");

        pv.refuel();

        ElectricVehicle ev = new ElectricVehicle(200, "OLA");
        ev.charge();

    }
}