
import java.util.Arrays;

// LC: 75. Sort Colors.
// Problem: Sort three colors, red, white and blue, represented by 0, 1, 2.
// Constraints: Need to be done in-place and in a single pass.

// Input: [2, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 0, 2, 2, 2, 1, 1]  
// Output: [0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2]

// Input:[2,0,2,1,1,0]
// Output:[0,0,1,1,2,2]

// Pattern: Arrays: 3 pointers (Dutch National Flag)

public class SortColors {
    public static void main(String[] args) {
        int[] inputArray = new int[] { 2, 0, 2, 1, 1, 0 };
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        // System.out.println("Brute Force Approach =>");
        // bruteForce(inputArray);

        System.out.print("Optimal Approach => ");
        optimalApproach(inputArray);
        System.out.println("Modified array is: " + Arrays.toString(inputArray));
    }

    // Approach: Iterate over the original array and count the number of 0s, 1s, &
    // 2. Based on these values, assign those many positions in the original array.
    // TC: O(n)
    // SC: O(1)
    @SuppressWarnings("unused")
    private static void bruteForce(int[] inputArray) {
        int zeroCounter = 0;
        int oneCounter = 0;
        int twoCounter = 0;

        for (int num : inputArray) {
            if (num == 0)
                zeroCounter++;
            else if (num == 1)
                oneCounter++;
            else
                twoCounter++;
        }

        for (int i = 0; i < zeroCounter; i++) {
            inputArray[i] = 0;
        }

        for (int i = zeroCounter; i < zeroCounter + oneCounter; i++) {
            inputArray[i] = 1;
        }

        for (int i = zeroCounter + oneCounter; i < inputArray.length; i++) {
            inputArray[i] = 2;
        }
    }

    // Approach: Maintain 3 pointers, low, mid, high, where 0 to low-1 has all 0s,
    // low to mid-1 has all 1s, mid to high has all unsorted elements, high+1 to
    // arr.length -1 has all 2s.

    // TC: O(n) - Single Pass
    // SC: O(1)
    private static void optimalApproach(int[] inputArray) {
        int low = 0;
        int mid = 0;
        int high = inputArray.length - 1;

        while (mid <= high) {
            if (inputArray[mid] == 0) {
                int temp = inputArray[low];
                inputArray[low] = inputArray[mid];
                inputArray[mid] = temp;
                low++;
                mid++;
            } else if (inputArray[mid] == 1) {
                mid++;
            } else {
                int temp = inputArray[mid];
                inputArray[mid] = inputArray[high];
                inputArray[high] = temp;
                high--;
            }

        }
    }
}
