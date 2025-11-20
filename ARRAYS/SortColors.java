
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// AN UNSORTED ARRAY IS GIVEN, NEED TO SORT IT IN PLACE FOR THE 3 NUMBERS/ COLORS, 0 , 1, 2
// Input: [2, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 0, 2, 2, 2, 1, 1]  
// Output: [0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2]
// Input:[2,0,2,1,1,0]
// Output:[0,0,1,1,2,2]
// Input: [2,0,1]
// Output: [0,1,2]
public class SortColors {

    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 0, 1};
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        System.out.println(Arrays.toString(bruteForce(inputArray)));
    }

    // APPROACH: Use a hashmap to store count of 0,1,2. Based on these counts or null values, in the array, put 0,1,2
    // Time Complexity: O(n).
    // Traversing through the whole array and putting counts of 0,1,2 into the Map
    // Space Complexity: O(n).
    // Creating hashMap
    private static int[] bruteForce(int[] inputArray) {
        //BASE CASE
        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("Array is null or has an invalid size.");
        }
        System.out.println("Brute force approach: =>");

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            hashMap.put(inputArray[i], hashMap.getOrDefault(inputArray[i], 0) + 1);
        }

        int counterZero = hashMap.getOrDefault(0, 0);
        int counterOne = hashMap.getOrDefault(1, 0);

        for (int i = 0; i < counterZero; i++) {
            inputArray[i] = 0;
        }

        for (int i = counterZero; i < counterOne + counterZero; i++) {
            inputArray[i] = 1;
        }

        for (int i = counterOne + counterZero; i < inputArray.length; i++) {
            inputArray[i] = 2;
        }

        return inputArray;
    }
}
