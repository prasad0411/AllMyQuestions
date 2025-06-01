package SORTING;

// SORT THE ARRAY, AND AT EACH ITERATION, PUT THE LARGEST ELEMENT AT LARGEST INDEX

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int originalArray[] = new int[] { 5, 3, 2, 1 };

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

        int[] sortedArray = obj.bubbleSort(originalArray);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    // TC: O(N*2)
    // NEED TO TRAVERSE THROUGH BOTH THE LOOPS TO SORT
    // SC: O(1)
    // SORTING IN PLACE
    private int[] bubbleSort(int[] originalArray) {
        System.out.println("\nSorted Array is using Bubble sort is: ");
        for (int i = 0; i < originalArray.length - 1; i++) {
            int swapped = 0;
            for (int j = 0; j < originalArray.length - i - 1; j++) {
                int temp;
                if (originalArray[j] > originalArray[j + 1]) {
                    temp = originalArray[j];
                    originalArray[j] = originalArray[j + 1];
                    originalArray[j + 1] = temp;
                    swapped = 1;
                }
            }
            if (swapped == 0) {
                break;
            }
        }
        return originalArray;
    }
}
