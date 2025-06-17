package Practicequestion;
import java.util.*;
public class Youngestfriend {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        String[] names = {"Amar", "Akbar", "Anthony"};
	        int[] ages = new int[3];
	        double[] heights = new double[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.print("Enter age of " + names[i] + ": ");
	            ages[i] = sc.nextInt();

	            System.out.print("Enter height of " + names[i] + " (in cm): ");
	            heights[i] = sc.nextDouble();
	        }

	        int youngestIndex = 0;
	        int tallestIndex = 0;

	        for (int i = 1; i < 3; i++) {
	            if (ages[i] < ages[youngestIndex]) {
	                youngestIndex = i;
	            }
	            if (heights[i] > heights[tallestIndex]) {
	                tallestIndex = i;
	            }
	        }

	        System.out.println("\n--- Result ---");
	        System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
	        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
		

	}

}
