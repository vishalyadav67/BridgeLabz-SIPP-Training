import java.util.Scanner;

public class UppercaseConversion {
    public static String toUpperManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manualUpper = toUpperManual(text);
        String builtInUpper = text.toUpperCase();

        boolean isEqual = compareStrings(manualUpper, builtInUpper);

        System.out.println("Manual Upper: " + manualUpper);
        System.out.println("Built-in Upper: " + builtInUpper);
        System.out.println("Are both equal? " + isEqual);
    }
}