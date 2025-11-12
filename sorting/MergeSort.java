import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int input[] = new int[] { 5, 4, 3, 2, 1 };
        System.out.println("Original array is: " + Arrays.toString(input));
        divide(input, 0, input.length - 1);
        System.out.println("Sorted array is: " + Arrays.toString(input));
    }

    private static void divide(int input[], int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        divide(input, startIndex, middleIndex);
        divide(input, middleIndex + 1, endIndex);
        conquer(input, startIndex, middleIndex, endIndex);
    }

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
