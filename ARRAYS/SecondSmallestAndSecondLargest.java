
import java.util.Arrays;


// AN UNSORTED ARRAY IS GIVEN, NEED TO FIND 2ND LARGEST AND 2ND SMALLEST ELEMENTS
// Input : 3, 4, 1, 7, 23, 1
// Output: 2nd Largest element: 7, 2nd Smallest element: 3
// Input : 1, 2, 3
// Output: 2nd Largest element: 2, 2nd Smallest element: 2
// Input: 1, 1, 1
// Output: -1, -1 
public class SecondSmallestAndSecondLargest {

    public static void main(String[] args) {
        int inputArray[] = new int[]{3, 1, 2};
        System.out.println("Original array is: " + Arrays.toString(inputArray));
        // int resultArrBrute[] = bruteForceApproach(inputArray);
        // System.out.println(
        // "Brute =>\n2nd largest element is: " + resultArrBrute[0] + "\n2nd smallest
        // element is: "+ resultArrBrute[1]);
        int resultArrOptimal[] = optimalApproach(inputArray);
        System.out.println(
                "Optimal Approach =>\n2nd largest element is: " + resultArrOptimal[0] + "\n2nd smallest element is: "
                + resultArrOptimal[1]);
    }

    // Time Complexity: O(n log n)
    // Sort the array, and then traverse through all elements to find 2nd smallest
    // and 2nd largest
    // Space Complexity: O(1) In place sorting
    private static int[] bruteForceApproach(int[] inputArray) {
        // EDGE CASE
        if (inputArray == null || inputArray.length < 2) {
            throw new IllegalArgumentException("Array needs at least 2 elements");
        }

        Arrays.sort(inputArray);

        int secondSmallest = -1;
        int secondLargest = -1;

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] != inputArray[0]) {
                secondSmallest = inputArray[i];
                break;
            }
        }

        for (int i = inputArray.length - 2; i >= 0; i--) {
            if (inputArray[i] != inputArray[inputArray.length - 1]) {
                secondLargest = inputArray[i];
                break;
            }
        }

        // IF ELEMENTS ARE DUPLICATE
        if (secondSmallest == -1 || secondLargest == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{secondLargest, secondSmallest};
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

        int smallestValue = Integer.MAX_VALUE;
        int largestValue = Integer.MIN_VALUE;
        int secondSmallestValue = Integer.MAX_VALUE;
        int secondLargestValue = Integer.MIN_VALUE;

        for (int num : inputArray) {
            // SECOND SMALLEST VALUE
            if (num < smallestValue) {
                secondSmallestValue = smallestValue;
                smallestValue = num;
            } else if (num < secondSmallestValue && num != smallestValue) {
                secondSmallestValue = num;
            }

            // SECOND LARGEST VALUE
            if (num > largestValue) {
                secondLargestValue = largestValue;
                largestValue = num;
            } else if (num > secondLargestValue && num != largestValue) {
                secondLargestValue = num;
            }
        }

        // IF ELEMENTS ARE DUPLICATE
        if (secondLargestValue == Integer.MIN_VALUE || secondSmallestValue == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        return new int[]{secondLargestValue, secondSmallestValue};
    }
}
