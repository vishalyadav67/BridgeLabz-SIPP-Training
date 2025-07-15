public class QuickSortProductPrices {

    // Function to perform Quick Sort
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Recursively sort the subarrays
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition the array using last element as pivot
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                // swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // swap prices[i+1] and prices[high] (or pivot)
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    // Utility function to print array
    public static void printArray(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] productPrices = {1500, 700, 1200, 2500, 900, 3000, 2000};

        System.out.println("Original Prices:");
        printArray(productPrices);

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Prices (Ascending):");
        printArray(productPrices);
    }
}
