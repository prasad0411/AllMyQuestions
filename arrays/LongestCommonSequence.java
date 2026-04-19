
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// WE HAVE AN UNSORTED ARRAY  
// RETURN LENGTH OF THE LONGEST SEQUENCE OF CONSECUTIVE NUMBERS 

// Input: arr = [100,4,200,1,3,2]
// Output: 4

// Input: arr = [0,3,7,2,5,8,4,6,0,1]
// Output: 9

public class LongestCommonSequence {
    public static void main(String[] args) {
        int[] originalArr = new int[] { 100, 4, 200, 1, 3, 2 };
        System.out.println("Original array is: " + Arrays.toString(originalArr));
        // System.out.print("Longest common sequence is: " + bruteForce(originalArr));
        System.out.print("Longest common sequence is: " + optimalApproach(originalArr));
    }

    // APPROACH: Use a hashSet and store all elements in it.
    // Use a loop to traverse store all elements into the Set.
    // Check if an element' -1 value exists in the set, if not, it is the starting
    // position of the longest sequence.
    // Then check for existence of element' +1 value in set, and increment counter
    // Compare counter and maxCounter at the end

    // Time Complexity: O(n). Traverse the array to store into the Set
    // Space Complexity: O(n) HashSet
    private static int optimalApproach(int[] originalArr) {
        System.out.println("Optimal Approach: ");

        // BASE CASE
        if (originalArr == null || originalArr.length == 0)
            return 0;

        Set<Integer> uniqueElementsSet = new HashSet<>();

        for (int num : originalArr) {
            uniqueElementsSet.add(num);
        }

        int maxCount = 1;
        for (int num : uniqueElementsSet) {
            if (!uniqueElementsSet.contains(num - 1)) {
                int currentHead = num;
                int count = 1;

                while (uniqueElementsSet.contains(currentHead + 1)) {
                    currentHead++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }

    // APPROACH: Sort the array.
    // Use a loop to traverse through all elements and difference of each
    // consecutive elements should be 1. If the elements match, skip it, else
    // increase the count. Keep track of max count and return it in the end

    // Time Complexity: O(n log n). Sort the array, and then traverse it
    // Space Complexity: O(1) No new data structure
    @SuppressWarnings("unused")
    private static int bruteForce(int[] nums) {
        System.out.println("Brute force approach: ");
        // BASE CASE
        if (nums == null || nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int maxCount, count;
        maxCount = count = 1;

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1])
                continue;
            else if (nums[i] - nums[i - 1] == 1)
                count++;
            else
                count = 1;

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}