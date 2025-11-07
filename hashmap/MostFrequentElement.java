package hashmap;

import java.util.HashMap;

// Given an array of integers, find the most frequent element in the array.
// If there is a tie (multiple elements have the same frequency), return the element with the smallest value.

// Input: nums = [1, 1, 2, 2, 3]
// Output: 1

// Input: nums = [7, 5, 7, 5, 5]
// Output: 5

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 2, 1, 1, 22 };
        if (array == null || array.length < 1) {
            System.out.println("Array is invalid, exiting.");
            System.exit(1);
        }

        System.out.println("Most frequently occuring element is: " + brute_Force(array));
    }

    public static int brute_Force(int[] nums) {
        int answer = nums[0];
        int maxCounter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int currentCounter = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    currentCounter++;
                if (currentCounter > maxCounter) {
                    maxCounter = currentCounter;
                    answer = nums[j];
                }
            }
        }
        return answer;
    }

    public static int optimal_Approach(int[] array) {
        int answer = array[0];
        int maxCounter = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], hashMap.getOrDefault(array[i], 0) + 1);
            if (hashMap.get(array[i]) == maxCounter) {
                answer = Math.min(answer, array[i]);
            } else if (hashMap.get(array[i]) > maxCounter) {
                maxCounter = hashMap.get(array[i]);
                answer = array[i];
            }
        }
        return answer;
    }
}
