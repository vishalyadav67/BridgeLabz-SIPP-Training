package Assignment2_level2;
import java.util.*;
public class Intoperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number a:-");
		int a=sc.nextInt();
		System.out.println("enter number b:-");
		int b=sc.nextInt();
		System.out.println("enter number c:-");
		int c=sc.nextInt();
		System.out.println("enter number d:-");
		int d=sc.nextInt();
		
		int result1=a + b *c;
		int result2=a * b + c;
		int result3=c + a / b;
		int result4=a % b + c;
		
		System.out.println("the result of result1 is:- " + result1);
		System.out.println("the result of result2 is:- " + result2);
		System.out.println("the result of result3 is:- " + result3);
		System.out.println("the result of result4 is:- " + result4);


	}

}
