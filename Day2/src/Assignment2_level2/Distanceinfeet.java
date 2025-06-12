package Assignment2_level2;
import java.util.*;
public class Distanceinfeet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter distance in feet :- ");
		double distanceinfeett=sc.nextDouble();
		double onemile=1760;//yard
		double oneyard=3;//feet	
		double distanceinyard=(distanceinfeett*oneyard);
		double distanceinmiles=(distanceinfeett*onemile);
		System.out.println("The distance in yards is " + distanceinyard + "while the distance in miles is "
				+ ""  + distanceinmiles);
	}

}
