import java.util.Scanner;

public class CharArrayComparison {
    public static char[] customToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] custom = customToCharArray(text);
        char[] builtin = text.toCharArray();
        boolean isEqual = compareCharArrays(custom, builtin);

        System.out.println("Arrays are equal: " + isEqual);
    }
}