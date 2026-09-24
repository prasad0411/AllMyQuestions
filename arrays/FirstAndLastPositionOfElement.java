import java.util.Arrays;

// LC: 34. Find First and Last Position of Element in Sorted Array
// Problem: Return the first and last position of the target element from Sorted array
// Constraints: Array is sorted
// Array might be empty

// Input: [5,7,7,8,8,10], target = 8
// Output: [3, 4]

// Input: [5,7,7,8,8,10], target = 6
// Output: [-1, -1]

// Input: [], target = 0
// Output: [-1,-1]

// Pattern: Arrays: Modified Binary Search
public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int originalArray[] = { 5, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10 };
        int target = 8;
        System.out.println("Original array is: " + Arrays.toString(originalArray));
        System.out.println("Target element is: " + target);
        System.out.println("Optimal approach: Indices are: " + Arrays.toString(optimalApproach(originalArray,
                target)));
    }

    // Approach: Directly find the leftmost and rightmost occurence of the target in
    // array.
    // TC: O(log n) + O(log n) = O(log n).
    // SC: O(1). No new data structure.
    public static int[] optimalApproach(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("Array is null.");
        }
        return new int[] { first(nums, target), last(nums, target) };
    }

    private static int first(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int last(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
