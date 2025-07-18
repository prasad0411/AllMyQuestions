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
        System.out.println("Answer: " + bruteForce(originalString));
    }

    // TC: O(n) + O(m log m) For putting characters into hashmap, and sorting the
    // list
    // SC: O(n) // hashmap + array list + string builder

    public static String bruteForce(String originalString) {
        char charArray[] = originalString.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < originalString.length(); i++) {
            hashMap.put(charArray[i], hashMap.getOrDefault(charArray[i], 0) + 1);
        }

        List<Character> arrayList = new ArrayList<>(hashMap.keySet());
        Collections.sort(arrayList, (a, b) -> hashMap.get(b) - hashMap.get(a));

        StringBuilder answer = new StringBuilder();
        for (char ch : arrayList) {
            int frequency = hashMap.get(ch);
            for (int i = 0; i < frequency; i++) {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
