class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    // Constructor (initially no ticket is booked)
    MovieTicket() {
        this.isBooked = false;
    }

    // Method to book a ticket
    void bookTicket(String movieName, int seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }

    // Method to display ticket details
    void displayTicketDetails() {
        if (isBooked) {
            System.out.println("\n--- Ticket Details ---");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : " + price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Book a ticket
        ticket.bookTicket("Interstellar", 12, 250.0);

        // Display ticket details
        ticket.displayTicketDetails();
    }
}
