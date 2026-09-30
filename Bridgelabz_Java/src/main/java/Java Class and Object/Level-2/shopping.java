/*
 * Java Classes and Objects , Level 2
 * Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.


 * Author: Dheeraj Buchhha
 * Date: 28 september
 * 
 */

class CartItem { // class made Caritem
    String itemName;
    double price;
    int quantity;

    void addItem(int amount) {
        quantity = quantity + amount;
        System.out.println(amount + " item(s) added");
    }

    void removeItem(int amount) {
        if (amount <= quantity) {
            quantity = quantity - amount;
            System.out.println(amount + " item(s) removed");
        } else {
            System.out.println("Cannot remove more items than available");
        }
    }

    void displayTotalCost() {
        double totalCost = price * quantity; // cal total cost and then showing in print statement

        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {

        CartItem item = new CartItem();
        item.itemName = "Laptop";
        item.price = 50000;
        item.quantity = 1; // initially quantity is 1

        item.addItem(2);

        item.removeItem(1);

        item.displayTotalCost();
    }

}