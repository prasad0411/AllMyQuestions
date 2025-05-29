package HASHSETS;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 3, 4 };
        if (optimalApproach(arr) == -1)
            System.out.println("No duplicate number.");
        else
            System.out.println("Duplicate Number is => " + optimalApproach(arr) + ".");
    }

    // TC: O(n). Single pass Hash Map
    // SC: O(n)
    public static int optimalApproach(int arr[]) {
        HashSet<Integer> usedNumbers = new HashSet<>();
        for (int currentNumber : arr) {
            if (!usedNumbers.add(currentNumber))
                return currentNumber;
        }
        return -1;
    }

    // TC: O(n). Single pass Hash Map
    // SC: O(n)
    public static int bruteForceApproach(int arr[]) {
        HashSet<Integer> usedNumbers = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (usedNumbers.contains(arr[i]))
                return arr[i];
            usedNumbers.add(arr[i]);
        }
        return -1;
    }
}
