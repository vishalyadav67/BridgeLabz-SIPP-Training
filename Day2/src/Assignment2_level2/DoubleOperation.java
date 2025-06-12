package Assignment2_level2;
import java.util.*;
public class DoubleOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number a:-");
		double a=sc.nextDouble();
		System.out.println("enter number b:-");
		double b=sc.nextDouble();
		System.out.println("enter number c:-");
		double c=sc.nextDouble();
		System.out.println("enter number d:-");
		double d=sc.nextDouble();
		
		double result1=a + b *c;
		double result2=a * b + c;
		double result3=c + a / b;
		double result4=a % b + c;
		
		System.out.println("the result of result1 is:- " + result1);
		System.out.println("the result of result2 is:- " + result2);
		System.out.println("the result of result3 is:- " + result3);
		System.out.println("the result of result4 is:- " + result4);


	}

}
