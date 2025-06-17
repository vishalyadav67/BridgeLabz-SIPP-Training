package Practicequestion;
import java.util.*;
public class Oddevennumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		
		int number=sc.nextInt();
		if(number<=0) {
			System.out.println(" error enter valid nature number greater than 0");
			return;
		}
		
		int[] odd=new int[number/2+1];
		int[] even=new int[number/2+1];
		
		int evenindex=0;
		int oddindex=0;
		
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				even[evenindex++]=i;
			}else {
				odd[oddindex++]=i;
			}
		}
		
		for(int i=0;i<oddindex;i++) {
			System.out.println("odd number :- "+odd[i]);
		}
		
		System.out.println("");
		
		for(int i=0;i<evenindex;i++) {
			System.out.println("even number:-  "+ even[i]);
		}
				

	}

}
