import java.util.Arrays;

// RETURN THE STARTING AND ENDING INDICES OF THE TARGET ELEMENT FROM SORTED ARRAY.
// IF THAT ELEMENT IS NOT PRESENT, RETURN -1 -1.

// Input: [5,7,7,8,8,10], 8
// Output: [3, 4]

// Input: [5,7,7,8,8,10], 6
// Output: [-1, -1]

// Input: [], 0
// Output: [-1,-1]

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int originalArray[] = { 1 };
        int target = 1;
        System.out.println("Array is: " + Arrays.toString(originalArray));
        System.out.println("Index positions are:" + Arrays.toString(bruteForce(originalArray, target)));
    }

    // APPROACH: Use the Single Pass approach, and declare start and end indices to
    // check for the positions of the target element.
    // In each iteration, check if we need to modify the start index (only on first
    // occurrence).
    // Keep updating the last index on each occurrence of the target.

    // TC: O(n).
    // Traverse all the array elements once
    // SC: O(1). No new data structure.
    public static int[] bruteForce(int[] nums, int target) {

        // BASE CASE
        if (nums == null || nums.length == 0) {
            return new int[] { -1, -1 };
        }

        int startindex = -1, lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (startindex == -1) {
                    startindex = i;
                }
                lastIndex = i;
            }
        }

        return startindex != -1 ? new int[] { startindex, lastIndex } : new int[] { -1, -1 };
    }
}
