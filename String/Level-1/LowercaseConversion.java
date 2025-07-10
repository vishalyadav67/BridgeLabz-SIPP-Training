import java.util.Scanner;

public class LowercaseConversion {
    public static String toLowerManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
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

        String manualLower = toLowerManual(text);
        String builtInLower = text.toLowerCase();

        boolean isEqual = compareStrings(manualLower, builtInLower);

        System.out.println("Manual Lower: " + manualLower);
        System.out.println("Built-in Lower: " + builtInLower);
        System.out.println("Are both equal? " + isEqual);
    }
}