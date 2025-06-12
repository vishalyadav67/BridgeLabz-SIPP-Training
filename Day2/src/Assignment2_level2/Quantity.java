package Assignment2_level2;
import java.util.Scanner;
public class Quantity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter unit price and quantity to we brought :- ");
		double unitprice=sc.nextDouble();
		double quantity=sc.nextDouble();
		double totalpriceis=(unitprice*quantity);
		System.out.println("The total purchase price is INR" + totalpriceis + "if the quantity is " + quantity + "and unit price is INR " + unitprice);


	}

}
