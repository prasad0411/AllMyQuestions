import java.util.Arrays;

// Given an integer array, return an array answer such that answer[i] is the product of
// all elements in nums except nums[i], without using division, and in O(n) time.

// Input: [1, 2, 3, 4];
// Output: [24, 12, 8, 6]

// Input: [1, 2, 0, 4];
// Output: [0, 0, 8, 0]

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int array[] = new int[] { 1, 2, 3, 4 };
        // System.out.print(Arrays.toString(bruteForce(array)));
        System.out.println(Arrays.toString(optimalApproach(array)));
    }

    // TC: O(n) Using 1 loop to traverse all elements.
    // Also calculating and placing the prefix and suffix of current element into
    // result array.
    // SC: O(1) Creation of extra array is not counted in this problem

    public static int[] optimalApproach(int[] inputArray) {
        System.out.print("Optimal Approach => ");
        int size = inputArray.length;
        int[] res = new int[size];

        int prefix = 1;
        for (int i = 0; i < size; i++) {
            res[i] = prefix;
            prefix *= inputArray[i];
        }

        // Input: [1, 2, 3, 4];
        // Output: [24, 12, 8, 6]

        int suffix = 1;
        for (int i = size - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= inputArray[i];
        }
        return res;
    }

    // TC: O(n) Using 2 loops to traverse through all elements of array.
    // Skipping the element that is same in both iterations
    // SC: O(1) Creation of extra array is not counted in this problem

    public static int[] bruteForce(int[] inputArray) {
        System.out.print("Brute force => ");
        int ansArray[] = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            int product = 1;
            for (int j = 0; j < inputArray.length; j++) {
                if (i == j)
                    continue;
                product *= inputArray[j];
            }
            ansArray[i] = product;
        }
        return ansArray;
    }
}