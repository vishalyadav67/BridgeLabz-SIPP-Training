package Practicequestion;
import java.util.*;
public class Storemultivalueuntilzero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] number=new double[10];
		double total=0.0;
		int index=0;
		while(true) {
			System.out.println("enter the value until 0 or -ve:- ");
			double input=sc.nextDouble();
			if(input<=0) {
				break;
			}
			if(index==10) {
				break;
			}
			number[index]=input;
			index++;
		}
		System.out.println("Stored elements");
		for(int i=0;i<index;i++) {
			System.out.println("number" + (i+1)+number[i]);
			total+=number[i];
			
		}
		System.out.println("sum od all number " + total);
		

	}

}
