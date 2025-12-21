import java.util.Arrays;

// RETURN THE ELEMENT THAT EXISTS JUST ONCE, WHILE ALL OTHER ELEMENTS EXIST TWICE IN THE SORTED ARRAY

// Input: [1,1,2,3,3,4,4,8,8]  
// Output: 2

// Input:[3,3,7,7,10,11,11]
// Output: 10

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println("Original array is: " + Arrays.toString(array));
        System.out.println("Single element from the sorted array is: " + singleNonDuplicate(array));
    }

    // APPROACH: Use a binary search

    // TC: O(log n). Using binary search
    // SC: O(1)- No new data structure is used.
    public static int singleNonDuplicate(int[] nums) {

        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is null or has an invalid size.");

        if (nums[0] != nums[1])
            return nums[0];

        if (nums[nums.length - 1] != nums[nums.length - 2])
            return nums[nums.length - 1];

        int low = 1;
        int high = nums.length - 2;

        while (low <= high) {
            int middlePointer = low + (high - low) / 2;

            if (nums[middlePointer] != nums[middlePointer + 1] && nums[middlePointer] != nums[middlePointer - 1])
                return nums[middlePointer];

            // currently you are standing at left half, and the single element is on the
            // right half
            if ((middlePointer % 2) == 0 && nums[middlePointer] == nums[middlePointer + 1] ||
                    ((middlePointer % 2) == 1 && nums[middlePointer] == nums[middlePointer - 1])) {
                low = middlePointer + 1;
            } else
                high = middlePointer - 1;
        }

        return -1;
    }
}
