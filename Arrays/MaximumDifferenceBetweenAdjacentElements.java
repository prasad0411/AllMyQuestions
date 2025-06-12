package ARRAYS;

// COMPUTE THE MAX ABS DIFFERENCE BETWEEN NEIGHBOURING ELEMENTS IN A CIRCULAR ARRAY

// Input: nums = [-5,-10,-5]
// Output: 5

// Input: nums = [1,2,4]
// Output: 3

public class MaximumDifferenceBetweenAdjacentElements {
    public static void main(String[] args) {
        int nums[] = new int[] { -5, -10, -5 };
        if (nums == null || nums.length < 2) {
            System.out.println("Invalid input array");
            return;
        }

        System.out.println("Maximum difference between adjacent elements is: " + maxAdjacentDistance(nums));
    }

    // TC: O(n) Traverse the array once
    // SC: O(1) No new data structure

    public static int maxAdjacentDistance(int[] nums) {
        int maxDiff = Math.abs(nums[0] - nums[nums.length - 1]); // circular difference

        for (int i = 0; i < nums.length - 1; i++) // n-2 because we are doing i+1
            maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[i + 1]));
        return maxDiff;
    }
}