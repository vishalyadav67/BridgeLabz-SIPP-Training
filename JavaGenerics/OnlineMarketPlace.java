import java.util.*;

abstract class Category {
    public abstract String getCategoryName();
}

class BookCategory extends Category {
    private String type;

    public BookCategory(String type) {
        this.type = type;
    }

    @Override
    public String getCategoryName() {
        return "Book - " + type;
    }
}

class ClothingCategory extends Category {
    private String gender;

    public ClothingCategory(String gender) {
        this.gender = gender;
    }

    @Override
    public String getCategoryName() {
        return "Clothing - " + gender;
    }
}

class GadgetCategory extends Category {
    private String deviceType;

    public GadgetCategory(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String getCategoryName() {
        return "Gadget - " + deviceType;
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public void displayInfo() {
        System.out.printf("%s | ₹%.2f | %s%n", name, price, category.getCategoryName());
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }
}

class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.applyDiscount(percent);
        System.out.println("Applied " + percent + "% discount to: " + product.getName());
    }
}

public class OnlineMarketPlace {
    public static void main(String[] args) {
        Product<BookCategory> novel = new Product<>("The Alchemist", 350.0, new BookCategory("Fiction"));
        Product<ClothingCategory> jeans = new Product<>("Denim Jeans", 1200.0, new ClothingCategory("Men"));
        Product<GadgetCategory> laptop = new Product<>("Gaming Laptop", 60000.0, new GadgetCategory("Laptop"));

        List<Product<? extends Category>> catalog = new ArrayList<>();
        catalog.add(novel);
        catalog.add(jeans);
        catalog.add(laptop);

        DiscountManager.applyDiscount(novel, 5);
        DiscountManager.applyDiscount(jeans, 10);
        DiscountManager.applyDiscount(laptop, 7.5);

        System.out.println("\n--- Product Catalog ---");
        for (Product<? extends Category> item : catalog) {
            item.displayInfo();
        }
    }
}
