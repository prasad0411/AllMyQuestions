
import java.util.ArrayList;
import java.util.Arrays;

// LC: 26. Remove Duplicates from Sorted Array

// Problem: Remove duplicate elements from a sorted array, in place.
// Need to return the count of unique elements post the cleaning
// Constraints: Removal of elements must be done in place, and relative order of elements should be preserved. 

// Input: [1, 2, 2, 3]
// Output: 3. New array: 1, 2, 3

// Input: [0, 0, 0]
// Output: 1. New array: 0

// Pattern: Arrays: 2 pointers

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = new int[] { -1, -1, 1, 1, 11 };
        System.out.println("Original array is: " + Arrays.toString(nums));
        optimalApproach(nums);
        System.out.println("Original array after removing duplicates is: " + Arrays.toString(nums));
    }

    // Approach: Create an ArrayList to store all the distinct elements.
    // Copy all these elements back to the original array.

    // TC: O(n) + O(k): Traverse the original array once and then traverse the
    // ArrayList for distinct elements.
    // SC: O(k): Creating an ArrayList for distinct elements.
    public static int bruteForceApproach(int[] nums) {
        validateInput(nums);
        ArrayList<Integer> uniqueElementsList = new ArrayList<>();

        for (int num : nums) {
            if (uniqueElementsList.isEmpty() || uniqueElementsList.get(uniqueElementsList.size() - 1) != num)
                uniqueElementsList.add(num);
        }

        for (int i = 0; i < uniqueElementsList.size(); i++) {
            nums[i] = uniqueElementsList.get(i);
        }

        return uniqueElementsList.size();
    }

    // Approach: Use a fast pointer to traverse the original array
    // Use a slow pointer to traverse the distinct elements and modify original
    // array

    // TC: O(n) Traverse through all the elements of the original array
    // SC: O(1) No new data structure created
    public static int optimalApproach(int[] nums) {
        validateInput(nums);
        int slowP, fastP;
        slowP = fastP = 0;
        for (; fastP < nums.length - 1; fastP++) {
            if (nums[fastP] != nums[fastP + 1]) {
                nums[slowP++] = nums[fastP];
            }
        }

        nums[slowP] = nums[fastP];
        return slowP + 1;
    }

    // Checking if the input array is valid or no
    private static void validateInput(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Input array cannot be null or empty.");
    }
}
