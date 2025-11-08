package arrays;

import java.util.Arrays;

public class MinimumAndMaximumNumber {
    public static void main(String[] args) {
        int[] array = new int[] {1, 10000, 11, -2323};
        
        try {
            int[] result = optimalApproach(array);
            System.out.println("Min: " + result[0] + ", Max: " + result[1]);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Time: O(n log n), Space: O(1)
    public static int[] bruteForce(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        Arrays.sort(array);
        return new int[] { array[0], array[array.length - 1] };
    }

    // Time: O(n), Space: O(1)
    public static int[] optimalApproach(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num < minValue) minValue = num;
            if (num > maxValue) maxValue = num;
        }
        
        return new int[] { minValue, maxValue };
    }
}