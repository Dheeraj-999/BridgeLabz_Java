
import java.util.*;

class BookCategory {
    String name;

    BookCategory(String name) {
        this.name = name;
    }
}

class ClothingCategory {
    String name;

    ClothingCategory(String name) {
        this.name = name;
    }
}

class GadgetCategory {
    String name;

    GadgetCategory(String name) {
        this.name = name;
    }
}

class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println(name + " | " + price + " | " + category.name);
    }
}

public class OnlineMarketPlace {

    static <T> void applyDiscount(Product<T> product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory("Books"));

        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1000, new ClothingCategory("Clothing"));

        Product<GadgetCategory> phone = new Product<>("Mobile", 20000, new GadgetCategory("Gadgets"));

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(phone, 5);

        book.display();
        shirt.display();
        phone.display();
    }
}
