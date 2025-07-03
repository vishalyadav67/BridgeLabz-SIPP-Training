import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void showProduct() {
        System.out.println(" - " + name + " (₹" + price + ")");
    }
}

class Order {
    private int orderId;
    private List<Product> productList;
    private Customers customer;

    public Order(int orderId, Customers customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " by " + customer.getName());
        for (Product p : productList) {
            p.showProduct();
        }
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }
}

class Customers {
    private String name;
    private List<Order> orders;

    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showCustomerOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println(" Total: ₹" + order.getTotalAmount());
            System.out.println();
        }
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Headphones", 1500);
        Product p3 = new Product("Mouse", 600);

        Customers c1 = new Customers("Ananya");

        Order order1 = new Order(101, c1);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102, c1);
        order2.addProduct(p3);

        c1.placeOrder(order1);
        c1.placeOrder(order2);

        c1.showCustomerOrders();
    }
}
