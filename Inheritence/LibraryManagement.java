
class Book {
     String title;
     int publicationYear;

     Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

     void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Published Year: " + publicationYear);
    }
}


class Author extends Book {
     String authorName;
     String bio;

     Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    @Override
     void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Author book1 = new Author("Harry potter", 1980, "J.K. rowing", "all about the magic: ");
        book1.displayInfo();
    }
}
