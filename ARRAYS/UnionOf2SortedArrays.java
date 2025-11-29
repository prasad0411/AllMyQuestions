import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 2 SORTED ARRAYS ARE GIVEN, NEED TO RETURN THEIR UNION

// Input: nums1 = [1,2,3,4,5], m =5, nums2 = [1,2,3,4,5], n = 5
// Output: [1,2,3,4,5]

// Input: nums1 = [1,2,3,4,5,6,7,8,9,10], m = 10, nums2 = [2,3,4,4,5,11,12], n = 7
// Output: [1,2,3,4,5,6,7,8,9,10,11,12]

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 2, 3, 4 };
        int arr2[] = new int[] { 0, 1, 2, 3, 4, 5 };

        System.out.println("Original array 1 is: " + Arrays.toString(arr1));
        System.out.println("Original array 2 is: " + Arrays.toString(arr2));
        System.out.println("Union of the 2 arrays is: ");

        // Set<Integer> result = bruteForce(arr1, arr2);
        // int[] resultArr = new int[result.size()];
        // int i = 0;

        // for (int num : result) {
        // resultArr[i++] = num;
        // }

        // System.out.println(Arrays.toString(resultArr));
        System.out.println(Arrays.toString(optimalApproach(arr1, arr2)));
    }

    // APPROACH: Use a HashSet to dump all elements into that, and then convert it
    // to result array

    // Time Complexity: O(m+n).
    // Traversing array 1 and array 2, with m and n elements respectively
    // Space Complexity: O(m+n).
    // A new HashSet of size (m+n) is created.
    @SuppressWarnings("unused")
    private static Set<Integer> bruteForce(int[] arr1, int[] arr2) {
        // BASE CASE: Arrays are null
        if (arr1 == null || arr2 == null)
            throw new IllegalArgumentException("Either of the arrays is null.");

        System.out.println("Brute Force: =>");

        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr1)
            uniqueSet.add(num);

        for (int num : arr2)
            uniqueSet.add(num);

        return uniqueSet;
    }

    // APPROACH: As we have sorted arrays, we use 2 pointers directly place them
    // into result array

    // Time Complexity: O(m+n).
    // Traversing array 1 and array 2, with m and n elements respectively
    // Space Complexity: O(1).
    // No new data structure is created, apart from space for output array.
    private static int[] optimalApproach(int[] arr1, int[] arr2) {
        // BASE CASE: Arrays are null
        if (arr1 == null || arr2 == null)
            throw new IllegalArgumentException("Either of the arrays is null.");

        System.out.println("Optimal Approach : =>");

        int[] resultArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, uniqueIndex = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                // Unique index ==0 ensures first element is always inserted (no previous
                // element to compare)
                // resultArr[uniqueIndex - 1] != arr1[i] prevents duplicate by comparing with
                // last inserted element
                if (uniqueIndex == 0 || resultArr[uniqueIndex - 1] != arr1[i]) {
                    resultArr[uniqueIndex++] = arr1[i];
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (uniqueIndex == 0 || resultArr[uniqueIndex - 1] != arr2[j]) {
                    resultArr[uniqueIndex++] = arr2[j];
                }
                j++;
            } else {
                if (uniqueIndex == 0 || resultArr[uniqueIndex - 1] != arr2[j]) {
                    resultArr[uniqueIndex++] = arr2[j];
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (uniqueIndex == 0 || resultArr[uniqueIndex - 1] != arr1[i]) {
                resultArr[uniqueIndex++] = arr1[i];
            }
            i++;
        }

        while (j < arr2.length) {
            if (uniqueIndex == 0 || resultArr[uniqueIndex - 1] != arr2[j]) {
                resultArr[uniqueIndex++] = arr2[j];
            }
            j++;
        }

        // This returns the size of the popuated array only
        return Arrays.copyOf(resultArr, uniqueIndex);
    }
}