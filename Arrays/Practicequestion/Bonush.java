package Practicequestion;
import java.util.*;
public class Bonush {

	public static void main(String[] args) {
		final int NUM_EMPLOYEES = 10;

        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Enter details for Employee #" + (i + 1));

            while (true) {
                System.out.print("Enter salary: ");
                if (scanner.hasNextDouble()) {
                    double salary = scanner.nextDouble();
                    if (salary > 0) {
                        salaries[i] = salary;
                        break;
                    } else {
                        System.out.println("Salary must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); 
                }
            }

            while (true) {
                System.out.print("Enter years of service: ");
                if (scanner.hasNextDouble()) {
                    double years = scanner.nextDouble();
                    if (years >= 0) {
                        yearsOfService[i] = years;
                        break;
                    } else {
                        System.out.println("Years of service must be 0 or more.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); 
                }
            }
        }

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Output
        System.out.println("\n--- Summary Report ---");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
        	System.out.println("Employee #" + (i + 1) +
        		    ": Old Salary = " + String.format("%.2f", salaries[i]) +
        		    ", Bonus = " + String.format("%.2f", bonuses[i]) +
        		    ", New Salary = " + String.format("%.2f", newSalaries[i]));

        }

        System.out.printf("\nTotal Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

	}

}
