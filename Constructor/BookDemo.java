class Book{
	String title;
	String author;
	double price;
	
	Book(){
		title = "marvels";
		author = "Stan lee";
		price = 500.0;
	}
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayDetails() {
		System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
        System.out.println();
	}
}
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book defaultConstructor = new Book();
		System.out.println("--default--");
		defaultConstructor.displayDetails();
		
		Book paramConstructor = new Book("The Alchemist", "Paulo Coelho", 399.00);
        System.out.println("--parameterized--");
        paramConstructor.displayDetails();

	}

}
