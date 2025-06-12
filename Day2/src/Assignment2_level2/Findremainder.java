package Assignment2_level2;
import java.util.*;

public class Findremainder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number which is number1 and number2");
		double number1=sc.nextDouble();
		double number2=sc.nextDouble();
		double quotientis=number1/number2;
		double remainderis=number1%number2;
		System.out.println("The Quotient is " + quotientis + "and Reminder is " + remainderis + "of two number " + number1 + "and " + number2 );

	}

}
