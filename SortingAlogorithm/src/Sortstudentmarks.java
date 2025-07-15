import java.util.Arrays;

public class Sortstudentmarks {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {78, 45, 92, 60, 88, 53};

        System.out.println( Arrays.toString(studentMarks));

        bubbleSort(studentMarks);

        System.out.println(Arrays.toString(studentMarks));
    }
}
