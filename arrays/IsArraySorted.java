// GIVEN AN ARRAY, CHECK IF IT IS SORTED OR NO

// Constraints: 
// Array might/ might not be sorted.
// There can be duplicates in the array
// Return a boolean value

// Input: arr = [100,4,200,1,3,2]
// Output: false

// Input: arr = [0,3,71]
// Output: true

public class IsArraySorted {    
    public static void main(String[] args) {
        int originalArray[] = new int[] { 2, 3, 4 };

        System.out.print("Printing the original array:");
        for (int num : originalArray) {
            System.out.print(" " + num);
        }

        System.out.println("\n\nIs the array sorted? (Brute Force): " + bruteForce(originalArray));
        System.out.println("\nIs the array sorted? (Optimal Approach): " + optimalApproach(originalArray));
    }

    // APPROACH: Use 2 loops to traverse i and j (i+1)
    // Compare every element i with all the elements after it in the array
    // TC: O(n*n). Traversing through 2 loops
    // SC: O(1). No new data structure is created.
    static boolean bruteForce(int[] originalArray) {
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                if (originalArray[i] > originalArray[j])
                    return false;
            }
        }

        return true;
    }

    // APPROACH: Use just 1 loop to iterate over the entire array
    // If the array is sorted, then we will only compare the neighbouring elements
    // to check for bigger numbers.
    static boolean optimalApproach(int[] originalArray) {
        // EDGE CASE: When array is empty or has 0 elements
        if (originalArray == null || originalArray.length <= 1)
            return true;

        for (int i = 0; i < originalArray.length - 1; i++) {
            if (originalArray[i] > originalArray[i + 1])
                return false;
        }

        return true;
    }
}
