interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }

    public void getProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: ₹" + price);
    }

    public abstract double calculateDiscount();
}


class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST on electronics.";
    }
}


class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "5% VAT on clothing.";
    }
}


class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
public class Ecommerce {
    public static void generateBill(Product product) {
        System.out.println("\n--- Product Billing ---");
        product.getProductDetails();

        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            Taxable t = (Taxable) product;
            tax = t.calculateTax();
            System.out.println(t.getTaxDetails());
        } else {
            System.out.println("No tax applicable.");
        }

        double finalPrice = product.getPrice() + tax - discount;
        System.out.printf("Discount: ₹%.2f\n", discount);
        System.out.printf("Tax: ₹%.2f\n", tax);
        System.out.printf("Final Price: ₹%.2f\n", finalPrice);
    }

    public static void main(String[] args) {
        Product p1 = new Electronics("E101", "Smartphone", 20000);
        Product p2 = new Clothing("C202", "Jacket", 3000);
        Product p3 = new Groceries("G303", "Rice (5kg)", 500);

        generateBill(p1);
        generateBill(p2);
        generateBill(p3);
    }
}
