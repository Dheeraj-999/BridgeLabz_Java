
/*
 * Java Constructor, Level 1
 * Car Rental System:
 * Create a CarRental class with attributes customerName, carModel,
 * and rentalDays. Add constructors to initialize the rental details
 * and calculate total cost.
 *
 * Author: Dheeraj Buchhha
 * Date: 30 September
 */

class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Basic";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculate total cost
    double calculateTotalCost() {

        double dailyRate;

        if (carModel.equals("SUV")) {
            dailyRate = 3000;
        } else if (carModel.equals("Sedan")) {
            dailyRate = 2000;
        } else {
            dailyRate = 1500;
        }

        return dailyRate * rentalDays;
    }

    public static void main(String[] args) {

        // Using default constructor
        CarRental rental1 = new CarRental();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Dheeraj", "SUV", 3);

        System.out.println("Rental 1:");

        System.out.println("Customer: " + rental1.customerName);
        System.out.println("Car Model: " + rental1.carModel);
        System.out.println("Rental Days: " + rental1.rentalDays);
        System.out.println("Total Cost: " + rental1.calculateTotalCost());

        System.out.println();

        System.out.println("Rental 2:");

        System.out.println("Customer: " + rental2.customerName);
        System.out.println("Car Model: " + rental2.carModel);
        System.out.println("Rental Days: " + rental2.rentalDays);
        System.out.println("Total Cost: " + rental2.calculateTotalCost());
    }
}