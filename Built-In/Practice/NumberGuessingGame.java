
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int low = 1, high = 100;
        System.out.println("Think of a number between 1 and 100 and I will guess it.");
        boolean correct = false;

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String feedback = scanner.nextLine().toLowerCase();
            if (feedback.equals("correct")) {
                correct = true;
                System.out.println("Yay! I guessed your number.");
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }
}
