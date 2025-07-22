public class SearchFirstNegativeNumber {

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, -4, 6, -1};
        int index = findFirstNegative(numbers);

        if (index != -1) {
            System.out.println( "Negative number found at index " + index);
        } else {
        	System.out.println("no  negative number found in the arrays");
        }
    }
}
