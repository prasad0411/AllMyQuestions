package ARRAYS;

import java.util.HashMap;

// Given an array of integers `nums` and an integer target, 
// return the indices of the two numbers such that they add up to the target.
// Each input would have exactly one solution, and you may not use the same element twice.

// Input: nums = [2, 7, 11, 15], target = 9
// Output: [0, 1] 

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 2, 4 };
        if (arr.length < 2) {
            System.out.println("Invalid array size");
            return;
        }
        int target = -1;

        int[] ansArray = betterThanBruteForce(arr, target);
        if (ansArray.length == 0) {
            System.out.println("No 2 elements add up to the target value");
            return;
        }
        System.out.println("Indices of numbers that add up to the target: " + ansArray[0] + " and " + ansArray[1]);
    }

    // TC: O(n^2). Use 2 loops to check sum of all elements against the target
    // SC: O(1). Did not create any new data structure
    public static int[] bruteForce(int arr[], int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] {};
    }

    // TC: O(n). Insert all elements of the array into the hashmap
    // SC: O(n). Create hashmap of the size of the array
    public static int[] betterThanBruteForce(int arr[], int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(target - arr[i]))
                return new int[] { hashMap.get(target - arr[i]), i };
            hashMap.put(arr[i], i);
        }
        return new int[] {};
    }
}