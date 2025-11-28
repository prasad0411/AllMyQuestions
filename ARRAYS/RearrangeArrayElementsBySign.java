// REARRANGE ARRAY OF EVEN SIZE WITH EQUAL NUMBER OF EVEN AND ODD ELEMENTS
// RETURN MODIFIED ARRAY SUCH THAT 
// 1) Every consecutive pair of integers have opposite signs
// 2) For all integers with the same sign, the order in which they were present in original arr is preserved.
// 3) The rearranged array begins with a positive integer.

// Input: [3,1,-2,-5,2,-4];
// Output: [3,-2,1,-5,2,-4]]
// Input: [-1,1];
// Output: [1,-1]

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] numsArr = new int[] { -1, 1 };
        System.out.println("Original array is: " + Arrays.toString(numsArr));
        System.out.println("Rearranged array is: " + Arrays.toString(bruteForce(numsArr)));
        System.out.println("Rearranged array is: " + Arrays.toString(betterThanBruteForce(numsArr)));
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

    // APPROACH: Create a new array for storing just positive integers.
    // Create another array for storing just negative integers.
    // Traverse both arrays and put each element from both arrays into the original
    // array

    // Time Complexity: O(3n) = O(n)
    // Traverse original array once for positive elements, once for negative
    // elements, once from the 2 new arrays to populate the original array

    // Space Complexity: O(n)
    // Creating 2 new arrays of size O(n)
    private static int[] bruteForce(int[] nums) {
        validate(nums);

        int[] posArr = new int[nums.length / 2];
        int[] negArr = new int[nums.length / 2];
        int posIndex = 0, negIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                posArr[posIndex++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                negArr[negIndex++] = nums[i];
        }

        int extraIndex = 0;
        int tempIndex = 0;
        while (tempIndex < posArr.length && tempIndex < negArr.length) {
            nums[extraIndex++] = posArr[tempIndex];
            nums[extraIndex++] = negArr[tempIndex];
            tempIndex++;
        }

        return nums;
    }

    private static void validate(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is null or has invalid size.");
        }

        for (int num : nums) {
            if (num == 0)
                throw new IllegalArgumentException("Input array contains 0, which is incorrect.");
        }
    }
}