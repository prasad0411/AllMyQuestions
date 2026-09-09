import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// LC: 229. Majority Element 2.
// Problem: We have an array of size N. Find all elements that occur more than N/3 times.
// Constraints: Atleast one element exists in the array
// It can have positive and negative numbers

// Input: [1,2]  
// Output: [1,2]

// Input: [1]
// Output: [1]

// Pattern: Arrays:  

public class MajorityElementII {
    // Approach: Iterate over the array to store the count of each element in Map
    // Traverse over the Map to check the condition and return those elements.
    // TC: O(n)
    // SC: O(n)
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> majorityElementsList = new ArrayList<>();
        Map<Integer, Integer> uniqueElements = new HashMap<>();

        for (int num : nums) {
            uniqueElements.put(num, uniqueElements.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : uniqueElements.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                majorityElementsList.add(entry.getKey());
            }
        }

        return majorityElementsList;
    }

    public static void main(String[] args) {
        int array[] = new int[] { 1, 2 };
        System.out.println("Original array is:" + Arrays.toString(array));
        System.out.println("Brute Force Approach: " + majorityElement(array));
    }
}
