import java.util.Arrays;

// LC: 33. Search in Rotated Sorted Array I
// Problem: Find the index at which the target element is present in the sorted array.
// The array might be left rotated by K times.
// Constraints: All elements are unique
// Return -1 if target element does not exist.

// Input: [4,5,6,7,0,1,2], target= 0
// Output: 4

// Input: [4,5,6,7,0,1,2], target= 3
// Output: -1

// Input: [1], target = 0
// Output: -1

// Pattern: Searching in Array: Modified Binary Search

public class SearchInSortedArray1 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println("Original array is: " + Arrays.toString(arr));
        System.out.println("Target element is: " + target);
        System.out.println("Target element is present at index at: " + optimalApproach(arr, target));
    }

    // Approach: Find out which part of the array is sorted. In that, check if
    // the target element can exist. If yes, search in that space, else, check the
    // other half.
    // TC: O(log n). Using Binary Search to find target
    // SC: O(1). No new data structure.
    public static int optimalApproach(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
