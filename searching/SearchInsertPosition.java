package searching;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String args[]) {
        int[] originalArray = { 1, 3, 5, 6 };
        int target = 9;
        System.out.println("Original array is: " + Arrays.toString(originalArray));
        System.out.println("Insert position is: " + searchInsert(originalArray, target));
    }

    public static int searchInsert(int[] nums, int target) {
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