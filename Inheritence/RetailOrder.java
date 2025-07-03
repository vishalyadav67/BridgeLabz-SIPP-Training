
class Order {
     String orderId;
     String orderDate;

     Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

     String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

     void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}


class ShippedOrder extends Order {
     String trackingNumber;

     ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    
     String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }

    
     void displayOrderInfo() {
        super.displayOrderInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}


class DeliveredOrder extends ShippedOrder {
     String deliveryDate;

     DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    
    public void displayOrderInfo() {
        super.displayOrderInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
public class RetailOrder {
    public static void main(String[] args) {
        Order order = new Order("O1001", "2025-06-25");
        ShippedOrder shipped = new ShippedOrder("O1002", "2025-06-24", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O1003", "2025-06-23", "TRK67890", "2025-06-26");

        System.out.println("--- Order ---");
        order.displayOrderInfo();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println("--- Shipped Order ---");
        shipped.displayOrderInfo();
        System.out.println("Status: " + shipped.getOrderStatus());

        System.out.println("--- Delivered Order ---");
        delivered.displayOrderInfo();
        System.out.println("Status: " + delivered.getOrderStatus());
    }
}



// CRITICAL REASONING
//1. ASSUMPTION.+> ASSUMPTION IS SOMETHING THAT MUST BE TRUE FOR THE ARGUMENT TO WORK. 1. ASSUMPTION SHOULD BE RELATIVE
//2. ASSUMPTION SHOUND NOT BE AGAINST TO THE ARGUMENT.
//2. INTERFERENCE.
//3. STRONGEN THE ARGUMENT
// 4. WEEKEN THE ARGUMENT
