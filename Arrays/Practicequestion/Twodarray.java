package Practicequestion;
import java.util.*;
public class Twodarray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = scanner.nextInt();

	        int[][] matrix = new int[rows][cols];

	        System.out.println("Enter elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element at (" + i + "," + j + "): ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        int[] array = new int[rows * cols];

	        int index = 0;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                array[index] = matrix[i][j];
	                index++;
	            }
	        }

	        System.out.println("Elements in the 1D array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }

	}

}
