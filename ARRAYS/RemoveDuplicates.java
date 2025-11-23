
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

// REMOVE DUPLICATE NUMBERS FROM AN ARRAY, IN PLACE
// RETURN THE NUMBER OF UNIQUE ELEMENTS IN THE ARRAY
// Input: [1, 2, 2, 3];
// Output: 1, 2, 3
// Input: [0, 0, 0];
// Output: 0
public class RemoveDuplicates {

    public static void main(String[] args) {
        int nums[] = new int[] { -1, -1, 1, 1, 11 };
        System.out.println("Original array is: " + Arrays.toString(nums));
        // int uniqueElements = bruteForceApproach(nums);
        int uniqueElements2 = optimalApproach(nums);
        for (int i = 0; i < uniqueElements2; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // TC: O(n) Using 1 loop to traverse through all elements and insert into the
    // Set.
    // Another loop to put the unique Set values into array
    // SC: O(n) Creation of hashSet to store unique elements
    public static int bruteForceApproach(int[] nums) {
        // BASE CASE: Array being null or empty
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException("Input array is null or has an invalid size.");
        }
        System.out.println("Brute Force =>");

        int uniqueElements = 0;
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                uniqueElements++;
            }
        }

        int i = 0;
        for (int num : set) {
            nums[i++] = num;
        }

        return uniqueElements;
    }

    // TC: O(n) Traverse through all elements once and modify the array in place
    // SC: O(1) No new data structure created
    public static int optimalApproach(int[] nums) {
        // BASE CASE: Array being null or empty
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException("Input array is null or has an invalid size.");
        }

        System.out.println("Optimal Approach =>");
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[uniqueIndex] != nums[i]) {
                ++uniqueIndex;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }
}
