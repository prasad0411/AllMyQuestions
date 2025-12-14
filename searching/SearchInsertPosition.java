package searching;

import java.util.Arrays;

// AN ARRAY IS GIVEN. 

// Input: [[1,2,3],[4,5,6],[7,8,9]]  
// Output: [1,2,3,6,9,8,7,4,5]

// Input: [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]
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