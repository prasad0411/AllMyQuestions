package HASHMAPS;

import java.util.HashMap;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int numbers[] = new int[] { 1, 2, 2, 2, 3, 4, 1, 2, 3, 5 };
        // System.out.println("Array Frequency is: " + countryFrequency(numbers));
        int ans[] = new int[2];
        ans = (highestAndLowestFrequency(
                numbers));
        System.out.println("Highest Frquency is: " + ans[0] + " and Lowest Frquency is: " + ans[1]);
    }

    private static int[] highestAndLowestFrequency(int numbers[]) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>(numbers.length);

        for (int num : numbers) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 1;
        int minFreq = Integer.MAX_VALUE;

        for (int num : hashMap.keySet()) {
            if (maxFreq < hashMap.get(num)) {
                maxFreq = hashMap.get(num);
                ans[0] = num;
            }
            if (hashMap.get(num) < minFreq) {
                minFreq = hashMap.get(num);
                ans[1] = num;
            }
        }
        return ans;
    }
}