import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void displayInfo();
   }

//Subclasses
class Electronics extends WarehouseItem {
 public Electronics(String name) {
     super(name);
 }

 @Override
 public void displayInfo() {
     System.out.println("Electronics: " + getName());
 }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Groceries: " + getName());
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture: " + getName());
    }
}

// Generic Storage class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Utility class for displaying items
class WarehouseUtils {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }
}

// Main class
public class SmartWareHouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Smartphone"));
        electronicsStorage.addItem(new Electronics("Laptop"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Wheat"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("All Electronics:");
        WarehouseUtils.displayAllItems(electronicsStorage.getItems());

        System.out.println("\nAll Groceries:");
        WarehouseUtils.displayAllItems(groceriesStorage.getItems());

        System.out.println("\nAll Furniture:");
        WarehouseUtils.displayAllItems(furnitureStorage.getItems());
    }
}


