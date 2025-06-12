package Assignment2_level2;
import java.util.*;
public class Areaoftriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = scanner.nextDouble();

        double areaInSqCm = 0.5 * baseCm * heightCm;
        double areaInSqIn = areaInSqCm / (2.54 * 2.54); // 1 inch = 2.54 cm

        System.out.println("The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm);

	}

}
