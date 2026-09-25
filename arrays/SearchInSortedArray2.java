import java.util.Arrays;

// LC: 81. Search in Rotated Sorted Array II
// Problem: Return true if the target element is present in the sorted array which contains duplicates.
// The array is left rotated by K (0 or more) times.
// Constraints: Some elements repeat 
// Return false if the target element does not exist.

// Input: [2,5,6,0,0,1,2], target= 0
// Output: true

// Input: [4,5,6,6,7,0,1,2,4,4], target= 3
// Output: false

// Pattern: Searching in Array: Modified Binary Search

public class SearchInSortedArray2 {
    public static void main(String[] args) {
        int[] modifiedArray = { 2, 2, 2, 3, 2, 2, 2 };
        int target = 3;
        System.out.println("Modified array with K rotations is: " + Arrays.toString(modifiedArray));
        System.out.println("Target element is: " + target);
        // System.out.println("Target element present? Brute Force: " + bruteForceApproach(modifiedArray, target));
        System.out.println("Target element present? Optimal Approach: " + optimalApproach(modifiedArray, target));
    }

    // Approach: Find out which part of the array is sorted. In that, check if
    // the target element can exist. If yes, search in that space, else, check the
    // other half.
    // TC: O(log n). Using Binary Search to find target (avg case)
    // TC: O(n). Linear Traversal (worse case) When there are many duplicates, and
    // we are forced to reduce low and high by 1
    // SC: O(1). No new data structure used
    public static boolean optimalApproach(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return true;
            else if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
        }
        return false;
    }

    // Approach: Traverse entire array to check if the target element exists or no
    // TC: O(n) - Linear search across the entire array
    // SC: O(1) - No new data structure created.
    public static boolean bruteForceApproach(int[] nums, int target) {
        // Edge case: Array is
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }

        for (int num : nums) {
            if (num == target)
                return true;
        }

        return false;
    }
}
