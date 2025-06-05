package ARRAYS;

public class SecondLargestElementWithoutSorting {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 2, 5 };
        // System.out.println(search(arr));
        System.out.println(sorted(arr));
    }

    private static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    private static int search(int[] arr) {
        int largestIndexAt = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largestIndexAt > arr[i])
                largestIndexAt = i;
        }

        // int arr[] = new int[] { 5, 3, 6, 2 };

        int secondlargestElement = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j; j < arr.length - 1; k++) {

            }
        }
        return secondlargestElement;
    }
}
