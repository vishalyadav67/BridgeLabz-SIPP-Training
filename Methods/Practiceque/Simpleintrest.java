package Practiceque;
import java.util.*;
public class Simpleintrest {
	
	public  double Calculatesimpleintrest(double Principal,double Rate,double Time) {
		return ( Principal * Rate * Time / 100);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double Principle=sc.nextDouble();
		double Rate=sc.nextDouble();
		double Time=sc.nextDouble();
		
		Simpleintrest simpleintrest=new Simpleintrest();
		
		
		double intrest=simpleintrest.Calculatesimpleintrest(Principle, Rate, Time);
		System.out.println(intrest);

	}

}

