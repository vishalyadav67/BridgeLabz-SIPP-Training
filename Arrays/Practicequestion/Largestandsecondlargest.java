package Practicequestion;
import java.util.*;
public class Largestandsecondlargest {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a positive number: ");
	        int number = sc.nextInt();

	        int maxDigit = 10;
	        int[] digits = new int[maxDigit];
	        int index = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            digits[index] = digit;
	            index++;
	            number /= 10;

	            if (index == maxDigit) {
	                maxDigit += 10;
	                int[] temp = new int[maxDigit];
	                for (int i = 0; i < digits.length; i++) {
	                    temp[i] = digits[i];
	                }
	                digits = temp;
	            }
	        }

	        int largest = -1, secondLargest = -1;
	        for (int i = 0; i < index; i++) {
	            int d = digits[i];
	            if (d > largest) {
	                secondLargest = largest;
	                largest = d;
	            } else if (d > secondLargest && d != largest) {
	                secondLargest = d;
	            }
	        }

	        System.out.println("\nDigits in the number:");
	        for (int i = 0; i < index; i++) {
	            System.out.print(digits[i] + " ");
	        }

	        System.out.println("\nLargest digit: " + largest);
	        System.out.println("Second largest digit: " + (secondLargest != -1 ? secondLargest : "Not found"));

	}

}
