package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String arr[] = new String[] { "act", "pots", "tops", "cat", "stop", "hat" };
        if (arr.length < 1) {
            System.out.println("Insufficient length of the array");
            System.exit(1);
        }
        List<List<String>> newList = groupAnagrams(arr);

        for (int i = 0; i < newList.size(); i++) {
            System.out.print("[" + newList.get(i) + "" + "]");
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        for (int i = 0; i < strs.length; i++) {
            Arrays.sort(strs[i]);
        }
        Arrays.sort(strs);
        List<String> ansArray = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (hashMap.containsKey(strs[i])) {
                // ansArray[i] = hashMap.get(strs[i]);
            }
            hashMap.put(strs[i], i);

        }
        return new ArrayList<List<String>>();
    }
}
