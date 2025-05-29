package ARRAYS;

public class MaximumSubarraySum {

    // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    // Output: 6
    // Explanation: The subarray [4,-1,2,1] has the largest sum 6

    public static void main(String[] args) {
        int[] nums = new int[] { -2, -1 };

        if (nums.length == 0 || nums == null) {
            System.out.println("Invalid array");
            return;
        }

        if (nums.length == 1) {
            System.out.println("Sum of maximum Subarray is: " + nums[0]);
            return;
        }

        System.out.println("Sum of maximum Subarray is: " + optimalApproach(nums));
    }

    // TC: O(n*n) Using 2 loops to traverse through all elements of array one by one
    // Maintaing currentSum as 0 for every new iteration
    // SC: O(1) Not using any new data structure

    public static int bruteForce(int[] nums) {
        int maximumSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length;) {
                currentSum += nums[j++];
                maximumSum = Math.max(maximumSum, currentSum);
            }
        }
        return maximumSum;
    }

    // TC: O(n) Using 1 loop to traverse through all elements of array one by one
    // Maintaing currentSum as 0 for every new iteration
    // SC: O(1) Not using any new data structure

    // Input: nums = [1,2]

    public static int optimalApproach(int[] nums) {
        int maximumSum = nums[0], currentSum = 0;

        for (int i = 0; i < nums.length;) {
            currentSum += nums[i++];
            maximumSum = Math.max(maximumSum, currentSum);

            if (currentSum < 0)
                currentSum = 0;
        }
        return maximumSum;
    }
}
