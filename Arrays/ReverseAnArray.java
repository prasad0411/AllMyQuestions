package ARRAYS;

import java.util.Arrays;

// AN ARRAY IS GIVEN, NEED TO REVERSE IT   

// Input: [1, 5, 7, -1, 33, 444, 11]  
// Output: [11, 444, 33, -1, 7, 5, 1]  

public class ReverseAnArray { 

    public static void main(String[] args) {

        int inputarr[] = new int[] { 1 };
        System.out.println("Original array is: " + Arrays.toString(inputarr));
        System.out.print(Arrays.toString(reversedArrayInPlace(inputarr)));
        // optimalApproach(inputarr);
        // System.out.print(Arrays.toString(inputarr));
    }

    // Time Complexity: O(n).
    // We are traversing through all elements from original array
    // Space Complexity:O(n).
    // Need to create a new array of the size of original array

    private static int[] bruteForce(int[] arr) {
        System.out.print("\nBrute Force: Reversed array=> ");
        int[] reversedArray = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[j];
            j--;
        }
        return reversedArray;
    }

    // Time Complexity: O(n).
    // We are traversing through all elements from original array
    // Space Complexity:O(1).
    // No need to create a new data structure. Just use a temp varaible and use 2
    // pointers

    private static void optimalApproach(int[] inputArray) {
        System.out.print("\nOptimal Approach: Reversed array => ");
        int left = 0, temp = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] reversedArrayInPlace(int numbers[]) {
        // 1, 2, 3
        int temp = 0;
        for (int i = 0; i < (numbers.length) / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        return numbers;
    }

    public static int[] reversedArrayNotInPlace(int numbers[]) {
        // 1, 2, 3
        int reversedArray[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        return reversedArray;
    }
}