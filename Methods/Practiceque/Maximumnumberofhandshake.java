package Practiceque;
import java.util.*;
public class Maximumnumberofhandshake {
	
	public int handshake(int n) {
		int combination= (n * (n - 1)) / 2 ;
		return combination;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Maximumnumberofhandshake maximumhandshake=new Maximumnumberofhandshake();
		int result=maximumhandshake.handshake(n);
		System.out.println(result);
		
		
		

	}

}
