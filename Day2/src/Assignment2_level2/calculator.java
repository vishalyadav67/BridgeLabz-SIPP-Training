package Assignment2_level2;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float number1=sc.nextFloat();
		float number2=sc.nextFloat();
		float add=number1+number2;
		float sub=number1-number2;
		float mul=number1*number2;
		float division=number1/number2;
		System.out.println("sum of two no is:- " + add + "subctraction" + sub + "multiplication" + mul + "division of two numbers is:- " + division );
	}

}
