/*
 * Problem: Vehicle Registration System
 *
 * Author: Dheeraj Buchhha
 * Date: 1 Oct 2026
 */

class Vehicle {

    static double registrationFee = 5000; // static var
    static int totalVehicles = 0;

    String ownerName; // instance var
    String vehicleType;

    final String registrationNumber; // final

    // Constructor
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;

        totalVehicles++;
    }

    static void updateRegistrationFee(double newFee) { // static method
        registrationFee = newFee;
    }

    // Instance method
    void displayRegistrationDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Dheeraj", "Car", "TN01AB1234");

        Vehicle vehicle2 = new Vehicle("Rahul", "Bike", "TN02CD5678");

        // Check whether vehicle1 is a Vehicle object
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails();
        }

        System.out.println();

        // Check whether vehicle2 is a Vehicle object
        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayRegistrationDetails();
        }

        System.out.println();

        // Update registration fee
        Vehicle.updateRegistrationFee(7500);

        System.out.println("After updating registration fee:");

        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails();
        }

        System.out.println();

        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayRegistrationDetails();
        }
    }
}