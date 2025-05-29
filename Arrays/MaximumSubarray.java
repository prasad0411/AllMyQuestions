package ARRAYS;

//FIND LARGEST SUM OF AN ARRAY 
//HINT: USE KADDENE'S ALGO
//IMCOMPLETE 

// import java.util.*;

public class MaximumSubarray {
    public int maxSubArray(int[] arr) {

        // int arr[] = new int[10];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Maximum sum is: ");
        return sum;

        // sc.close();

    }

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter number of elements (greater than 0) ");
    // int size = sc.nextInt();

    // System.out.println("Enter array elements");

    public static void main(String[] args) {

        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        MaximumSubarray obj = new MaximumSubarray();
        System.out.println(obj.maxSubArray(arr));
    }
}