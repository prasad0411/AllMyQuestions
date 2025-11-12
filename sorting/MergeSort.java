import java.util.Arrays;

// WE HAVE AN UNSORTED ARRAY, AND WE NEED TO SORT IT
// Input: arr = [65, 55, 45]
// Output: [45, 55, 65]

// TC: O(n log n)
// We check all elements at each level for sorting
// Space Complexity: O(n)
// Creating a new temp array to store sorted elements

public class MergeSort {
    public static void main(String[] args) {
        int input[] = new int[] { 5, 4, 3, 2, 1 };
        System.out.println("Original array is: " + Arrays.toString(input));
        divide(input, 0, input.length - 1);
        System.out.println("Sorted array is: " + Arrays.toString(input));
    }

    // DIVIDING THE ARRAY INTO EQUAL HALVES, UNTIL WE HAVE SINGULAR ELEMENTS
    private static void divide(int input[], int startIndex, int endIndex) {

        // BASE CASE FOR RECURSSION: 0/1 ELEMENT, SO ITS SORTED
        if (startIndex >= endIndex) {
            return;
        }

        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        divide(input, startIndex, middleIndex);
        divide(input, middleIndex + 1, endIndex);
        conquer(input, startIndex, middleIndex, endIndex);
    }

    // POST DIVIDING, WE SORT THE SINGULAR ELEMENTS AND FORM THE SORTED BIGGER ARRAY
    public static void conquer(int[] input, int startIndex, int middleIndex, int endIndex) {
        int resultArray[] = new int[endIndex - startIndex + 1];
        int i = startIndex;
        int j = middleIndex + 1;
        int k = 0;

        while (i <= middleIndex && j <= endIndex) {
            if (input[i] <= input[j]) {
                resultArray[k++] = input[i++];
            } else {
                resultArray[k++] = input[j++];
            }
        }

        while (i <= middleIndex) {
            resultArray[k++] = input[i++];
        }

        while (j <= endIndex) {
            resultArray[k++] = input[j++];
        }

        for (int m = 0, n = startIndex; m < resultArray.length; m++, n++) {
            input[n] = resultArray[m];
        }
    }
}
