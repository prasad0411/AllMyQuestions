import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LC: 560. Subarray Sum Equals K
// Problem: We have an array, nums[], and a value K. Return the total number of subarrays whose sum  = k.

// Input: [1,1,1], K = 2  
// Output: 2

// Input:[1,2,3], K = 3
// Output: 2

// Pattern: Arrays: 
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int nums[] = new int[] { 1, 1, 1 };
        int k = 2;
        System.out.print("Original array is : " + Arrays.toString(nums));
        System.out.println(", K = " + k);
        // System.out.println("Total number of subarrays are: Brute Force Approach: " +
        // bruteForceApproach(nums, k));
        System.out.println("Total number of subarrays are: Optimal Approach: " + optimalApproach(nums, k));
    }

    // Approach: While iterating, maintain a running prefix sum. At each step, check
    // the map for (currentSum - k). If found, add its count to the answer,
    // since each occurrence represents a valid subarray ending at the current
    // index. Then record the current prefix sum in the map for future lookups.
    // TC: O(n)
    // SC: O(n)
    private static int optimalApproach(int[] nums, int k) {
        int answer = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
        int totalSum = 0;

        for (int number : nums) {
            totalSum += number;

            int needed = totalSum - k;
            if (prefixSum.containsKey(needed)) {
                answer += prefixSum.get(needed);
            }

            prefixSum.put(totalSum, prefixSum.getOrDefault(totalSum, 0) + 1);
        }
        return answer;
    }

    // Approach: Use 2 pointers from the left, and calculate every subarray range
    // whose sum is equal to K
    // TC: O(n * n)
    // SC: O(1)
    private static int bruteForceApproach(int[] nums, int k) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k)
                    counter++;
            }
        }

        return counter;
    }
}
