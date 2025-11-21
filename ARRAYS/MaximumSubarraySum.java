
import java.util.Arrays;

// AN UNSORTED ARRAY IS GIVEN, FIND THE LARGEST SUM AND PRINT THE SUBARRAY 
// Input: [-2,1,-3,4,-1,2,1,-5,4]  
// Output: 6, Explaination: 4,-1,2,1 is the subarray
// Input:[1]
// Output: 1, Explaination: 1 is the subarray
// Input: [5,4,-1,7,8]
// Output: 23, Explaination: 5,4,-1,7,8 is the subarray
public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] inputArray = new int[]{5, 4, -1, 7, 8};
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        System.out.println("Sum of maximum Subarray is: " + bruteForce(inputArray));
    }

    public static int bruteForce(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("Array is null or has invalid size.");
        }

        int maximumSum = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            int sum = 0;

            for (int j = i; j < inputArray.length; j++) {
                sum += inputArray[j];
                maximumSum = Math.max(sum, maximumSum);
            }
            // 5, 4, -1, 7, 8
        }
        return maximumSum;
    }

    public static int optimalApproach(int[] nums) {
        return 0;
    }
}
