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
        int originalArray[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println("Array is: " + Arrays.toString(originalArray));
        System.out.println("Target element is: " + target);
        System.out.println("Indices are: " + Arrays.toString(bruteForce(originalArray,
                target)));
        // System.out.println("Indices are: " +
        // Arrays.toString(optimalApproach(originalArray, target)));
    }

    // APPROACH: Use Binary search to find the first and last positions.

    // TC: O(log n) + O(log n) = O(log n).
    // Traverse all the array elements once
    // SC: O(1). No new data structure.
    public static int[] optimalApproach(int[] nums, int target) {
        System.out.println("Optimal Approach => ");

        int[] ansArray = { -1, -1 };

        // EDGE CASE: EXIT IF ARRAY IS NULL OR HAS NO ELEMENTS
        if (nums == null || nums.length == 0) {
            return ansArray;
        }

        ansArray[0] = firstIndex(nums, target);

        // EDGE CASE: IF FIRST POSITION DOES NOT EXIST, LAST POSITION WONT EXIST AS WELL
        if (ansArray[0] == -1) {
            return new int[] { -1, -1 };
        }

        ansArray[1] = lastIndex(nums, target);

        return ansArray;
    }

    // While checking for first index, when we find the target, we
    // preserve the midPointer and do rightPointer = midPointer -1 to check if we
    // can find further smaller value than middlePointer
    private static int firstIndex(int[] nums, int target) {
        int startIndex = -1;
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {
            int midPointer = leftPointer + (rightPointer - leftPointer) / 2;

            if (nums[midPointer] == target) {
                startIndex = midPointer;
                rightPointer = midPointer - 1;
            } else if (nums[midPointer] > target) {
                rightPointer = midPointer - 1;
            } else {
                leftPointer = midPointer + 1;
            }
        }

        return startIndex;
    }

    // While checking for last index, when we find the target, we
    // preserve the midPointer and do leftPointer = midPointer +1 to check if we
    // can find further bigger value than middlePointer
    private static int lastIndex(int[] nums, int target) {
        int lastIndex = -1;
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {
            int midPointer = leftPointer + (rightPointer - leftPointer) / 2;

            if (nums[midPointer] == target) {
                lastIndex = midPointer;
                leftPointer = midPointer + 1;
            } else if (nums[midPointer] > target) {
                rightPointer = midPointer - 1;
            } else {
                leftPointer = midPointer + 1;
            }
        }

        return lastIndex;
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
        System.out.println("Brute Force => ");

        // EDGE CASE: EXIT IF ARRAY IS NULL OR HAS NO ELEMENTS
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
