class Product {
    
    String productName;
    double price;
    
    static int totalProducts = 0;
    
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }
    
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);     
    }
    
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);        
    }
}

public class ProductInventory {
    public static void main(String[] args) {
       
        Product product1 = new Product("Laptop", 75000.0);
        Product product2 = new Product("Smartphone", 25000.0);
        Product product3 = new Product("Headphones", 1500.0);
       
        System.out.println("-- Product Details --");
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        Product.displayTotalProducts();
    }
}
