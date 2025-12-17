import java.util.Arrays;

// IN THE METHOD, THE ARRAY HAS ALREADY BEEN ROTATED K TIMES (K IS UNKNOWN).
// DUPLICATES EXIST
// NEED TO FIND THE INDEX OF THE TARGET ELEMENT FROM THAT ROTATED ARRAY.
// IF THE TARGET ELEMENT IS NOT PRESENT, RETURN -1

// Input: [4,5,6,7,0,1,2], target= 0
// Output: true

// Input: [4,5,6,7,0,1,2], target= 3
// Output: false

// Input: [1], target = 0
// Output: false

public class SearchInSortedArray2 {
    public static void main(String[] args) {
        int[] modifiedArray = { 1, 5, 1, 1, 31, 1, 5 };
        int target = 1;
        System.out.println("Modified array with K rotations is: " + Arrays.toString(modifiedArray));
        System.out.println("Target element is: " + target);
        System.out.println("Target element is present at index at: " + bruteForceApproach(modifiedArray, target));
    }

    // APPROACH: Traverse entire array to check if the element exists or no

    // TC: O(n) - Linear search across the entire array
    // SC: O(1). No new data structure.
    public static boolean bruteForceApproach(int[] nums, int target) {
        System.out.println("Brute Force Approach =>");

        // EDGE CASE: EXIT IF ARRAY IS NULL OR HAS NO ELEMENTS
        if (nums == null || nums.length == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return true;
        }

        return false;
    }
}
