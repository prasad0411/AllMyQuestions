//INCOMPLETE

import java.util.*;

public class ArraySearchInSortedandPivotedArray {
    public void binarySearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the search element: "));
        int key = sc.nextInt();

        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int low, high, mid, flag;
        high = arr.length;
        low = flag = 0;

        while (low < high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                flag = 1;
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            }
        }
        if (flag == 0)
            System.out.println("element not found");
        else
            System.out.println("element found");
        sc.close();

    }

    public static void main(String[] args) {
        ArraySearchInSortedandPivotedArray obj = new ArraySearchInSortedandPivotedArray();
        obj.binarySearch();
    }
}
