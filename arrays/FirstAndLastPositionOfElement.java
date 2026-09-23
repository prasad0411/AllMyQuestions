import java.util.Arrays;

// RETURN THE STARTING AND ENDING INDICES OF THE TARGET ELEMENT FROM SORTED ARRAY.
// IF THAT ELEMENT IS NOT PRESENT, RETURN -1 -1.

// Input: [5,7,7,8,8,10], target = 8
// Output: [3, 4]

// Input: [5,7,7,8,8,10], target = 6
// Output: [-1, -1]

// Input: [], target = 0
// Output: [-1,-1]

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int originalArray[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println("Original array is: " + Arrays.toString(originalArray));
        System.out.println("Target element is: " + target);
        System.out.println("Optimal approach: Indices are: " + Arrays.toString(optimalApproach(originalArray,
                target)));
    }

    // APPROACH: Use Binary search to find the first and last positions.

    // TC: O(log n) + O(log n) = O(log n).
    // Traverse all the array elements once
    // SC: O(1). No new data structure.
    public static int[] optimalApproach(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastElement = -1;
        int firstElement = -1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                lastElement = last(nums, target, mid);
                firstElement = first(nums, target, mid);
            } else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return new int[] { firstElement, lastElement };
    }

    private static int first(int[] nums, int target, int mid) {
        int ans = mid;
        for (int i = mid - 1; i >= 0; i--) {
            if (nums[i] == target)
                ans = i;
        }
        return ans;
    }

    private static int last(int[] nums, int target, int mid) {
        int ans = mid;
        for (int i = mid + 1; i < nums.length; i++) {
            if (nums[i] == target)
                ans = i;
        }
        return ans;
    }
}
