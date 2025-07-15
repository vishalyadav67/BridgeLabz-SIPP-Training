public class CountingSort {

    public static void countingSort(int[] ages) {
        int min = 10;
        int max = 18;
        int range = max - min + 1;

        int[] count = new int[range];       
        int[] output = new int[ages.length]; 

        for (int age : ages) {
            count[age - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - min] - 1] = age;
            count[age - min]--;
        }

        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 12, 14, 17, 10, 13};

        System.out.println("Original Student Ages:");
        printArray(studentAges);

        countingSort(studentAges);

        System.out.println("Sorted Student Ages (Ascending):");
        printArray(studentAges);
    }
}
