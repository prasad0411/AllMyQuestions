// Given an integer array nums and an integer val, remove all occurrences of val in-place and return the new length of the array.
// Do not allocate extra space; modify the input array in-place with O(1) extra memory.

// Input: nums = [3, 2, 2, 3], val = 3
// Output: New length = 2, Modified array = [2, 2]

// Input: nums = [0, 1, 2, 2, 3, 0, 4, 2], val = 2
// Output: New length = 5, Modified array = [0, 1, 3, 0, 4]

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = new int[] { 3, 3, 5, 3, 4, 2 };
        int val = 3;
        System.out.print("Original array is: ");
        for (int number : nums)
            System.out.print(number + ", ");

        if (nums.length == 0) {
            System.out.println("\nInvalid array size");
            return;
        }
        System.out.print(
                "\nAfter removing '" + val + "' from the array, valid element numbers is/ are "
                        + optimalApproach(nums, val));
    }

    // Time Complexity: O(n).
    // We are traversing through all elements from the array
    // Space Complexity: O(1).
    // Modifying original array in place

    public static int optimalApproach(int[] nums, int val) {
        int validIndex = 0;
        for (int number : nums) {
            if (number == val)
                continue;
            nums[validIndex++] = number;
        }
        System.out.print("\n\nValid array after removal of elements is => ");
        for (int i = 0; i < validIndex; i++)
            System.out.print(nums[i] + " ");
        return validIndex;
    }
}
