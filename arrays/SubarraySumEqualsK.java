import java.util.Arrays;

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
        System.out.println("Total number of subarrays are: " + bruteForceApproach(nums, k));
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
