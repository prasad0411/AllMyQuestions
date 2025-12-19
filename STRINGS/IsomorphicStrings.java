package strings;

import java.util.HashMap;

// ALL OCCURENCES OF A CHARACTER MUST BE REPLACED WITH ANOTHER CHARACTER FROM THE OTHER STRING
// ORDER OF ALL CHARACTERS SHOULD BE PRESERVED
// NO 2 CHARACTERS CAN MAP TO THE SAME CHARACTER

// Input: string1: "egg", string2: "add"
// Output: true

// Input: string1: "foo", string2: "bar"
// Output: false

// Input: string1: "paper", string2: "title"
// Output: true

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "foo";
        String s2 = "bar";
        System.out.println("String 1 is: " + s1 + "\nString 2 is: " + s2);
        System.out.println("Are both the strings isomorphic?: " + isIsomorphic(s1, s2));
    }

    // APPROACH: Traverse both the strings simultaneously, and put current character
    // of string 2 for string 1, and do the vice versa.
    // Do this till all characters of a string have been processed

    // TC: O(n) - Linear search across both the strings of same length
    // SC: O(n) - Creating 2 hash maps to store the characters mapping.
    public static boolean isIsomorphic(String s, String t) {
        // Edge case: strings being null
        if (s == null || t == null)
            return false;

        // Edge case: strings of varying lengths
        if (s.length() != t.length())
            return false;

        // Edge case: strings being empty or having just blank spaces
        if (s.isBlank() && t.isBlank())
            return true;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char string1Char = s.charAt(i);
            char string2Char = t.charAt(i);

            if (map1.containsKey(string1Char)) {
                if (map1.get(string1Char) != string2Char)
                    return false;
            } else {
                map1.put(string1Char, string2Char);
            }

            if (map2.containsKey(string2Char)) {
                if (map2.get(string2Char) != string1Char)
                    return false;
            } else {
                map2.put(string2Char, string1Char);
            }
        }

        return true;
    }
}
