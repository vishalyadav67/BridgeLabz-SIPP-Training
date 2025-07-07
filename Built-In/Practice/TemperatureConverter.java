
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for F to C, 2 for C to F:");
        int choice = scanner.nextInt();
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("Celsius: " + fToC(temp));
        } else if (choice == 2) {
            System.out.println("Fahrenheit: " + cToF(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
}
