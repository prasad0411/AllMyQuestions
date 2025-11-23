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

public class RearrangeArayElementsBySign {
    public static void main(String[] args) {
        int[] numsArr = new int[] { -1, 1 };
        System.out.println("Original array is: " + Arrays.toString(numsArr));
        System.out.println("Rearranged array is: " + Arrays.toString(bruteForce(numsArr)));
    }

    // APPROACH:
    // Time Complexity: O(n)
    //
    // Space Complexity: O(1)
    // No new data structure
    private static int[] optimalApproach(int[] nums) {
        validate(nums);
        return null;
    }

    // APPROACH:
    // Time Complexity: O(n)
    //
    // Space Complexity: O(1)
    // No new data structure
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
    }

}