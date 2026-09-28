import java.util.Arrays;

// LC: 162. Peak Element
// Problem: Return the index of the peak element from an unsorted array that is strictly greater than the neighbours

// Input: [1,2,3,1]
// Output: 2

// Input: [1,2,1,3,5,6,4]
// Output: 5

// Constraints: If there are many peak elements, you can return any index
// To the left nd right of the array, there is negative infinity.
// There are no duplicates in the array

// Pattern: Arrays: Searching in Array: Modified Binary Search

public class PeakElement {
    // Approach: Binary search on the slope. Check edges first, then move toward the
    // larger neighbor since a peak always lies that way.
    // TC: O(log n). Halving the search space each step
    // SC: O(1). No new data structure used
    public static int optimalApproach(int[] nums) {
        if (nums.length == 1)
            return 0;

        if (nums[0] > nums[1])
            return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;

        int low = 1;
        int high = nums.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[mid] < nums[mid + 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Approach: Iterate over the entire array and check for i, i-1 and i+1
    // TC: O(n). Linear Traversal
    // SC: O(1). No new data structure used
    public static int bruteForce(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is null or empty");
        int length = nums.length;

        if (length == 1)
            return 0;

        int minValue = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            int prev = (i == 0) ? minValue : nums[i - 1];
            int next = (i == nums.length - 1) ? minValue : nums[i + 1];
            if (nums[i] > prev && nums[i] > next)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 4, 3, 2 };
        System.out.println("Original array is: " + Arrays.toString(arr));
        System.out.println("Peak Element is: Brute force" + bruteForce(arr));
        System.out.println("Peak Element is: Optimal approach" + optimalApproach(arr));
    }
}