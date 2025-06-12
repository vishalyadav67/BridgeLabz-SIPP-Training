package Assignment2;
import java.util.Scanner;

public class measure_height {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double onefoot=12;
		double oneinch=2.54;
		double height=sc.nextDouble();
		double heig_to_feet=height*onefoot;
		double heig_to_inches=height*oneinch;
		System.out.println("Your Height in cm is" + height + "while in feet is" + heig_to_feet + "and inches is" + heig_to_inches); 


	}

}
