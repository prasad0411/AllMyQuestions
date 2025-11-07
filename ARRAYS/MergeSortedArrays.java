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
        int[] nums2 = new int[] { 2, 5, 6 };
        int m = 3, n = 3;

        // int ansArray[] = bruteForceApproach(nums1, m, nums2, n);
        // System.out.print(Arrays.toString(ansArray));

        // betterThanBruteForceApproach(nums1, m, nums2, n);
        optimalApproach(nums1, m, nums2, n);
        System.out.print(Arrays.toString(nums1));
    }

    // Time Complexity: O(m+n).
    // Each element from nums1 and nums2 is processed once
    // Space Complexity: O(m+n).
    // A new array of size (m+n) is created.
    public static int[] bruteForceApproach(int[] nums1, int m, int[] nums2, int n) {
        System.out.print("Brute force approach => ");
        int i = 0, j = 0, k = 0;
        int ansArray[] = new int[nums1.length];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                ansArray[k++] = nums1[i++];
            else
                ansArray[k++] = nums2[j++];
        }
        while (i < m) {
            ansArray[k++] = nums1[i++];
        }
        while (j < n) {
            ansArray[k++] = nums2[j++];
        }
        return ansArray;
    }

    // TC: O((m+n) log(m+n)).
    // Add n elements from nums2 to nums1: O(n). Sort nums1: O(m+n log m+n)
    // SC: O(1). No extra space for any data structure.
    // Modified nums1 in place. So need not return that as well
    public static void betterThanBruteForceApproach(int[] nums1, int m, int[] nums2, int n) {
        System.out.print("Better than brute force approach => ");

        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }

    // TC: O(m+n).
    // Add m+ n elements from nums1 and nums2 to result array
    // SC: O(1). No new data structure used. Modified nums1 in place
    public static void optimalApproach(int[] nums1, int m, int[] nums2, int n) {
        System.out.print("Optimal Approach => ");

        int i = m - 1;
        int j = n - 1;
        int newIndexes = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j])
                nums1[newIndexes--] = nums1[i--];
            else
                nums1[newIndexes--] = nums2[j--];
        }
        while (j >= 0)
            nums1[newIndexes--] = nums2[j--];

    }
}
