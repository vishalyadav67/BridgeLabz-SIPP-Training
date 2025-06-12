package Assignment2;
import java.util.Scanner;

public class Fees_distence_cal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fees=sc.nextInt();
		int disscount=sc.nextInt();
		int discount_fees=fees*disscount/100;
		int feespayeble=fees-discount_fees;
		System.out.println(feespayeble);
	}
	

}
