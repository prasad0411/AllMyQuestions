package ARRAYS;

// NEED TO ROTATE AN ARRAY, IN PLACE, BY K ELEMENTS

public class RotateArrays {
    public static void main(String[] args) {
        int nums[] = new int[] { 1, 3, 5 };
        System.out.print("Original Array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        int k = 1;
        rotate(nums, k);

        System.out.print("\nArray will be rotated to the right by " + k + " indices.\nRotated Array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // TC: O(N) NEED TO TRAVERSE THE WHOLE ARRY
    // SC: O(N) CREATED A NEW TEMP ARRAY TO STORE ALL ELEMENTS BASED ON NEW INDEXING

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] answer = new int[n];

        k = k % n; // Normalize k

        // Store rotated values in answer array
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            answer[newIndex] = nums[i];
        }

        // Copy back into original array to reflect in-place rotation
        for (int i = 0; i < n; i++) {
            nums[i] = answer[i];
        }
    }
}
