import java.util.Arrays;

// AN ARRAY IS GIVEN
// FOUND COUNT OF MAXIMUM CONSECUTIVE ONES 

// Input: nums1 = [1, 1, 0, 1, 1, 1]
// Output: 3

// Input: nums1 = [1, 0, 1, 1, 0, 1]
// Output: 2

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int inputArray[] = new int[] { 1, 0, 1, 1, 0, 1 };
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        System.out.println("Maximum number of consecutive ones are: " + optimalApproach(inputArray));
    }

    // APPROACH: Use a loop to traverse through all elements, and at each stage,
    // compare the maxCount with currentCount of 1'

    // Time Complexity: O(n). Traverse through all elements once
    // Space Complexity: O(1). No new data structure is created.
    private static int optimalApproach(int[] inputArray) {
        int currentCount = 0, maxCount = 0;
        int targetElement = 1;

        for (int num : inputArray) {
            if (targetElement == num) {
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            } else
                currentCount = 0;
        }
        return maxCount;
    }
}