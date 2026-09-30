/*
 * Problem 1: Product Inventory
 * Create a Product class with instance variables productName and price.
 * Use a class variable totalProducts shared among all products.
 */

class Product {

    String productName;// instance
    double price;

    static int totalProducts = 0; // static

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        totalProducts++; // every time it increases
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 50000);
        Product product2 = new Product("Mobile", 25000);
        Product product3 = new Product("Headphones", 2000);

        product1.displayProductDetails();
        System.out.println();

        product2.displayProductDetails();

        System.out.println();

        product3.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
}