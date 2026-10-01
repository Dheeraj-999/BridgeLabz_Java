/*
 * Problem: Product Shopping Cart
 *
 * Author: Dheeraj Buchhha
 * Date: 1 Oct 2026
 */

class Product {

    static double discount = 10.0; // static

    String productName; // static
    double price;
    int quantity;

    final int productID; // final

    // Constructor
    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Instance method to display product details
    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 50000, 1, 101);

        Product product2 = new Product("Mouse", 1000, 2, 102);

        // Check whether product1 is a Product object
        if (product1 instanceof Product) {
            product1.displayDetails();
        }

        System.out.println();

        // Check whether product2 is a Product object
        if (product2 instanceof Product) {
            product2.displayDetails();
        }

        System.out.println();

        // Update shared discount
        Product.updateDiscount(20.0);

        System.out.println("After updating discount:");

        if (product1 instanceof Product) {
            product1.displayDetails();
        }

        System.out.println();

        if (product2 instanceof Product) {
            product2.displayDetails();
        }
    }
}