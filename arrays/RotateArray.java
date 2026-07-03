import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    // Problem: An array, and number of steps (k) is given.
    // Need to rotate the array by K steps.

    // Constraints: The array can be sorted/ unsorted.
    // K is a non- negative number.

    // Input: [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]

    // Input: [-1,-100,3,99], k = 2
    // Output: [3,99,-1,-100]

    // Pattern: Maths property
    public static void brute(int[] nums, int k) {
        if (k == 0 || nums.length == 1)
            System.out.println("Array remains the same after rotation.");
        else {
            ArrayList<Integer> lastKElements = new ArrayList<>();
            for (int i = nums.length - 1; i > nums.length - 1 - k; i++) {
                lastKElements.add(nums[i]);
            }
        }
        System.out.println(lastKElements);
        System.out.println("Rotated array is: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] originalArr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int rotateByK = 0;
        System.out.println("Original array is: " + Arrays.toString(originalArr));
        brute(originalArr, rotateByK);
    }
}
