package Practicequestion;
import java.util.*;
public class Factor {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		int maxfactor=10;
		int[] factor=new int[maxfactor];
		int index=0;
		
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				if(index==maxfactor) {
					maxfactor*=2;
					int[] temp=new int[maxfactor];
					for(int j=0;j<index;j++) {
						temp[j]=factor[j];
						
					}
					factor=temp;
				}
				factor[index]=i;
				index++;
			}
		}
		System.out.println(number);
		for(int i=0;i<index;i++) {
			System.out.println(factor[i]);
		}
	}

}
