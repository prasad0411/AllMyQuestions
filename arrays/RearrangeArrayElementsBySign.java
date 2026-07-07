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
        System.out.println("Rearranged array is: " + Arrays.toString(bruteForce(numsArr)));
        // System.out.println("Rearranged array is: " +
        // Arrays.toString(betterThanBruteForce(numsArr)));
    }

    // APPROACH: Create a new array for storing the result array
    // Traverse original array once and based on +/- element, place it at +2 index
    // each time in result array

    // Time Complexity: O(n)
    // Traverse original array once for positive elements and negative elements
    // Create a new array as original size

    // Space Complexity: O(n)
    // Creating a new array O(n)
    private static int[] betterThanBruteForce(int[] nums) {
        validate(nums);

        int[] resultArr = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                resultArr[posIndex] = nums[i];
                posIndex = posIndex + 2;
            } else if (nums[i] < 0) {
                resultArr[negIndex] = nums[i];
                negIndex = negIndex + 2;
            }
        }

        return resultArr;
    }

    // APPROACH: Traverse the original array, create a new array, and increment by 2
    // for all positive and negative numbers.

    // TC: O(n)
    // SC: O(n) Creating a new array
    private static int[] bruteForce(int[] nums) {
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