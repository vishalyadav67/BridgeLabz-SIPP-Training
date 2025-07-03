interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean reserved = false;
    private String borrower; 

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (reserved) {
            System.out.println("Reserved by: " + borrower);
        } else {
            System.out.println("Status: Available");
        }
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
        this.reserved = true;
    }

    public abstract int getLoanDuration(); 
}


class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 21; 
    }

    public void reserveItem(String borrowerName) {
        setBorrower(borrowerName);
        System.out.println("Book reserved successfully by " + borrowerName);
    }

    public boolean checkAvailability() {
        return true;
    }
}


class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7; 
    }

    public void reserveItem(String borrowerName) {
        setBorrower(borrowerName);
        System.out.println("Magazine reserved successfully by " + borrowerName);
    }

    public boolean checkAvailability() {
        return true;
    }
}


class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5; 
    }

    public void reserveItem(String borrowerName) {
        setBorrower(borrowerName);
        System.out.println("DVD reserved successfully by " + borrowerName);
    }

    public boolean checkAvailability() {
        return true;
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "The Alchemist", "Paulo Coelho");
        LibraryItem item2 = new Magazine("M202", "National Geographic", "NatGeo Team");
        LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            System.out.println("--- Library Item ---");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                r.reserveItem("Student1");
                System.out.println("Available? " + r.checkAvailability());
            }
        }
    }
}
