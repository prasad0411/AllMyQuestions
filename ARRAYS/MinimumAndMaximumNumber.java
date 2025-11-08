package arrays;

import java.util.Arrays;

// AN ARRAY IS GIVEN, NEED TO RETURN THE MINIMUM AND MAXIMUM ELEMENT FROM THE ARRAY  

// Input: [1, 5, 7, -1, 33, 444, 11]  
// Output: Minimum = -1, Maximum = 444  

// Input: [10, 20, 5, 40, 30]  
// Output: Minimum = 5, Maximum = 40 

public class MinimumAndMaximumNumber {
    public static void main(String[] args) {
        int[] array = new int[] {};

        int[] min_max = bruteForce(array);
        System.out.print("Mininum number is: " + min_max[0] + ". Maximum number is: " + min_max[1]);
    }

    public static int[] bruteForce(int[] array) {
        validate(array);
        
        Arrays.sort(array);
        return new int[] { array[0], array[array.length - 1] };
    }

    // Time Complexity: O(n).
    // We are traversing through all elements from the array
    // Space Complexity: O(1).
    // No need to create a new data structure. Just 2 temp variables to store min
    // and max values

    public static int[] optimalApproach(int[] array) {
        validate(array);

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int num : array) {
            if (num < minValue)
                minValue = num;
            if (num > maxValue)
                maxValue = num;
        }

        return new int[] { minValue, maxValue };
    }

    private static void validate(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array size is invalid. Exiting.");
        }

    }
}
