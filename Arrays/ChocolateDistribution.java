//1) SORT THE ARRAY
//2) i+m-1<n
//INCOMPLETE

public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 3, 2, 4 };
        // int students = 3;

        System.out.println("Unsorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
