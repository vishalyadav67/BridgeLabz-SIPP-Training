package Practiceque;
import java.util.*;
public class Factorofnumber {
	
	 public static int[] getFactors(int number) {
	        int count = 0;

	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                count++;
	            }
	        }

	        int[] factors = new int[count];
	        int index = 0;

	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                factors[index++] = i;
	            }
	        }

	        return factors;
	    }

	    public static int sumOfFactors(int[] factors) {
	        int sum = 0;
	        for (int factor : factors) {
	            sum += factor;
	        }
	        return sum;
	    }

	    public static long productOfFactors(int[] factors) {
	        long product = 1;
	        for (int factor : factors) {
	            product *= factor;
	        }
	        return product;
	    }

	    public static int sumOfSquares(int[] factors) {
	        int sum = 0;
	        for (int factor : factors) {
	            sum += Math.pow(factor, 2); 
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int[] factors = getFactors(number);

	        System.out.print("Factors: ");
	        for (int factor : factors) {
	            System.out.print(factor + " ");
	        }
	        System.out.println();

	        int sum = sumOfFactors(factors);
	        int sumSq = sumOfSquares(factors);
	        long product = productOfFactors(factors);

	        System.out.println("Sum of factors: " + sum);
	        System.out.println("Sum of squares of factors: " + sumSq);
	        System.out.println("Product of factors: " + product);

	        scanner.close();
	
	}

}
