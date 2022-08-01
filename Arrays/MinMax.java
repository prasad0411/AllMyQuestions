// FIND MIN AND MAX NUMBERS OF AN ARRAY
//EDGE CASES COVERED
//TC: O(n)
//SC: 1

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        System.out.println("enter array elements");
        int arr[] = new int[10];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        if (max < min) {
            int temp = min;
            min = max;
            max = temp;
        }
        if (n > 1) {
            for (int i = 1; i < n; i++) {
                if (min > arr[i])
                    min = arr[i];

                if (max < arr[i])
                    max = arr[i];

            }
        }

        System.out.print("minimum number in array is: ");
        System.out.println(min);
        System.out.print("maximum number in array is: ");
        System.out.println(max);
        sc.close();
    }
}