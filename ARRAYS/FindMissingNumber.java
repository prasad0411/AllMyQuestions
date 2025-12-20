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

    // APPROACH: Traverse both the strings simultaneously, and put current character
    // of string 2 for string 1, and do the vice versa.
    // Do this till all characters of a string have been processed

    // TC: O(n) - Linear search across both the strings of same length
    // SC: O(n) - Creating 2 hash maps to store the characters mapping.
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
