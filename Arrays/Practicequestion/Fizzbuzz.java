package Practicequestion;
import java.util.*;
public class Fizzbuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:-");
		int number=sc.nextInt();
		if(number<=0) {
			System.out.println("please enter a positive integer");
			return ;
		}
		String[] result=new String[number+1];
		for(int i=0;i<=number;i++) {
			if(i%3==0 &&  i%5==0 && i!=0) {
				result[i]="FizzBuzz";
			}
			else if(i%3==0 && i!=0) {
				result[i]="Fizz";
			}
			else if(i%5==0 && i!=0) {
				result[i]="Buzz";
			}
			else {
				result[i]=String.valueOf(i);
			}
		}
		for(int i=1;i<=number;i++) {
			System.out.println("Position of   " + i  + " "+ result[i]);
			
			
		}

	}

}
