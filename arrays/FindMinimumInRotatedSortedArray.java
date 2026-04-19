import java.util.Arrays;

// FIND THE SMALLEST NUMBER FROM A ROTATED SORTED ARRAY (ROTATED K TIMES, K UNKNOWN)

// Input: [4,5,6,7,0,1,2]
// Output: 0

// Input: [11,13,15,17]
// Output: 11

// Input: [1]
// Output: 1

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] rotatedArray = { 1, 2, 7 };
        System.out.println("Original sorted array is: " + Arrays.toString(rotatedArray));
        System.out.println("Minimum element from the rotated sorted array is: " + findMin(rotatedArray));
    }

    // APPROACH: Use modified binary search to find smallest element
    // At each step, check if left half [low...mid] is sorted:
    // - If left half is sorted: minimum is nums[low], search the right half
    // - If left half is NOT sorted: rotation detected, save nums[mid] and search
    // left half
    // Keep tracking minimum found and eliminate half the array each iteration.

    // TC: O(log n) - Binary search eliminates half the array each iteration
    // SC: O(1). No new data structure.
    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int lowPointer = 0;
        int highPointer = nums.length - 1;
        int minNumber = Integer.MAX_VALUE;

        while (lowPointer <= highPointer) {
            int middlePointer = lowPointer + (highPointer - lowPointer) / 2;

            // EDGE CASE: If current search space is sorted, return minimum immediately
            if (nums[lowPointer] <= nums[highPointer]) {
                return Math.min(nums[lowPointer], minNumber);
            }

            // If left half is sorted, just get the minimum element from there and check the
            // other unsorted half
            if (nums[lowPointer] <= nums[middlePointer]) {
                minNumber = Integer.min(nums[lowPointer], minNumber);
                lowPointer = middlePointer + 1;
            }

            // If left half is NOT sorted (rotation point detected)
            // nums[middlePointer] could be the minimum, save it and search the left half
            else {
                minNumber = Integer.min(nums[middlePointer], minNumber);
                highPointer = middlePointer - 1;
            }
        }

        return minNumber;
    }
}
