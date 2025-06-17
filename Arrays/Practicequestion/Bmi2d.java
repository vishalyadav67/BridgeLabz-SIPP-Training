package Practicequestion;
import java.util.*;
public class Bmi2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person #" + (i + 1));

            while (true) {
                System.out.print("Enter height (in meters): ");
                double height = sc.nextDouble();
                if (height > 0) {
                    personData[i][0] = height;
                    break;
                } else {
                    System.out.println("Height must be positive. Try again.");
                }
            }

            while (true) {
                System.out.print("Enter weight (in kg): ");
                double weight = sc.nextDouble();
                if (weight > 0) {
                    personData[i][1] = weight;
                    break;
                } else {
                    System.out.println("Weight must be positive. Try again.");
                }
            }

            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        System.out.println("Height(m)   Weight(kg)   BMI        Status");
        for (int i = 0; i < number; i++) {
            System.out.println(
                String.format("%-11.2f %-12.2f %-10.2f %-15s",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i])
            );
        }

	}

}
