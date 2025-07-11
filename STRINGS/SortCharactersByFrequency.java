package STRINGS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// RETURN STRING IN DECREASING ORDER OF THE CHARACTERS, BASED ON THEIR FREQUENCIES
// Input: s = "tree"
// Output: "eert"

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String originalString = "abcccccaaa";
        System.out.println("Answer: " + frequencySort(originalString));
    }

    private static String frequencySort(String originalString) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : originalString.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        List<Character> arrList = new ArrayList<>(hashMap.keySet());
        Collections.sort(arrList, (a, b) -> hashMap.get(b) - hashMap.get(a));

        StringBuilder answer = new StringBuilder();

        for (char ch : arrList) {
            int freq = hashMap.get(ch);
            for (int i = 0; i < freq; i++) {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
