interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); 
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; 
    }

    public String getDiscountDetails() {
        return "10% discount on Veg items.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double serviceCharge = base * 0.05; 
        return base + serviceCharge;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; 
    }

    public String getDiscountDetails() {
        return "5% discount on Non-Veg items.";
    }
}
public class FoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();

        double total = item.calculateTotalPrice();
        System.out.println("Total Price: ₹" + total);

        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            double discount = d.applyDiscount();
            System.out.println(d.getDiscountDetails());
            System.out.println("Discount Applied: ₹" + discount);
            System.out.println("Final Price: ₹" + (total - discount));
        }

       
    }

    public static void main(String[] args) {
        FoodItem order1 = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem order2 = new NonVegItem("Chicken Biryani", 300, 2);

        processOrder(order1);
        processOrder(order2);
    }
}
