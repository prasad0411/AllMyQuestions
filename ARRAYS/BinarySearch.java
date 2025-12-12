import java.util.Arrays;

// WE HAVE A SORTED ARRAY AND A TARGET ELEMENT  
// USE BINARY SEARCH TO FIND THE INDEX OF THE TARGET ELEMENT 
// RETURN -1 IF ELEMENT IS NOT FOUND
 
// Input: arr = [5, 15, 25, 35, 45, 55, 65], target = 35  
// Output: 3  

// Input: arr = [10, 20, 30, 40, 50, 60, 70], target = 52  
// Output: -1 

public class BinarySearch {
    public static void main(String[] args) {
        int inputArray[] = new int[] { 1, 2, 3, 4, 5 };
        int target = 4;

        System.out.println("Original array is: " + Arrays.toString(inputArray));
        System.out.println("Target element is: " + target);

        if (search(inputArray, target) == -1) {
            System.out.println("\nTarget element not found in the array");
            return;
        }
        System.out.println("\nTarget element is found at index " + search(inputArray, target));
    }

    // Time Complexity: O(log n)
    // The search space is reduced by half in each iteration.
    // Space Complexity: O(1)
    // No new data structure is used to store anything.

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            System.out.println("Input array is invalid.");
            System.exit(0);
        }

        int leftP = 0;
        int rightP = nums.length - 1;

        while (leftP <= rightP) {
            int middleValue = leftP + ((rightP - leftP) / 2);
            if (nums[middleValue] == target) {
                return middleValue;
            } else if (target > nums[middleValue]) {
                leftP = middleValue + 1;
            } else
                rightP = middleValue - 1;
        }

        return -1;
    }
}