package strings;

import java.util.Arrays;
import java.util.HashMap;

// CHECK IF STRINGS CONTAIN SAME NUMBER OF CHARACTERS

public class ValidAnagram {
    public static void main(String[] args) {
        String string1 = "abu";
        String string2 = "bc7";

        if (string1.length() != string2.length()) {
            System.out.println("Strings are not anagrams.");
            return;
        } else {
            System.out.println("HashMap Approach => " + sortingApproach(string1, string2));
            System.out.println("Sorting Approach => " + hashMapApproach(string1, string2));
        }
    }

    // TC: O(n). Single traversal through the loop and hashmap comparisons
    // SC: O(n). Two hashmaps storing character frequencies

    public static boolean hashMapApproach(String s1, String s2) {
        HashMap<Character, Integer> hM1 = new HashMap<>();
        HashMap<Character, Integer> hM2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            hM1.put(s1.charAt(i), hM1.getOrDefault(s1.charAt(i), 0) + 1);
            hM2.put(s2.charAt(i), hM2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        return (hM1.equals(hM2));
    }

    // TC: O(n log n). Sorting takes O(n log n) and comparison takes O(n)
    // SC: O(1). Sorting is in-place
    
    public static boolean sortingApproach(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}
