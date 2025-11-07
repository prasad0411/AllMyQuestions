package hashmap;

import java.util.*;

// Given a non-empty array where every element appears twice except for one
// return the single number.

public class SingleNumber {
    public static void main(String[] args) {
        int array[] = new int[] { 1, 1, 2 };
        System.out.println("Single Number is => " + bruteForce(array));
        // System.out.println("Single Number is => " + optimalApproach(array));
    }

    // TC: O(n). Traverse through all the elements of the array
    // SC: O(n). Create Hashmap to store frequency of all elements

    public static int bruteForce(int array[]) {
        int ans = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : array)
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) < 2)
                return key;
        }
        return ans;
    }

    public static int optimalApproach(int[] array) {
        return 0;
    }
}