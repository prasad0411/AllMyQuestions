import java.util.HashMap;
import java.util.Map;

// WE HAVE AN UNSORTED/ SORTED ARRAY  
// RETURN FREQUENCY OF EACH ELEMENT
// RETURN EMPTY MAP IF ELEMENTS ARE NOT PRESENT

// Input: arr = [1,1,1,2]
// Output: 1=3, 2=1 

// Input: arr = [1, 2]
// Output: 1=1, 2=1

// Input: arr = []
// Output: {}

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 0, 2 };
        System.out.println("Frequency of elements is: " + countFrequency(arr));
    }

    // TC: O(n)
    // Need to traverse through all elements
    // SC: O(k) for all unique elements in the Map
    private static Map<Integer, Integer> countFrequency(int[] inputArray) {
        // EDGE CASE: Handle null or empty array
        if (inputArray == null || inputArray.length < 1) {
            return new HashMap<>();
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : inputArray) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap;
    }
}