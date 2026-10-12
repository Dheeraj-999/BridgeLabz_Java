/*
Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
Add a new ticket reservation at the end of the circular list.
Remove a ticket by Ticket ID.
Display the current tickets in the list.
Search for a ticket by Customer Name or Movie Name.
Calculate the total number of booked tickets.

Author: Dheeraj Buchha
*/

class Node {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Node next;

    Node(int ticketId, String customerName, String movieName,
            int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

class TicketReservation {
    Node head = null;
    Node tail = null;

    void addTicket(int ticketId, String customerName, String movieName,
            int seatNumber, String bookingTime) {

        Node newNode = new Node(ticketId, customerName, movieName,
                seatNumber, bookingTime);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    void removeTicket(int ticketId) {

        if (head == null) {
            System.out.println("No tickets");
            return;
        }

        Node current = head;
        Node previous = tail;

        do {
            if (current.ticketId == ticketId) {

                if (head == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    previous.next = current.next;

                    if (current == tail) {
                        tail = previous;
                        tail.next = head;
                    }
                }

                System.out.println("Ticket removed");
                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println("Ticket not found");
    }

    void displayTickets() {

        if (head == null) {
            System.out.println("No tickets");
            return;
        }

        Node current = head;

        do {
            System.out.println(current.ticketId + " "
                    + current.customerName + " "
                    + current.movieName + " "
                    + current.seatNumber + " "
                    + current.bookingTime);

            current = current.next;

        } while (current != head);
    }

    void searchTicket(String name) {

        if (head == null) {
            System.out.println("No tickets");
            return;
        }

        Node current = head;
        boolean found = false;

        do {
            if (current.customerName.equalsIgnoreCase(name)
                    || current.movieName.equalsIgnoreCase(name)) {

                System.out.println(current.ticketId + " "
                        + current.customerName + " "
                        + current.movieName + " "
                        + current.seatNumber + " "
                        + current.bookingTime);

                found = true;
            }

            current = current.next;

        } while (current != head);

        if (!found) {
            System.out.println("Ticket not found");
        }
    }

    int countTickets() {

        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;

        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }
}

public class OnlineTicketReservation {
    public static void main(String[] args) {

        TicketReservation system = new TicketReservation();

        system.addTicket(101, "Dheeraj", "Avengers", 10, "10:00 AM");
        system.addTicket(102, "Rahul", "Avengers", 11, "10:15 AM");
        system.addTicket(103, "Aman", "Batman", 15, "10:30 AM");

        System.out.println("Tickets:");
        system.displayTickets();

        System.out.println("\nSearch:");
        system.searchTicket("Avengers");

        System.out.println("\nRemove:");
        system.removeTicket(102);

        System.out.println("\nTickets after removal:");
        system.displayTickets();

        System.out.println("\nTotal tickets: " + system.countTickets());
    }
}