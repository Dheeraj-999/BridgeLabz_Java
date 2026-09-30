/*
Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).


 * Author: Dheeraj Buchhha
 * Date: 28 september
 * 
 */

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String seat, double ticketPrice) { // passing seat number and price
        seatNumber = seat;
        price = ticketPrice;

        System.out.println("Ticket booked successfully"); // sending message of booking successfull
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        ticket.movieName = "Avengers";

        ticket.bookTicket("A10", 250);

        ticket.displayDetails();
    }
}