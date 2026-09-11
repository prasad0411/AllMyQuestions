import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// LC: 229. Majority Element 2.
// Problem: We have an array of size N. Find all elements that occur more than N/3 times.
// Constraints: It can have positive and negative numbers

// Input: [1,2]  
// Output: [1,2]

// Input: [1]
// Output: [1]

// Pattern: Arrays: Boyer Moore' Voting algo

public class MajorityElementII {
    // Approach: "More than n/3" means at most 2 elements can qualify (for n/k, at
    // most k-1).
    // Since the answer holds at most 2 values, we do not need a Map of all counts.
    // We track just 2 candidates using Boyer-Moore voting while scanning once,
    // then do a second pass to verify each candidate truly appears more than n/3
    // times.
    // TC: O(n) two linear passes
    // SC: O(1) only a handful of variables, no Map
    public static List<Integer> optimalApproach(int[] nums) {
        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (candidate1 == num)
                count1++;
            else if (candidate2 == num)
                count2++;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }

        List<Integer> majorityElements = new ArrayList<>();
        int threshold = nums.length / 3;
        if (count1 > threshold)
            majorityElements.add(candidate1);
        if (count2 > threshold)
            majorityElements.add(candidate2);

        return majorityElements;
    }

    // Approach: Iterate over the array to store the count of each element in Map
    // Traverse over the Map to check the condition and return those elements.
    // TC: O(n)
    // SC: O(n)
    public static List<Integer> bruteForce(int[] nums) {
        List<Integer> majorityElements = new ArrayList<>();
        Map<Integer, Integer> uniqueElements = new HashMap<>();

        for (int num : nums) {
            uniqueElements.put(num, uniqueElements.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : uniqueElements.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                majorityElements.add(entry.getKey());
            }
        }

        return majorityElements;
    }

    public static void main(String[] args) {
        int array[] = new int[] { 1, 2, 3, 3, 3 };
        System.out.println("Original array is:" + Arrays.toString(array));
        System.out.println("Brute Force Approach: " + bruteForce(array));
        System.out.println("Optimal Approach: " + optimalApproach(array));
    }
}
