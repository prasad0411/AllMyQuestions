import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// We have an array of integers and a target, return the indices of the two numbers such that they add up to the target.
// Each input would have exactly one solution, and you may not use the same element twice.

// Input: nums = [2, 7, 11, 15], target = 9
// Output: [0, 1] 

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 7, 11, 15 };
        int target = 29;

        System.out.println("Original array is: " + Arrays.toString(arr));
        System.out.println("Target element is: " + target);

        int[] ansArray = betterThanBruteForce(arr, target);
        System.out.println("Indices of numbers that add up to the target: " + ansArray[0] + " and " + ansArray[1]);
    }

    // TC: O(n^2). Use 2 loops to check sum of all elements against the target
    // SC: O(1). Did not create any new data structure
    public static int[] bruteForce(int arr[], int target) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid array size");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] {};
    }

    // TC: O(n). Traverse through hashmap to find target- current element
    // SC: O(n). Created new datastructure: hashmap of size arr.length
    public static int[] betterThanBruteForce(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid array size");
        }

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(target - arr[i])) {
                return new int[] { hashMap.get(target - arr[i]), i };
            }

            hashMap.put(arr[i], i);
        }
        return new int[] {};
    }
}