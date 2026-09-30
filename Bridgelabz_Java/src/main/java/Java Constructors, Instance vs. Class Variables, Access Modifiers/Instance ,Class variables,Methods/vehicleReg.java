/*
 * Problem 3: Vehicle Registration
 * Create a Vehicle class with instance variables ownerName
 * and vehicleType and a class variable registrationFee.
 */

class Vehicle {

    String ownerName; // Instance variables
    String vehicleType;

    static double registrationFee = 5000; // class var

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() { // Instance variables
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Dheeraj", "Car");
        Vehicle vehicle2 = new Vehicle("Rahul", "Bike");

        vehicle1.displayVehicleDetails();

        System.out.println();

        vehicle2.displayVehicleDetails();

        System.out.println();

        // Update registration fee
        Vehicle.updateRegistrationFee(7500);

        System.out.println("After updating registration fee:");

        System.out.println();

        vehicle1.displayVehicleDetails();

        System.out.println();

        vehicle2.displayVehicleDetails();
    }
}