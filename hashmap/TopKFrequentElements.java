package hashmap;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int array[] = new int[] { 1, 2, 2, 2, 3, 3 };
        int k = 4;

        if (array == null || array.length == 0 || k > array.length) {
            System.err.println("Invalid array. Exiting");
            return;
        }

        Arrays.sort(array);
        int[] answer = topKFrequent(array, k);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (k == 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        if (k > hashMap.size()) {
            System.err.println("Invalid k value. Returning only " + hashMap.size() + " elements");
            k = hashMap.size();
        }

        @SuppressWarnings("unused")
        int arr[][] = new int[][] {};

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());

        list.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey() - b.getKey(); // Ascending Order for same frequency
            }
            return b.getValue() - a.getValue(); // Descending Order by Frequency
        });

        int answer[] = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }
}
