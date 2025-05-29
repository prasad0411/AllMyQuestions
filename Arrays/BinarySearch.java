package ARRAYS;

// A SORTED ARRAY AND A TARGET ELEMENT ARE GIVEN  
// USE BINARY SEARCH TO FIND THE INDEX OF THE TARGET  

// Input: arr = [5, 15, 25, 35, 45, 55, 65], target = 35  
// Output: 3  

// Input: arr = [10, 20, 30, 40, 50, 60, 70], target = 50  
// Output: 4  

public class BinarySearch {
    public static void main(String[] args) {
        int inputArray[] = new int[] { 1, 2, 3, 4, 5 };
        int target = 6;
        System.out.print("Original array is: ");
        for (int number : inputArray)
            System.out.print(number + ", ");
        if (search(inputArray, target) == -1) {
            System.out.println("\nTarget element not found in the array");
            return;
        }
        System.out.println("\nTarget element is found at index " + search(inputArray, target));
    }

    // Time Complexity: O(log n)
    // The search space is reduced by half in each iteration.
    // Space Complexity: O(1)
    // No data structure is used to store anything.

    public static int search(int[] nums, int target) {
        int leftPointer = 0, rightPointer = nums.length-1;

        while (leftPointer <= rightPointer) {
            int middleValueIndex = leftPointer + (rightPointer - leftPointer) / 2;
            if (nums[middleValueIndex] == target)
                return middleValueIndex;
            else if (nums[middleValueIndex] > target)
                rightPointer = middleValueIndex - 1;
            else
                leftPointer = middleValueIndex + 1;
        }
        return -1;
    }
}