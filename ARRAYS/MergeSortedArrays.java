package arrays;

import java.util.Arrays;

// 2 ARRAYS ARE GIVEN, BOTH ARE IN THE ASCENDING ORDER
// NEED TO RETURN AN ARRAY WHICH HAS ELEMENTS FROM BOTH ARRAYS AND IS SORTED

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]

// Input: nums1 = [7,26,36,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [2,5,6,7,26,36]

public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 4, 5, 6 };
        int m = 3, n = 3;

        System.out.println("Original array 1 is :" + Arrays.toString(nums1) + ", with non zero values: " + m);
        System.out.println("Original array 2 is :" + Arrays.toString(nums2) + ", with non zero values: " + n);

        // System.out.print(Arrays.toString(bruteForceApproach(nums1, m, nums2, n)));
        System.out.print(Arrays.toString(optimalApproach(nums1, m, nums2, n)));
    }

    // APPROACH: Use 2 pointers, one for array 1, another for array 2, and compare
    // each' elements. Based on smaller value, put them in the result array (newly
    // created)

    // Time Complexity: O(m+n).
    // Each element from nums1 and nums2 is processed once
    // Space Complexity: O(m+n).
    // A new array of size (m+n) is created.
    public static int[] bruteForceApproach(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("Brute Force => ");
        if (nums1 == null || nums2 == null)
            throw new IllegalArgumentException("Arrays cannot be null.");

        int newArray[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                newArray[k++] = nums1[i++];
            } else {
                newArray[k++] = nums2[j++];
            }
        }

        while (i < m) {
            newArray[k++] = nums1[i++];
        }
        while (j < n) {
            newArray[k++] = nums2[j++];
        }

        return newArray;
    }

    // Approach: Use the 0 values of array 1 to populate the biggest elements first.
    // and then we populate the smallest elements.
    // TC: O(m+n).
    // Add m+ n elements from nums1 and nums2 to result array
    // SC: O(1). No new data structure used. Modified nums1 in place
    public static int[] optimalApproach(int[] nums1, int m, int[] nums2, int n) {
        System.out.print("Optimal Approach => ");
        int k = nums1.length - 1, i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        return nums1;
    }
}
