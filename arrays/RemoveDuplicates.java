
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
        int uniqueElements = bruteForceApproach(nums);
        // int uniqueElements = optimalApproach(nums);
        for (int i = 0; i < uniqueElements; i++) {
            System.out.print(nums[i] + " ");
        }
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

    // TC: O(n) Traverse through all elements once and modify the array in place
    // SC: O(1) No new data structure created
    public static int optimalApproach(int[] nums) {
        // BASE CASE: Array being null or empty
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException("Input array is null or has an invalid size.");
        }

        System.out.println("Optimal Approach =>");
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[uniqueIndex] != nums[i]) {
                ++uniqueIndex;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    private static void validateInput(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Input array cannot be null or empty.");
    }
}
