package searching;

import java.util.Arrays;

// FIND THE INDEX OF THE TARGET ELEMENT FROM THE SORTED ARRAY.
// IF THAT ELEMENT IS NOT PRESENT, RETURN THE INDEX WHERE IT WOULD BE PLACED IN THE ARRAY.

// Input: [1,3,5,6], 5
// Output: 2

// Input: [1,3,5,6], 2
// Output: 1

// Input: [1,3,5,6], 7
// Output: 4

public class SearchInsertPosition {
    public static void main(String args[]) {
        int[] originalArray = { 1, 3, 5, 6 };
        int target = 4;

        System.out.println("Original array is: " + Arrays.toString(originalArray));
        System.out.println("Insert position is: " + optimalApproach(originalArray, target));
    }

    // APPROACH: Use Binary search to make use of sorted array. Keep comparing
    // target element with the middle element. When the loop exists, the
    // leftPointer is the index to insert the target element.

    // TC: O(log (n)).
    // Constanly dividing the array into 2 halves
    // SC: O(1). No new datastructure created.
    public static int optimalApproach(int[] nums, int target) {
        System.out.println("Optimal Approach => ");

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
}