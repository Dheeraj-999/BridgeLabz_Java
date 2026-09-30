/*
 * Java Classes and Objects , Level 1
 * Program to Handle Mobile Phone Details
 * Problem Statement: Create a MobilePhone class with attributes brand, model,
 * and price. Add a method to display all the details of the phone. The
 * MobilePhone class uses attributes to store the phone's characteristics. The
 * method is used to retrieve and display this information for each object.
 * 
 * Author: Dheeraj Buchhha
 * Date: 28 september
 * 
 */

class MobilePhone {
    String brand;
    String model;
    double price;

    public void display() {
        System.out.println("The brand is: " + brand);
        System.out.println("The model is: " + model);
        System.out.println("The price is: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();

        m1.brand = "samsung";
        m1.model = "A56";
        m1.price = 40000;

        m1.display();
    }

}
