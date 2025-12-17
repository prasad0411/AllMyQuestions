import java.util.Arrays;

// IN THE METHOD, THE ARRAY HAS ALREADY BEEN ROTATED K TIMES (K IS UNKNOWN).
// NEED TO FIND THE INDEX OF THE TARGET ELEMENT FROM THAT ROTATED ARRAY.
// IF THE TARGET ELEMENT IS NOT PRESENT, RETURN -1

// Input: [4,5,6,7,0,1,2], target= 0
// Output: 4

// Input: [4,5,6,7,0,1,2], target= 3
// Output: -1

// Input: [1], target = 0
// Output: -1

public class SearchInSortedArray1 {
    public static void main(String[] args) {
        int[] modifiedArray = { 5, 1, 3 };
        int target = 3;
        System.out.println("Modified array with K rotations is: " + Arrays.toString(modifiedArray));
        System.out.println("Target element is: " + target);
        System.out.println("Target element is present at index at: " + optimalApproach(modifiedArray, target));
    }

    // APPROACH: Use modified binary search to find target in rotated array.
    // At each step, identify which half is sorted, then check if target element is
    // in that range.
    // If target is in sorted half, search there; otherwise search the other half.

    // TC: O(log n) - Binary search eliminates half the array each iteration
    // SC: O(1). No new data structure.
    public static int optimalApproach(int[] nums, int target) {
        System.out.println("Brute Force =>");

        // EDGE CASE: EXIT IF ARRAY IS NULL OR HAS NO ELEMENTS
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // EDGE CASE: SINCE ARRAY HAS JUST ONE ELEMENT, IT WILL ALWAYS BE AT THE 0TH
        // INDEX AFTER K ROTATIONS
        if (nums.length == 1) {
            return target == nums[0] ? 0 : -1;
        }

        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while (leftPointer <= rightPointer) {
            int midPointer = leftPointer + (rightPointer - leftPointer) / 2;

            // BEST CASE: TARGET ELEMENT IS AT THE MIDDLE INDEX
            if (nums[midPointer] == target)
                return midPointer;

            // CHECK IF LEFT HALF OF ARRAY IS SORTED
            else if (nums[leftPointer] <= nums[midPointer]) {
                if (nums[leftPointer] <= target && target <= nums[midPointer]) {
                    rightPointer = midPointer - 1;
                } else
                    leftPointer = midPointer + 1;
            }

            // CHECK IF RIGHT HALF OF ARRAY IS SORTED
            else {
                if (nums[midPointer] <= target && target <= nums[rightPointer]) {
                    leftPointer = midPointer + 1;
                } else
                    rightPointer = midPointer - 1;
            }
        }

        return -1;
    }
}
