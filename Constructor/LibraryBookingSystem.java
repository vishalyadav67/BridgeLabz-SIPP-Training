class Books {
    
    String title;
    String author;
    double price;
    boolean isAvailable;

    
    Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; 
    }

   
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
        }
    }

    
    void displayDetails() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : ₹" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println();
    }
}

public class LibraryBookingSystem {
    public static void main(String[] args) {
        
        Books book1 = new Books("The Invisible Man", "H.G. Wells", 299.0);
        
        System.out.println("--- Book Details ---");
        book1.displayDetails();
        
        book1.borrowBook();
        
        book1.borrowBook();

        System.out.println("--- Updated Book Details ---");
        book1.displayDetails();
    }
}
