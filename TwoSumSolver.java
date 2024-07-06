import java.util.HashMap;
import java.util.Map;

public class TwoSumSolver {

    public static int[] TwoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (indexMap.containsKey(x)) {
                return new int[]{indexMap.get(x), i};
            }
            indexMap.put(nums[i], i);
        }
        return new int[]{}; // in case no result is found
    }

    public static void main(String[] args) {
        // Test case 1
        int[] array1 = {1, 5, 2, 7};
        int target1 = 8;
        int[] result1 = TwoSum(array1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        // Test case 2
        int[] array2 = {20, 1, 5, 2, 11};
        int target2 = 3;
        int[] result2 = TwoSum(array2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        // Test case 3
        int[] array3 = {3, 2, 4};
        int target3 = 6;
        int[] result3 = TwoSum(array3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
} // time complexity of code is O(n)
