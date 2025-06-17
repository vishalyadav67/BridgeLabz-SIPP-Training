package Practicequestion;
import java.util.*;
public class Bmi {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of persons: ");
	        int n = scanner.nextInt();

	        double[] height = new double[n]; 
	        double[] weight = new double[n]; 
	        double[] bmi = new double[n];
	        String[] status = new String[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nPerson " + (i + 1) + ":");
	            System.out.print("Enter height (in meters): ");
	            height[i] = scanner.nextDouble();

	            System.out.print("Enter weight (in kg): ");
	            weight[i] = scanner.nextDouble();
	        }

	        for (int i = 0; i < n; i++) {
	            bmi[i] = weight[i] / (height[i] * height[i]);

	            if (bmi[i] < 18.5) {
	                status[i] = "Underweight";
	            } else if (bmi[i] >= 18.5 && bmi[i] < 25) {
	                status[i] = "Normal weight";
	            } else if (bmi[i] >= 25 && bmi[i] < 30) {
	                status[i] = "Overweight";
	            } else {
	                status[i] = "Obese";
	            }
	        }

	        System.out.println("\nBMI Report:");
	        for (int i = 0; i < n; i++) {
	        	System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
	        }

	}

}
