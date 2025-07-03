import java.util.ArrayList;
import java.util.List;

class Books{
	String Tittle;
	String Author;

	Books(String Tittle, String Author){
		this.Tittle = Tittle;
		this.Author = Author;
	}
	void display() {
		System.out.println("Tittle: " + Tittle + "Author: " +Author);
	} 
}
	
	class Library{
		String name;
		List<Books> books;
		
		Library(String name){
			this.name = name;
			this.books = new ArrayList<>();
		}
		void addBook(Books book) {
			books.add(book);
		}
		public void displayLibrary() {
	        System.out.println("\nLibrary: " + name);
	        for (Books book : books) {
	            book.display();
	        }
	    }
		
	}

public class LibraryAndBooks {

	public static void main(String[] args) {
		
		Books book1 = new Books("Kindness ", "Todd parr");
		Books book2 = new Books("Jungle Book ", " Rudyard Kipling");
		Books book3 = new Books("Harry Potter ", " J.K. Rowling");
		
		Library SchoolLibrary = new Library("School Library");
		Library CollegeLibrary = new Library("College Library");
		
		SchoolLibrary.addBook(book3);
		SchoolLibrary.addBook(book2);
		
		CollegeLibrary.addBook(book1);
		CollegeLibrary.addBook(book3);
		
		CollegeLibrary.displayLibrary();
		SchoolLibrary.displayLibrary();
	}

}
