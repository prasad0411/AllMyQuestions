
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// IN AN UNSORTED ARRAY, FIND THE ELEMENT THAT OCCURS MORE THAN N/2 TIMES
// Input: [3,2,3]  
// Output: 3
// Input: [2,2,1,1,1,2,2]
// Output:2
public class MajorityElement {

    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 1};
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        // System.out.println("Majority element is: " + bruteForce(inputArray));
        System.out.println("Majority element is: " + betterThanBruteForce(inputArray));
        // System.out.println("Majority element is: " + optimalApproach(inputArray));
    }

    // APPROACH: Boyer-Moore Voting Algorithm
    // Declare candidateElement as arr[0] and count as 1.
    // Use loop to check if candidateElement == currentElement, if yes, then count++, else count--
    // If count becomes 0, then make current element as candidateElement.
    // Time Complexity: O(n)
    // Traversing through the whole array and checking for maximumElement based on counts
    // Space Complexity: O(1)
    // No new data structure
    private static int optimalApproach(int[] inputArray) {
        validate(inputArray);

        int count = 1;
        int candidateElement = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (count == 0) {
                candidateElement = inputArray[i];
            }
            count += (inputArray[i] == candidateElement) ? 1 : -1;
        }

        return candidateElement;
    }

    // APPROACH: Use a hashmap to store freq of each element.
    // During insertion, check if element' count exceeds N/2 times
    // Time Complexity: O(n).
    // Traversing through the whole array and putting freq of each element into the Map
    // Space Complexity: O(n).
    // Creating hashMap
    private static int betterThanBruteForce(int[] inputArray) {
        validate(inputArray);

        Map<Integer, Integer> freqMap = new HashMap<>();
        int threshold = inputArray.length / 2;
        for (int num : inputArray) {
            int currentCount = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, currentCount);

            if (currentCount > threshold) {
                return num;
            }
        }

        throw new AssertionError("No majority element exists");
    }

    // APPROACH: Sort the array so that the middle element is the ans, as it has to occur N/2 times
    // Time Complexity: O(n log n).
    // Space Complexity: O(1).
    // In place modification.
    private static int bruteForce(int[] inputArray) {
        validate(inputArray);

        Arrays.sort(inputArray);
        return inputArray[inputArray.length / 2];
    }

    // Validates array for null or being empty
    private static void validate(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }
    }
}
