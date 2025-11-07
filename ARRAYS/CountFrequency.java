package ARRAYS;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 1, 1, 1, 2 };
        System.out.println("Frequency of elements is: " + countFreq(arr));
    }

    public static HashMap<Integer, Integer> countFreq(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        return hashMap;
    }
}
