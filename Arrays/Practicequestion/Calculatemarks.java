package Practicequestion;
import java.util.*;
public class Calculatemarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = new int[numStudents][3]; // [Physics, Chemistry, Maths]
        double[] percentage = new double[numStudents];
        char[] grade = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student #" + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + " marks: ");
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks. Enter a value between 0 and 100.");
                    j--; 
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" +
                    marks[i][2] + "\t" + String.format("%.2f", percentage[i]) + "%\t\t" + grade[i]);
        }

	}

}
