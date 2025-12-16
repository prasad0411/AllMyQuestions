import java.util.Arrays;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] modifiedArray = { 5, 1, 3 };
        int target = 3;
        System.out.println("Modified array with K rotations is: " + Arrays.toString(modifiedArray));
        System.out.println("Target element is: " + target);
        System.out.println("Target element is present at index at: " + bruteForce(modifiedArray, target));
    }

    public static int bruteForce(int[] nums, int target) {
        System.out.println("Brute Force =>");

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or has an invalid size.");
        }

        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while (leftPointer <= rightPointer) {
            int midPointer = leftPointer + (rightPointer - leftPointer) / 2;

            if (nums[midPointer] == target)
                return midPointer;

            else if (nums[leftPointer] <= nums[midPointer]) {
                if (nums[leftPointer] <= target && target <= nums[midPointer]) {
                    rightPointer = midPointer - 1;
                } else
                    leftPointer = midPointer + 1;
            } else {
                if (nums[midPointer] <= target && target <= nums[rightPointer]) {
                    leftPointer = midPointer + 1;
                } else
                    rightPointer = midPointer - 1;
            }
        }

        return -1;
    }
}
