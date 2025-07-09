class Book {
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }
}

public class LibraryManagementSystem {
    Book head = null, tail = null;

    void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        Book b = new Book(title, author, genre, id, available);
        if (head == null) head = tail = b;
        else {
            b.next = head;
            head.prev = b;
            head = b;
        }
    }

    void addAtEnd(String title, String author, String genre, int id, boolean available) {
        Book b = new Book(title, author, genre, id, available);
        if (tail == null) head = tail = b;
        else {
            tail.next = b;
            b.prev = tail;
            tail = b;
        }
    }

    void addAtPosition(int pos, String title, String author, String genre, int id, boolean available) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }
        Book temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        if (temp == tail) {
            addAtEnd(title, author, genre, id, available);
        } else {
            Book b = new Book(title, author, genre, id, available);
            b.next = temp.next;
            b.prev = temp;
            temp.next.prev = b;
            temp.next = b;
        }
    }

    void removeById(int id) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head && temp == tail) head = tail = null;
                else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    void searchByTitle(String title) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No book found with title: " + title);
    }

    void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No book found by author: " + author);
    }

    void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            print(temp);
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void print(Book b) {
        System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author +
                ", Genre: " + b.genre + ", Available: " + (b.isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();

       
        lib.addAtEnd("The Hobbit", "J.R.R. Tolkien", "Fantasy", 101, true);
        lib.addAtBeginning("1984", "George Orwell", "Dystopian", 102, true);
        lib.addAtPosition(2, "Clean Code", "Robert C. Martin", "Programming", 103, false);
        lib.addAtEnd("To Kill a Mockingbird", "Harper Lee", "Classic", 104, true);

        
        System.out.println("\nBooks (Forward):");
        lib.displayForward();

        System.out.println("\nBooks (Reverse):");
        lib.displayReverse();

        System.out.println("\nSearch by Title '1984':");
        lib.searchByTitle("1984");

        System.out.println("\nSearch by Author 'Robert C. Martin':");
        lib.searchByAuthor("Robert C. Martin");

        System.out.println("\nUpdate availability of Book ID 103 to true");
        lib.updateAvailability(103, true);
        lib.displayForward();

        System.out.println("\nTotal number of books: " + lib.countBooks());

        System.out.println("\nRemove book with ID 102");
        lib.removeById(102);
        lib.displayForward();
    }
}
