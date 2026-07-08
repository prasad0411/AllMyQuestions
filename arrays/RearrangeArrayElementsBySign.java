import java.util.Arrays;

// LC: 2149. Best time to Buy and Sell stocks.

// Problem: Rearrange array of equal number of even and odd elements.
// Return array such that
// 1) Every consecutive pair of integers have opposite signs
// 2) For all integers with the same sign, the order in which they were present in original arr is preserved.
// 3) The rearranged array begins with a positive integer.

// Input: [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]]

// Input: [-1,1]
// Output: [1,-1]

// Pattern: Arrays: Extrema Tracking 

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] numsArr = new int[] { 3, 1, -2, -5, 2, -4 };
        System.out.println("Original array is: " + Arrays.toString(numsArr));
        System.out.println("Rearranged array using Optimal Approach is: " + Arrays.toString(optimalApproach(numsArr)));
        // System.out.println("Rearranged array is: " +
        // Arrays.toString(betterThanoptimalApproach(numsArr)));
    }

    // APPROACH: Traverse the original array, create a new array, and increment by 2
    // for all positive and negative numbers.

    // TC: O(n)
    // SC: O(n) Creating a new array
    private static int[] optimalApproach(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is null or has invalid size.");
        }

        int posIndex = 0;
        int negIndex = 1;
        int newArr[] = new int[nums.length];

        for (int number : nums) {
            if (number > 0) {
                newArr[posIndex] = number;
                posIndex += 2;
            } else {
                newArr[negIndex] = number;
                negIndex += 2;
            }
        }
        return newArr;
    }
}