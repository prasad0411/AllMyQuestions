
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// AN UNSORTED ARRAY IS GIVEN, NEED TO FIND THE ELEMENT THAT OCCURS ARR.LENGTH/2 TIMES
// Input: [3,2,3]  
// Output: 3

// Input:[2,2,1,1,1,2,2]
// Output:2

public class MajorityElement {
    public static void main(String[] args) {
        int[] inputArray = new int[]{3, 2, 3};
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        System.out.println("Majority element is: " + majorityElement(inputArray));
    }

    private static int majorityElement(int[] inputArray) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int i = 0;

        for (; i < inputArray.length; i++) {
            hashMap.put(inputArray[i], hashMap.getOrDefault(inputArray[i], 0)
                    + 1);
        }

        int majorityElement = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > inputArray.length / 2) {
                majorityElement = entry.getKey();
                break;
            }
        }

        return majorityElement;
    }
}
