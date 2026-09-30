/*
 * Java Constructor, Level 1
 * Hotel Booking System: Create a HotelBooking class with attributes guestName,
 * roomType, and nights. Use default, parameterized, and copy constructors to
 * initialize bookings.
 * 
 * Author: Dheeraj Buchhha
 * Date: 29 september
 * 
 */

class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public static void main(String[] args) {

        // Using default constructor
        HotelBooking booking1 = new HotelBooking();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Dheeraj", "Deluxe", 3);

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);

        System.out.println("Booking 1:");

        System.out.println("Guest Name: " + booking1.guestName);
        System.out.println("Room Type: " + booking1.roomType);
        System.out.println("Nights: " + booking1.nights);

        System.out.println();

        System.out.println("Booking 2:");

        System.out.println("Guest Name: " + booking2.guestName);
        System.out.println("Room Type: " + booking2.roomType);
        System.out.println("Nights: " + booking2.nights);

        System.out.println();

        System.out.println("Booking 3 (Copy):");

        System.out.println("Guest Name: " + booking3.guestName);
        System.out.println("Room Type: " + booking3.roomType);
        System.out.println("Nights: " + booking3.nights);
    }
}
