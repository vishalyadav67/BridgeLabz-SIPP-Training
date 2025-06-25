package Practiceque;
import java.util.*;
public class Sumofnaturenumber {
	
	public int sumofnumber(int n) {
		int sum=0
;		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 
		if(n>0) {
			Sumofnaturenumber obj=new Sumofnaturenumber();
			obj.sumofnumber(n);
			int result=obj.sumofnumber(n);
			
			System.out.println("sum of forst nature  "   + n  + "nature number is" + result);
		}else {
			System.out.println("enter valid number");
		}
		sc.close();
		

	}

}
