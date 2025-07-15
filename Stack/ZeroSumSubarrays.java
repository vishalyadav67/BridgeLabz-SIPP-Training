import java.util.*;

public class ZeroSumSubarrays {

    public static void findSubarraysWithZeroSum(int[] arr) {
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        int sum = 0;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);  

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                List<Integer> startIndices = map.get(sum);
                for (int start : startIndices) {
                    result.add(new int[]{start + 1, i});
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        
        System.out.println("Subarrays with zero sum:");
        for (int[] range : result) {
            System.out.println("(" + range[0] + ", " + range[1] + ")");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, -4, -2, -2};
        findSubarraysWithZeroSum(arr);
    }
}
