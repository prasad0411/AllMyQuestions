
import java.util.Arrays;
// Q: Striver' sheet

// Problem: AN ARRAY IS GIVEN, NEED TO FIND 2ND LARGEST AND 2ND SMALLEST ELEMENT 
// In output, we will return 2 elements

// Constraints and edge cases: we need to handle conditions like array is empty, or if it has less 2 elements, or if there are duplicates 

// For eg: 
// Input : 3, 4, 1, 7, 23, 1
// Output: 2nd Largest element: 7, 2nd Smallest element: 3

// Input : 1, 2, 3
// Output: 2nd Largest element: 2, 2nd Smallest element: 2

// Input: 1, 1, 1
// Output: -1, -1 

public class SecondSmallestAndSecondLargest {

    public static void main(String[] args) {
        int inputArray[] = new int[] { 5, 4, 6, 7 };
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        @SuppressWarnings("unused")
        int resultArrBrute[] = bruteForceApproach(inputArray);
        // System.out.println(
        // "Brute =>\n2nd largest element is: " + resultArrBrute[0] + "\n2nd smallest
        // element is: "
        // + resultArrBrute[1]);

        int resultArrOptimal[] = optimalApproach(inputArray);
        System.out.println(
                "Optimal Approach =>\n2nd largest element is: " + resultArrOptimal[0] +
                        "\n2nd smallest element is: "
                        + resultArrOptimal[1]);
    }

    // Time Complexity: O(n log n)
    // Sort the array, and then traverse through all elements to find 2nd smallest
    // and 2nd largest
    // Space Complexity: O(1) In place sorting
    @SuppressWarnings("unused")
    private static int[] bruteForceApproach(int[] inputArray) {
        // EDGE CASE: array is empty or has invalid number of elements
        if (inputArray == null || inputArray.length < 2) {
            throw new IllegalArgumentException("Array is null or does not have enough elements.");
        }

        Arrays.sort(inputArray);

        if (inputArray[0] == inputArray[inputArray.length - 1])
            return new int[] { -1, -1 };

        int secondLargestValue = inputArray[inputArray.length - 2];
        for (int i = inputArray.length - 1; i > 0;) {
            if (inputArray[i] == inputArray[i - 1]) {
                i--;
            } else {
                secondLargestValue = inputArray[i - 1];
                break;
            }
        }

        int secondSmallestValue = inputArray[1];
        for (int i = 0; i < inputArray.length - 1;) {
            if (inputArray[i] == inputArray[i + 1]) {
                i++;
            } else {
                secondSmallestValue = inputArray[i + 1];
                break;
            }
        }

        return new int[] { secondLargestValue, secondSmallestValue };
    }

    // Time Complexity: O(n)
    // Traverse through all elements, using 4 variables to track min, max, 2nd min,
    // 2nd max
    // Space Complexity: O(1) No sorting and no new data structure used
    private static int[] optimalApproach(int inputArray[]) {
        // EDGE CASE
        if (inputArray == null || inputArray.length < 2) {
            throw new IllegalArgumentException("Input array is empty.");
        }

        @SuppressWarnings("unused")
        int smallestValue, largestValue, secondSmallestValue, secondLargestValue;
        smallestValue = largestValue = secondSmallestValue = secondLargestValue = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            if (currentValue > largestValue) {
                secondLargestValue = largestValue;
                largestValue = currentValue;
            } else if (currentValue != largestValue && currentValue > secondLargestValue) {
                secondLargestValue = currentValue;
            }

            if (currentValue < smallestValue) {
                secondSmallestValue = smallestValue;
                smallestValue = currentValue;
            } else if (currentValue != smallestValue && currentValue < secondSmallestValue) {
                secondSmallestValue = currentValue;
            }
        }

        if (largestValue == smallestValue)
            return new int[] { -1, -1 };

        return new int[] { secondLargestValue, secondSmallestValue };
    }
}
