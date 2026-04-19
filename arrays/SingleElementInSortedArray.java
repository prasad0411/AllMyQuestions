import java.util.Arrays;

// RETURN THE ELEMENT THAT EXISTS JUST ONCE, WHILE ALL OTHER ELEMENTS EXIST TWICE IN THE ARRAY

// Input: [1,1,2,3,3,4,4,8,8]  
// Output: 2

// Input:[3,3,7,7,10,11,11]
// Output: 10

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 3, 4, 4 };
        System.out.println("Original array is: " + Arrays.toString(array));
        System.out.println("Single element from the sorted array is: " + optimalApproach(array));
    }

    // APPROACH: Use a modified binary search. Based on the index of the middle
    // element and its neighbors, decide which half of the array to search.

    // TC: O(log n). At each iteration, half of the elements will be discarded
    // SC: O(1)- No new data structure is used.
    public static int optimalApproach(int[] nums) {
        System.out.println("Optimal Approach ->");

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

            // Pairing rule in a sorted array:
            // - Even index: element should match index + 1
            // - Odd index: element should match index - 1
            // If the rule is satisfied, the single element lies on the right side.
            // Otherwise, it lies on the left side.
            if ((middlePointer % 2) == 0 && nums[middlePointer] == nums[middlePointer + 1] ||
                    ((middlePointer % 2) == 1 && nums[middlePointer] == nums[middlePointer - 1])) {
                low = middlePointer + 1;
            } else
                high = middlePointer - 1;
        }

        return -1;
    }
}
