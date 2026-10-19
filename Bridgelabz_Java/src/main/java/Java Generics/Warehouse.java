
import java.util.*;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Item: " + name);
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

public class Warehouse {

    // Wildcard method
    static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Wheat"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("Electronics:");
        displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture:");
        displayItems(furnitureStorage.getItems());
    }
}
