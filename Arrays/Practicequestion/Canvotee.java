package Practicequestion;
import java.util.Scanner;
public class Canvotee {

	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
			int[] ages = new int[10];
			
			System.out.println("Enter the 10 students age: ");
			for(int i=0; i<ages.length; i++) {
				System.out.print("Enter age of student" + (i+1) + ":");
				ages[i] = sc.nextInt();
			}
			System.out.println("\nVoting Eligibility Results:");
	        for (int i = 0; i < ages.length; i++) {
	            int age = ages[i];
	            if (age < 0) {
	                System.out.println("Invalid age entered for student " + (i + 1));
	            } else if (age >= 18) {
	                System.out.println("The student with the age " + age + " can vote.");
	            } else {
	                System.out.println("The student with the age " + age + " cannot vote.");
	            }
	        }

		
		
	}

}
