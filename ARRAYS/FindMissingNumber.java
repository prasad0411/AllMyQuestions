import java.util.Arrays;

// FROM THE GIVEN SET OF DISTINCT NUMBERS IN AN UNSORTED ARRAY, FIND THE MISSING NUMBER

// Input: [3,0,1]
// Output: 2

// Input: [0,1]
// Output: 2

// Input: [9,6,4,2,3,5,7,0,1]
// Output: 8

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = { 3, 0, 1 };
        System.out.println("Original array is: " + Arrays.toString(array));
        System.out.println("Missing number is: " + missingNumber(array));
    }

    // APPROACH: Use the maths formula to calculate the sum of a sequence from 1-N
    // (N* (N + 1) )/2
    // Subtract the actual sum of all elements from the expected sum
    
    // TC: O(n) - Linearly traverse the array and every element
    // SC: O(1) - No new data structure
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int totalSum = (len * (len + 1)) / 2;
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }
}
