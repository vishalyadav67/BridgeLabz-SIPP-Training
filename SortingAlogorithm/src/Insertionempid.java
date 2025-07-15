import java.util.Arrays;
public class Insertionempid {
    public static void insertionSort(int[] EmpId) {
        int n = EmpId.length;
        for (int i = 1; i < n; i++) {
            int key = EmpId[i];
            int j = i - 1;
            while (j >= 0 && EmpId[j] > key) {
                EmpId[j + 1] = EmpId[j];
                j--;
            }
            EmpId[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
