/*
 * Problem: Hospital Management System
 *
 * Author: Dheeraj Buchhha
 * Date: 1 Oct 2026
 */

class Patient {

    static String hospitalName = "City Hospital"; // static var
    static int totalPatients = 0;

    String name; // instance var
    int age;
    String ailment;

    final int patientID; // final

    // Constructor
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        totalPatients++;
    }

    static void getTotalPatients() { // static method
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() { // instance method
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {

        Patient patient1 = new Patient("Dheeraj", 21, "Fever", 101);

        Patient patient2 = new Patient("Rahul", 25, "Cold", 102);

        // Check whether patient1 is a Patient object
        if (patient1 instanceof Patient) {
            patient1.displayDetails();
        }

        System.out.println();

        // Check whether patient2 is a Patient object
        if (patient2 instanceof Patient) {
            patient2.displayDetails();
        }

        System.out.println();

        Patient.getTotalPatients();
    }
}