
import java.util.Arrays;

public class RotateArrayCopy {
    // Problem: Rotate the given array to right, by 'K' steps

    // Constraints: The array can be sorted/ unsorted.
    // K is a non- negative number.
    // There is atleast 1 number in the array

    // Input: [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]

    // Input: [-1,-100,3,99], k = 2
    // Output: [3,99,-1,-100]

    // Pattern: Maths property
    public static void brute(int[] nums, int k) {
        int rotationsBy = nums.length - k;
        int resultArr[] = new int[nums.length];
        int j = 0;
        for (int i = rotationsBy; i < nums.length;) {
            resultArr[j++] = nums[i++];
        }

        j = 0;
        for (int i = k; i < nums.length;) {
            resultArr[i++] = nums[j++];
        }
        
        System.arraycopy(resultArr, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] originalArr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int rotateByK = 0;
        System.out.println("Original array is: " + Arrays.toString(originalArr));
        brute(originalArr, rotateByK);
        System.out.println("Modified array is: " + Arrays.toString(originalArr));
    }
}
