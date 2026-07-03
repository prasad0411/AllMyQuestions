import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LC: 169. Majority Element

// Problem: From an array, find the majority element that occurs more than n/2 times.
// Majoity element is always present in the array.

// Input: [1,3,3]
// Output: 3

// Input: [3,1,2,2]
// Output: 2

// Pattern: Arrays:  
public class MajorityElement {

    public static void main(String[] args) {
        int[] inputArray = new int[] { 8, 8, 7, 7, 7 };
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        // System.out.println("Brute Force, Majority element is: " +
        // bruteForce(inputArray));
        System.out.println("betterThanBruteForce Approach: Majority element is: " +
                betterThanBruteForce(inputArray));
        // System.out.println("Majority element is: " + optimalApproach(inputArray));
    }

    // Approach: Store the frequencies of every element in a Map. Then return the key with maximum frequency
    // TC: O(n)
    // SC: O(n)
    public static int betterThanBruteForce(int[] nums) {
        validate(nums);

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int majorityElement = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        return majorityElement;
    }

    // Approach: Sort the array, and the element that occurs majority amount of
    // times, will be at the n/2 index.
    // TC: O(n log n)
    // SC: O(1)
    public static int bruteForce(int[] nums) {
        validate(nums);

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Validates array for null or being empty
    private static void validate(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }
    }
}
