package SORTING;

// THIS OPERATES ON DIVIDING THE ARRAY IN SMALLER ELEMENTS
// THEN, WE MERGE THE SORTED ELEMENTS TOGETHER

public class MergeSort {

    public static void main(String[] args) {
        int originalArray[] = new int[] { 5, 3, 2, 1 };
        int low = 0;
        int high = originalArray.length - 1;

        if (originalArray == null || originalArray.length == 0) {
            System.out.println("Input array is invalid");
            return;
        }
        if (originalArray.length < 2) {
            System.out.println("Input array is sorted");
            return;
        }
        System.out.println("Original Array is: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }

        System.out.println("\nSorted Array is using Merge sort is: ");

        int[] sortedArray = mergeSort(originalArray, low, high);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    private static int[] mergeSort(int[] originalArray, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(originalArray, low, mid);
            mergeSort(originalArray, mid + 1, high);
            merge(originalArray, low, mid, high);
        }
        return originalArray;
    }

    // TC: O(N * LOG N)
    // NEED TO TRAVERSE THROUGH THE LOOP
    // SC: O(n)
    // CREATING A NEW TEMP ARRAY EACH TIME
    private static void merge(int[] originalArray, int low, int mid, int high) {
        int tempArray[] = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int i = 0;

        while (left <= mid && right <= high) {
            if (originalArray[left] <= originalArray[right]) {
                tempArray[i++] = originalArray[left++];
            } else {
                tempArray[i++] = originalArray[right++];
            }
        }

        while (left <= mid) {
            tempArray[i++] = originalArray[left++];
        }
        while (right <= high) {
            tempArray[i++] = originalArray[right++];
        }

        for (int temp = low, k = 0; temp <= high; temp++) {
            originalArray[temp] = tempArray[k++];
        }
    }
}