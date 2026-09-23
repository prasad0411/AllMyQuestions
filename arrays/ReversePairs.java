import java.util.Arrays;
// LC: 493. Reverse Pairs.
// Problem: Return number of reverse pairs in array.
// Reverse Pair (i, j):
// 0 <= i < j < nums.length and nums[i] > 2 * nums[j] 
// Constraints: Each element in the array is positive

// Input: [1,3,2,3,1] 
// Output: 2

// Input: [2,4,3,5,1]
// Output: 3

// Pattern: Arrays: 
public class ReversePairs {
    // Approach: Use 2 loops for i and j. Increment the counter for every valid
    // iteration.
    // TC: O(N*N)
    // SC: O(1) Not creating any new data structure
    public static int bruteForce(int[] nums) {
        int length = nums.length;
        int counter = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > 2L * nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 4, 3, 5, 1 };
        System.out.println("Original array is: " + Arrays.toString(nums));
        System.out.println("Number of Reverse Pairs are: Brute force: " + bruteForce(nums));
    }
}
