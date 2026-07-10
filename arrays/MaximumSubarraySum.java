
import java.util.Arrays;
// LC: 53. Maximum Subarray
// Problem: An unsorted array is given, find the largest sum and print the subarray

// Input: [-2,1,-3,4,-1,2,1,-5,4]  
// Output: 6, Explaination: 4,-1,2,1 is the subarray

// Input:[1]
// Output: 1, Explaination: 1 is the only subarray possible

// Pattern: Arrays: Kadane' Algorithm

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Original array is: " + Arrays.toString(nums));
        // System.out.println("Brute Force approach: Sum of maximum Subarray is: " +
        // bruteForce(nums));
        System.out.println("Optimal approach: Sum of maximum Subarray is: " + optimalApproach(nums));
    }

    // Approach: Use Kadane' Algorithm. Traverse the whole array and check if
    // current is positive or should we start from the current number
    // TC: O(n)
    // SC: O(1)
    public static int optimalApproach(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Integer.max(maxSum, currentSum);
        }
        return maxSum;
    }

    // Approach: Use 2 loops and traverse the array, and compute every subarray
    // combination that can yeild maximum sum
    // TC: O(n*n)
    // SC: O(1)
    public static int bruteForce(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}