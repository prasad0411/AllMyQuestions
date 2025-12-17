// WE HAVE AN UNSORTED ARRAY  
// FIND THE ONLY SINGLE ELEMENT IN THE ARRAY. REST ALL ELEMENTS APPEAR TWICE. 

// Input: arr = [4,1,2,1,2]
// Output: 4

// Input: arr = [2, 2, 1]
// Output: 1

// Input: arr = [1]
// Output: 1

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSingleNumber {
    public static void main(String[] args) {
        int inputArray[] = { 2, 2, 1 };
        System.out.println("Original array is :" + Arrays.toString(inputArray));
        System.out.println("Single element is :" + betterThanBruteForce(inputArray));
    }

    // APPROACH: Sort the elements, and return the answer element when
    // arr[i]!=arr[i+1]

    // TC: O(n log n). Sort the array and traverse through all elements
    // once
    // SC: O(1). No new data structure is created.
    public static int bruteForce(int[] array) {
        System.out.println("Optimal Approach => ");

        // EDGE CASE: array is null or is empty
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or has an invalid size.");
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] != array[i + 1]) {
                return array[i];
            }
        }
        return array[array.length - 1];
    }

    // APPROACH: Use HashMap and return ans element whose freq =1

    // Time Complexity: O(n). Put all elements with their freq in Map, and another
    // loop to find ans element with freq:1
    // Space Complexity: O(n). Creating HashMap
    public static int betterThanBruteForce(int[] array) {
        // Base case
        if (array == null || array.length < 1) {
            throw new IllegalArgumentException("Array is null or has an invalid size.");
        }

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int number : array) {
            hashMap.put(number, hashMap.getOrDefault(number, 0) + 1);
        }

        for (int number : array) {
            if (hashMap.get(number) == 1)
                return number;
        }

        return 0;
    }
}