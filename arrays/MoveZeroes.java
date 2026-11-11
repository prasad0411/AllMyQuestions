// LC: 283. Move Zeroes
// Problem: Move all zeroes to the end of the array while maintaining the
// relative order of non zero elements

// Constraints: Do it in-place
// There will be atleast 1 element present in the array

// Input: strs = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Input: strs = [0]
// Output: [0]

// Pattern: Arrays:

import java.util.Arrays;

public class MoveZeroes {

    // Approach: Put all non zero elements
    // TC: O(n). Traversing the whole array.
    // SC: O(1). No new data structure is created.
    public static void moveZeroes(int[] nums) {
        int nonZeroIndice = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[nonZeroIndice++] = nums[i];
        }

        for (int i = nonZeroIndice; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        System.out.println("Original array is: " + Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("Modified array is: " + Arrays.toString(arr));
    }
}
