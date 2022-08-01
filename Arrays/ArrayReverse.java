//REVERSE AN ARRAY
//EDGE CASES COVERED
//TC: O(n)
//SC: 1

import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        if (n >= 2) {
            System.out.println("Enter array elements");
            int arr[] = new int[10];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // I HAVE TO CREATE A NEW ARRAY IN THIS APPROACH
            int newArray[] = new int[n];

            for (int i = n - 1, j = 0; i > -1; i--, j++) {
                newArray[j] = arr[i];
            }

            // DONT HAVE TO CREATE A NEW ARRAY IN THIS APPROACH
            // JUST PERFORMS STORING N-1 ELEMENT AT 0TH INDEX AND SO ON

            // for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            // int temp = arr[i];
            // arr[i] = arr[j];
            // arr[j] = temp;
            // }

            System.out.println("Reverse array elements");
            for (int i = 0; i < n; i++) {
                System.out.print(newArray[i] + " ");
            }
        } else
            System.out.println("-1");

        sc.close();
    }
}
