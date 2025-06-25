class HotelBooking {
    
    String guestName;
    String roomType;
    int nights;

  
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

 
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

   
    HotelBooking(HotelBooking original) {
        this.guestName = original.guestName;
        this.roomType = original.roomType;
        this.nights = original.nights;
    }

    
    void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
        System.out.println();
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayBooking();

        
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        booking2.displayBooking();

        
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copied Booking (from Alice's):");
        booking3.displayBooking();
    }
}
