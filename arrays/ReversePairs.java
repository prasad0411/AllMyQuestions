import java.util.Arrays;
// LC: 493. Reverse Pairs.
// Problem: Return number of reverse pairs in array.
// Reverse Pair (i, j):
// 0 <= i < j < nums.length and nums[i] > 2 * nums[j] 

// Input: [-1,0,1,2,-1,-4] 
// -1, -1, 0, 1, 2, 4
// Output: [[-1,-1,2],[-1,0,1]]

// Input: [0,0,0]
// Output: [[0,0,0]

// Pattern: Arrays: 2 pointers
public class ReversePairs {
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
