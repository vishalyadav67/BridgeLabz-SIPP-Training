package Practicequestion;
import java.util.*;
public class Freaquencycount {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        String number = scanner.nextLine();

	        int[] frequency = new int[10];

	        for (int i = 0; i < number.length(); i++) {
	            char ch = number.charAt(i);

	            if (Character.isDigit(ch)) {
	                int digit = ch - '0';  
	                frequency[digit]++;
	            }
	        }

	        System.out.println("Digit Frequencies:");
	        for (int i = 0; i < 10; i++) {
	            if (frequency[i] > 0) {
	                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
	            }
	        }


	}

}
