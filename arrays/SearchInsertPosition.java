
import java.util.Arrays;

// LC: 35. Search Insert Position
// Problem: Given a sorted array, return the index at which the target element is present.
// If it is not present, return the index at which it should exist

// Constraints: Array is sorted

// Input: [1,3,5,6], target = 5
// Output: 2

// Input: [1,3,5,6], target = 2
// Output: 1

// Pattern: Arrays: Modified Binary Search
public class SearchInsertPosition {
    // APPROACH: Use Binary search to make use of sorted array. Keep comparing
    // target element with the middle element. When the loop exists, the
    // leftPointer is the index to insert the target element.

    // TC: O(log (n)).
    // Constanly dividing the array into 2 halves
    // SC: O(1). No new datastructure created.
    public static int optimalApproach(int[] nums, int target) {
        // BASE CASE
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is of invalid size.");
        }

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {
            int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (nums[midPointer] == target)
                return midPointer;
            else if (nums[midPointer] < target) {
                leftPointer = midPointer + 1;
            } else
                rightPointer = midPointer - 1;
        }
        return leftPointer;
    }

    public static void main(String args[]) {
        int[] originalArray = { 1, 3, 5, 6 };
        int target = 4;

        System.out.println("Original array is: " + Arrays.toString(originalArray));
        System.out.println("Insert position is: Optimal approach: " + optimalApproach(originalArray, target));
    }
}