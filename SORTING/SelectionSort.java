package SORTING;

// SORT THE ARRAY, AND AT EACH ITERATION, PUT THE SMALLEST ELEMENT AT SMALLEST INDEX

public class SelectionSort {
    public static void main(String[] args) {
        int num[] = new int[] { 5, 4, 5 };
        System.out.println("Original array elements are: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        int ans[] = selectionSort(num);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    // TC: O(N*2)
    // NEED TO TRAVERSE THROUGH BOTH THE LOOPS TO SORT
    // SC: O(1)
    // SORTING IN PLACE
    public static int[] selectionSort(int num[]) {
        System.out.println("\nSorted array elements using Selection sort is: ");
        for (int i = 0; i < num.length - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[minValue]) {
                    minValue = j;
                }
            }
            int temp = num[minValue];
            num[minValue] = num[i];
            num[i] = temp;
        }
        return num;
    }
}