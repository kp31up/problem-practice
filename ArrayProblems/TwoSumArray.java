package ArrayProblems;

import java.util.*;

// Find the first pair that is having sum equal to a given target value from the array.
public class TwoSumArray {

    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int complement;
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            complement = target - arr[i];

            if (map.containsKey(complement)) {
                ans[0] = map.get(complement);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }
}
