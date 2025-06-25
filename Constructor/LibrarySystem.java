class Boooks {
    public String ISBN;
    protected String title;
    private String author;

    Boooks(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        
    }
}

class EBook extends Boooks {
    double fileSizeMB;

    EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    void displayEBookDetails() {
        System.out.println("EBook ISBN   : " + ISBN);
        System.out.println("EBook Title  : " + title);
        System.out.println("File Size    : " + fileSizeMB + " MB");
        System.out.println("Author       : " + getAuthor());
       
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Boooks book1 = new Boooks("978-3-16-148410", "Java Programming", "James Gosling");
        book1.displayBookDetails();

        book1.setAuthor("Joshua Bloch");
        book1.displayBookDetails();

        EBook ebook1 = new EBook("978-0-13-468599", "Effective Java", "Joshua Bloch", 5.5);
        ebook1.displayEBookDetails();
    }
}
