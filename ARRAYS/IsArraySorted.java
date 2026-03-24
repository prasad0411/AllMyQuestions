// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// Constraints: 
// Array might or might not be sorted.
// Can there be duplicates in the array? 
// I have to return a boolean value

// Restating the problem

// Brute force: have 2 pointers, one starting at the ith index (0), and next pointer as j at i+1 index
// at each iteration, compare i and j 
// TC: O(n *n)
// SC: O(1) no new data structure is used

public class IsArraySorted {
    public static void main(String[] args) {
        int originalArray[] = new int[] { 2, 3, 4 };
        System.out.println("Printing the original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n" + bruteForce(originalArray));
    }

    // check if the array is sorted or no
    private static boolean bruteForce(int[] originalArray) {
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                if (originalArray[i] > originalArray[j])
                    return false;
            }
        }

        return true;
    }
}
