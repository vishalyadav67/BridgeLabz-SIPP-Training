package Assignment2;
import java.util.Scanner;
public class Dist__km {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter km:- ");
		double km=sc.nextDouble();
		double one_miles=1.6;
		double cal_distance=(one_miles*km);
		System.out.println(" The total miles is" + cal_distance + " mile for the given"+km+" km\n"
						+ "");
	}

}
