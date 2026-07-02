
import java.util.Arrays;

// AN UNSORTED ARRAY IS GIVEN, NEED TO SORT IT IN PLACE FOR THE 3 NUMBERS, 0, 1, 2, WHICH ARE REPRESENTED AS RED, WHITE & BLUE 

// Input: [2, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 0, 2, 2, 2, 1, 1]  
// Output: [0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2]

// Input:[2,0,2,1,1,0]
// Output:[0,0,1,1,2,2]

// Input: [2,0,1]
// Output: [0,1,2]

public class SortColors {
    public static void main(String[] args) {
        int[] inputArray = new int[] { 2, 0, 2, 1, 1, 0 };
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        bruteForce(inputArray);
        System.out.println("Original array is: " + Arrays.toString(inputArray));
    }

    // Approach: Iterate over the original array and count the number of 0s, 1s, &
    // 2. Based on these values, assign those many positions in the original array.
    private static void bruteForce(int[] inputArray) {
        int zeroCounter, oneCounter, twoCounter;
        zeroCounter = oneCounter = twoCounter = 0;

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
}
